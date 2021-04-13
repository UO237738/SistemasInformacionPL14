package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import giis.demo.util.Database;
import giis.demo.util.Util;

public class ModeloAdministracionContabilidad {

	private static Database basedatos = new Database();
	
	public static ArrayList<ModeloContabilidadDisplayDTO> listarContabilidad(Date fechaIni,Date fechaFin){
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		ArrayList<ModeloContabilidadDisplayDTO> listaContabilidad = new ArrayList<>();

		String consulta = "SELECT id_contabilidad, id_socio, fecha, descripcion, importe, pendiente FROM contabilidad WHERE fecha>=? AND fecha<=? AND pendiente ='pendiente'";

		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);

			String fi = Util.dateToIsoString(fechaIni);
			String ff = Util.dateToIsoString(fechaFin);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);

			ResultSet rs= preparedStatement.executeQuery();

			ModeloContabilidadDisplayDTO MCDdto;
			while (rs.next()) {
				MCDdto = new ModeloContabilidadDisplayDTO(rs.getInt("id_contabilidad"), rs.getInt("id_socio"), rs.getString("fecha"), rs.getString("descripcion"), rs.getInt("importe"),rs.getString("pendiente"));
				listaContabilidad.add(MCDdto);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaContabilidad;
	}
	
	
	public static int CalcularPagado(Date fechaInicio, Date fechaFin) {
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;
		
		ResultSet result = null;

		String consulta = "SELECT importe FROM contabilidad WHERE fecha>=? AND fecha<=? AND pendiente ='pagado'";
		int pagado = 0;
		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);

			String fi = Util.dateToIsoString(fechaInicio);
			String ff = Util.dateToIsoString(fechaFin);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);

			result = preparedStatement.executeQuery();

			while(result.next()) {
				pagado = pagado + result.getInt("importe");
			}
			ConectarBaseDatos.close();
		}
		
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return pagado;
	}
	
	
	public static int CalcularPendiente(Date fechaInicio, Date fechaFin) {
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		ResultSet result = null;

		String consulta = "SELECT importe FROM contabilidad WHERE fecha>=? AND fecha<=? AND pendiente ='pendiente'";
		int pendiente = 0;
		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);

			String fi = Util.dateToIsoString(fechaInicio);
			String ff = Util.dateToIsoString(fechaFin);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);

			result=preparedStatement.executeQuery();

			while(result.next()) {
				pendiente = pendiente + Integer.parseInt(result.getString("importe"));
			}
			ConectarBaseDatos.close();


		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		return pendiente;
	}
	
	
	public static int CalcularTotal(Date fechaInicio, Date fechaFin) {
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		ResultSet result = null;

		String consulta = "SELECT importe FROM contabilidad WHERE fecha>=? AND fecha<=?";
		int total = 0;
		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);

			String fi = Util.dateToIsoString(fechaInicio);
			String ff = Util.dateToIsoString(fechaFin);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);

			result=preparedStatement.executeQuery();

			while(result.next()) {
				total = total + Integer.parseInt(result.getString("importe"));
			}
			ConectarBaseDatos.close();


		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		return total;
	}
	
	
	public static void RealizarCobros(Date fechaInicio,Date fechaFin) {
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		String consulta = "UPDATE contabilidad SET pendiente = 'pagado' WHERE pendiente ='pendiente' AND fecha>=? AND fecha <=?";

		String fi= Util.dateToIsoString(fechaInicio);
		String ff= Util.dateToIsoString(fechaFin);


		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);

			preparedStatement.executeUpdate();

			ConectarBaseDatos.close();
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
}
