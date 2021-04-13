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
	
	public int  setHorarios(ModeloHorarioDisplayDTO horario ) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement1= null;
		System.out.println(horario.getHoraInicio());
		String insertHorario = "INSERT INTO horario" 
				+"(dia, hora_ini, hora_fin)"
				+ "VALUES "
				+"(?,?,?)";
		int id_horario=0;
		try {
			dbConnection = db.getConnection();
			preparedStatement1 = dbConnection.prepareStatement(insertHorario);
			
						
			
			preparedStatement1.setString(1, horario.getDia());
			preparedStatement1.setString(2, horario.getHoraInicio());
			preparedStatement1.setString(3, horario.getHoraFin());

			int rows = preparedStatement1.executeUpdate();

			if (rows > 0) {
				try (ResultSet rs = preparedStatement1.getGeneratedKeys()) {
					if (rs.next()) {
						id_horario = rs.getInt(1);
					}
				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id_horario;
		}

}
