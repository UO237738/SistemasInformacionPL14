package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;

import giis.demo.util.Database;
import Controlador.ControladorCrearHorario;

public class ModeloCrearHorario {

private static Database db=new Database();
	
	public static void  setNuevoHorario(ModeloHorarioDisplayDTO horario ) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement1= null;

		String insertHorario = "INSERT INTO horario" 
				+"(id_horario, dia, horaini, horafin)"
				+ "VALUES "
				+"(?,?,?,?)";

		try {
			dbConnection = db.getConnection();
			preparedStatement1 = dbConnection.prepareStatement(insertHorario);
				
			preparedStatement1.setInt(1, horario.getId_horario());
			preparedStatement1.setString(2, horario.getDia());
			preparedStatement1.setString(3, horario.getHoraInicio());
			preparedStatement1.setString(4, horario.getHoraFin());

			preparedStatement1.executeUpdate();
			
			dbConnection.close();
			
			}
		catch(SQLException e){
			System.out.print(e.getMessage());


		}


	}
}
