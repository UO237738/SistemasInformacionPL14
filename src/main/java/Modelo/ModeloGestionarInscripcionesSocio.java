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
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	public static int ObtenerIdSocio(String dniSocio) {
		String sql= "SELECT id_socio FROM socios WHERE dni=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, dniSocio);

		return (int) rows.get(0)[0];
	}
	
	public static int ObtenerIdInstalacion(JComboBox<String> CBActividades) {

		String sql= "SELECT id_instalacion FROM instalaciones WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, CBActividades);

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
