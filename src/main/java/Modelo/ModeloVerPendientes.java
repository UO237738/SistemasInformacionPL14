package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import giis.demo.util.Database;

public class ModeloVerPendientes {

	private static Database db = new Database();
	
	public static ArrayList<ModeloVerPendientesEntity> muestraPendientes(String dni) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;
		
		ArrayList<ModeloVerPendientesEntity> listaPendientes = new ArrayList<>();
		
		String sql = "SELECT id_contabilidad, pendiente FROM contabilidad INNER JOIN socios USING (id_socios) WHERE "
				+ "socios.dni=?";
		
		try {
			dbConnection =db.getConnection();
			
			preparedStatement = dbConnection.prepareStatement(sql);
			
			preparedStatement.setString(1, dni);
			
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return listaPendientes;
	}
}
