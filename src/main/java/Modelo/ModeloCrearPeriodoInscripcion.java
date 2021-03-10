package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import giis.demo.util.Database;

public class ModeloCrearPeriodoInscripcion {

private static Database db=new Database();
	
	public static void  setPeriodo(ModeloCrearPeriodoInscripcionDisplayDTO PeriodoInscripcion ) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement1= null;

		String insertActividad = "INSERT INTO inscripciones" 
				+"(fechaInicioSocios, fechaFinSocios, fechaFinNoSocios) VALUES "
				+"(?,?,?)";

		try {
			dbConnection = db.getConnection();
			preparedStatement1 = dbConnection.prepareStatement(insertActividad);
				
			
			preparedStatement1.setString(1, PeriodoInscripcion.getIniSocios());
			preparedStatement1.setString(2, PeriodoInscripcion.getFinSocios());
			preparedStatement1.setString(3, PeriodoInscripcion.getFinNoSocios());
			
			preparedStatement1.executeUpdate();
			
			dbConnection.close();
			
			}
		catch(SQLException e){
			System.out.print(e.getMessage());


		}


	}
	
	
	
}
