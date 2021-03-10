package Modelo;

import java.text.SimpleDateFormat;
import java.util.*;

import giis.demo.util.Database;
import giis.demo.util.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ModeloReservaAdministracioninstalación {
	
	private static Database basedatos = new Database();
	
	public static String getFechaActual() {
		Date hoy = new Date();
		SimpleDateFormat formatear = new SimpleDateFormat("yyyy-MM-dd");
		return formatear.format(hoy);
	}
	
	public static int ObtenerIdInstalacion(String nombreInstalacion) {
		String consulta= "SELECT id_instalacion FROM instalaciones WHERE nombre=?";
		List<Object[]>filas=basedatos.executeQueryArray(consulta, nombreInstalacion);
		return (int) filas.get(0)[0];
	}
	

	public static int ConflictoReserva(int idinstalacion, String horaini, String horafin, String fechaini) {
		String consulta="SELECT"
				+" COUNT ( CASE WHEN ?=id_instalacion AND ?=fechaIni AND ?=fechaFin AND"
				+" ((?<=hora_ini AND hora_ini<?) OR (?<hora_fin AND hora_fin<=?)) then 'reservado' end)"
				+" from reservas";
		
		List<Object[]>filas=basedatos.executeQueryArray(consulta,idinstalacion,fechaini,horaini,horafin,horaini,horafin);
		return (int) filas.get(0)[0];
	}
	
	
	
	public static void CrearReserva(int idinstalacion, String horaini, String horafin, String fechaini) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		String nuevaReserva = "Insert into reservas"
				+" id_instalacion, id_actividad, fechaIni, fechaFin, hora_ini, hora_fin"
				+" VALUES"
				+" ?,null,?,?,?,?,?";
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
	
	
	
	public static void CrearResguardo(String instalacion, String dni, String Nombre, String Apellidos, String fecha, String horaini, String horafin){
		try {
			String archivo = "src/test/"+Nombre+".txt";
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
