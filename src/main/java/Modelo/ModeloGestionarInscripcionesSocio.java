package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JComboBox;

import giis.demo.util.Database;

public class ModeloGestionarInscripcionesSocio {
	private static Database basedatos = new Database();
	
	/*
	public static ArrayList<ModeloCrearActividadDisplayDTO> listarActividades() {
		Connection dbConnection= null;
		PreparedStatement preparedStatement= null;
		ResultSet rs= null;
		
		ArrayList<ModeloCrearActividadDisplayDTO> listarActividades = new ArrayList<>();
		
		String sql= "SELECT * FROM actividades";
		
		try {
			dbConnection= basedatos.getConnection();
			preparedStatement= dbConnection.prepareStatement(sql);
			
			rs=preparedStatement.executeQuery();
			
			ModeloCrearActividadDisplayDTO MCADDTO;
			while (rs.next()) {
				MCADDTO = new ModeloCrearActividadDisplayDTO(rs.getInt("id_instalacion"), rs.getString("nombre"), rs.getInt("aforo"), rs.getInt("cuota_socio"), rs.getInt("cuota_no_socio"),rs.getString("fechaInicioActividad"), rs.getString("fechaFinActividad"), rs.getInt("id_inscripcion"));
				listarActividades.add(MCADDTO);
			}
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return listarActividades;
	}
	*/
	
	
	//Para mostrar lac actividades en el combo box
	public static void ObtenerActividades(JComboBox<String> CBActividades) {
		Connection dbConnection= null;
		PreparedStatement preparedStatement= null;
		ResultSet rs= null;

		String sql= "SELECT nombre FROM actividades ORDER BY nombre ASC";

		try {
			dbConnection= basedatos.getConnection();
			preparedStatement= dbConnection.prepareStatement(sql);

			rs=preparedStatement.executeQuery();

			CBActividades.addItem("Selecione una actividad");
			while(rs.next()) {
				CBActividades.addItem(rs.getString("nombre"));
			}

			dbConnection.close();
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
	
	//Para hacer la reserva
	public static void setNuevaReserva(int idR, String f1, String f2, int idA, int idI, int idS) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;

		String insertReserva= "INSERT INTO reservas"
				+"(id_reserva, fechaIni, fechaFin, id_actividad, id_instalacion, hora_ini, hora_fin, id_socio) VALUES "
				+"(?,?,?,?,?,null,null,?)";
		try {
			dbConnection = basedatos.getConnection();
			preparedStatement = dbConnection.prepareStatement(insertReserva);

			preparedStatement.setInt(1, idR);
			preparedStatement.setString(2, f1);
			preparedStatement.setString(3, f2);
			preparedStatement.setInt(4, idA);
			preparedStatement.setInt(5, idI);
			//preparedStatement.setString(6, h1);
			//preparedStatement.setString(7, h2);
			preparedStatement.setInt(8, idS);

			preparedStatement.executeUpdate();

			dbConnection.close();

		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}


	}
	
	//Para mostrar de cada Actividad fechas de inscripcion y plazas
	public static ArrayList<ModeloIncripcionesDisplayDTO> muestraEstadoInscripciones(String nombreIns){
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;

		ArrayList<ModeloIncripcionesDisplayDTO> informe= new ArrayList<>();

		String sql= "SELECT numero_plazas_disp, fechaInicioSocios,  fechaFinSocios FROM actividades WHERE nombre=? ";

		try {
			dbConnection=basedatos.getConnection();
			preparedStatement=dbConnection.prepareStatement(sql);

			ResultSet rs= preparedStatement.executeQuery();

			ModeloIncripcionesDisplayDTO MIDDTO;
			while (rs.next()) {
				MIDDTO = new ModeloIncripcionesDisplayDTO(rs.getInt("numero_plazas_disp"), rs.getString("fechaInicioSocios"), rs.getString("fechaFinSocios"));
				informe.add(MIDDTO);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return informe;
	}

	
	//Metodos para obetner los datos para introducir en la reserva
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	
	public static String ObtenerFechaini(String nombreInst) {

		String sql= "SELECT fechaInicioActividad FROM actividades WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, nombreInst);

		return (String) rows.get(0)[0];

	}
	
	public static String ObtenerFechafin(String nombreInst) {

		String sql= "SELECT fechaFinActividad FROM actividades WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, nombreInst);

		return (String) rows.get(0)[0];

	}
	
	public static int ObteneridActividad(String nombreInst) {

		String sql= "SELECT id_actividad FROM actividades WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, nombreInst);

		return (int) rows.get(0)[0];

	}
	
	public static int ObtenerIdInstalacion(String nombreInst) {

		String sql= "SELECT id_instalacion FROM instalaciones WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, nombreInst);

		return (int) rows.get(0)[0];

	}
	
	public static int ObtenerIdSocio(String dniSocio) {
		String sql= "SELECT id_socio FROM socios WHERE dni=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, dniSocio);

		return (int) rows.get(0)[0];
	}
	
	public static Boolean esSocio(String dniSocio) {
		String sql= "SELECT id_socio FROM socios WHERE dni=?";
		List<Object[]>rows=basedatos.executeQueryArray(sql, dniSocio);

		if(dniSocio.equals(rows.get(0)[0])) {
			return true;
		}
		else
			return false;
	}
	
}
