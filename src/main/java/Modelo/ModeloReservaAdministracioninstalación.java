package Modelo;

import java.text.SimpleDateFormat;
import java.util.*;

import giis.demo.util.Database;

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
	
	public static int tiempoMaximoReserva(String instalacion) {
		String consulta="SELECT tiempo_maximo FROM instlaciones WHERE nombre=?";
		List<Object[]>filas=basedatos.executeQueryArray(consulta, instalacion);
		return (int) filas.get(0)[0];
	}
	
	public static int ConflictoReserva(int idinstalacion, String horaini, String horafin, String fechaini, String fechafin) {
		String consulta="SELECT"
				+"Count ( CASE when ?=id_instalcion AND ?=fecha_inicioReserva AND ?=fecha_finReserva"
				+ "((?<=hora_inicioReserva AND hora_inicoReerva>?) OR (?>hora_finReserva AND hora_finReserva<=?)) then 'reservado' end"
				+ "form RESERVAS";
			
		List<Object[]>filas=basedatos.executeQueryArray(consulta,idinstalacion,horaini,horafin,fechaini,fechafin);
		return (int) filas.get(0)[0];
	}
	
	
	
	public static void CrearReserva(int idinstalacion, int idsocio, String horaini, String horafin, String fechaini, String fechafin) {
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
			preparedStatement.setInt(2, idsocio);
			preparedStatement.setString(3, fechaini);
			preparedStatement.setString(4, fechafin);
			preparedStatement.setString(5, horaini);
			preparedStatement.setString(6, horafin);

			preparedStatement.executeUpdate();

			connection.close();
		}
		
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
	
	
	public static void CrearResguardo(String instalacion, String dni, String Nombre, String fecha, String horaini, String horafin){
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
