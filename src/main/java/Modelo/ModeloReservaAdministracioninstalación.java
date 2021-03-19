package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
//import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JComboBox;

import giis.demo.util.Database;
import giis.demo.util.Util;


public class ModeloReservaAdministracioninstalación {
	
	private static Database basedatos = new Database();
	
	public static String obtenerNombreSocio(String dniSocio) {
		String sql= "SELECT nombre FROM socios WHERE dni=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, dniSocio);

		return (String) rows.get(0)[0];
	}

	public static String obtenerApellidosSocio(String dniSocio) {
		String sql= "SELECT apellidos FROM socios WHERE dni=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, dniSocio);

		return (String) rows.get(0)[0];
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}

	public static int ObtenerIdInstalacion(String nombreInstalacion) {

		String sql= "SELECT id_instalacion FROM instalaciones WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, nombreInstalacion);

		return (int) rows.get(0)[0];

	}
	
	
	public static boolean comprobarPlazoMaximo(String nombreInstalacion,String fecha) {

		String sql="SELECT plazo_maximo_reserva FROM instalaciones WHERE nombre=?";

		List<Object[]>rows=basedatos.executeQueryArray(sql, nombreInstalacion);

		int dias= (int) rows.get(0)[0];
		Date fechaSelecion=Util.isoStringToDate(fecha);
		Date fechaaActual=Util.isoStringToDate(getFechaActual());

		Date nuevaFecha = new Date();

		Calendar cal = Calendar.getInstance(); 
		cal.setTime(fechaaActual); 
		cal.add(Calendar.DATE, dias);
		nuevaFecha = cal.getTime();

		System.out.println(nuevaFecha);

		if(fechaSelecion.after(nuevaFecha)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void ObtenerInstalaciones(JComboBox<String> CBInstalaciones) {
		Connection dbConnection= null;
		PreparedStatement preparedStatement= null;
		ResultSet result= null;

		String sql= "SELECT nombre FROM instalaciones ORDER BY nombre ASC";

		try {
			dbConnection= basedatos.getConnection();
			preparedStatement= dbConnection.prepareStatement(sql);

			result=preparedStatement.executeQuery();

			CBInstalaciones.addItem("Selecione una instalacion");
			while(result.next()) {
				CBInstalaciones.addItem(result.getString("nombre"));
			}

			dbConnection.close();
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static int comprobarConflictoReservas(int idInstalacion,String fechaInicio, String fechafin, String horaInicio, String horaCierre) {

		/*String sql="SELECT"
				+" COUNT ( CASE WHEN ?=id_instalacion AND ?=fecha_inicioReserva AND ?=fecha_finReserva AND"
				+" ((hora_inicioReserva BETWEEN ? AND ?) OR (hora_finReserva BETWEEN ? and ?)) then 'ocupado' end)"
				+" from reservas";*/

		String sql="SELECT"
				+" COUNT ( CASE WHEN ?=id_instalacion AND ?=fechaIni AND ?=fechaFin AND"
				+" ((hora_ini<=? AND ?<hora_fin) OR (hora_ini<? AND ?<=hora_fin)) then 'ocupado' end)"
				+" from reservas";


		//String fi=Util.dateToIsoString(fechaInicio);
		//String fc=Util.dateToIsoString(fechafin);


		List<Object[]>rows=basedatos.executeQueryArray(sql, idInstalacion,fechaInicio,fechafin,horaInicio,horaInicio,horaCierre,horaCierre);

		return (int) rows.get(0)[0];

	}

	
	
	
	public static void CrearReservaM(int idinstalacion, String horaini, String horafin, String fechaini) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		String nuevaReserva = "Insert into Reservas"
				+"id_instlacion, id_actividad, id_socio, fecha_inicoReserva, fecha_finReserva, hora_inicoReserva, hora_finReserva"
				+"VALUES"
				+"?,null,?,?,?,?,?";
		try {
			connection = basedatos.getConnection();
			preparedStatement = connection.prepareStatement(nuevaReserva);
			
			preparedStatement.setInt(1, idinstalacion);
			preparedStatement.setString(2, fechaini);
			preparedStatement.setString(3, fechaini);
			preparedStatement.setString(4, horaini);
			preparedStatement.setString(5, horafin);

			preparedStatement.executeUpdate();

			connection.close();
		}
		
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
	
	
	public static void CrearResguardo(String dni,String instalacion, String fecha, String horaini, String horafin, String Nombre, String apellidos){
		try {
			String archivo = "src/test/resources/"+dni+".txt";
			File nuevoresguardo = new File(archivo);
			
			if(nuevoresguardo.exists()) {
				nuevoresguardo.delete();
				
				FileWriter resguardo = new FileWriter(nuevoresguardo, true);
				resguardo.write("Se ha reservado la siguiente instalación:"+instalacion+"\n");
				resguardo.write("De: "+horaini+" a "+horafin+" el dia "+fecha+"\n");
				resguardo.write("A nombre de: "+Nombre+" con DNI: "+dni);
				resguardo.close();
			}
			else {
				FileWriter resguardo = new FileWriter(archivo, true);
				resguardo.write("Se ha reservado la siguiente instalación:"+instalacion+"\n");
				resguardo.write("De: "+horaini+" a "+horafin+" el dia "+fecha+"\n");
				resguardo.write("A nombre de: "+Nombre+" con DNI: "+dni);
				resguardo.close();
			}
			
		}
		catch(IOException e) {
			System.out.print(e.getMessage());
		}
		
	}

	

	
	
	
}
