package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;

import giis.demo.util.Database;
import Controlador.ControladorCrearActividades;

public class ModeloCrearActividades {
	
	private static Database db=new Database();
	
	public static void  setNuevaActividad(ModeloCrearActividadDisplayDTO actividad ) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement1= null;

		String insertActividad = "INSERT INTO actividades" 
				+"(id_actividad, id_instalacion, nombre, aforo,"
				+ "cuota_socio, cuota_no_socio,"
				+ "fechaInicioActividad, fechaFinActividad,"
				+ "id_inscripcion, id_horario) VALUES "
				+"(?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = db.getConnection();
			preparedStatement1 = dbConnection.prepareStatement(insertActividad);
				
			preparedStatement1.setInt(1, actividad.getId_actividad());
			preparedStatement1.setInt(2, actividad.getId_instalacion());
			preparedStatement1.setString(3, actividad.getNombre());
			preparedStatement1.setInt(4, actividad.getAforo());
			preparedStatement1.setInt(5, actividad.getCuota_socio());	
			preparedStatement1.setInt(6, actividad.getCuota_no_socio());
			preparedStatement1.setString(7, actividad.getFechaInicioActividad());	
			preparedStatement1.setString(8, actividad.getFechaFinActividad());
			preparedStatement1.setInt(9, actividad.getId_inscripcion());
			preparedStatement1.setInt(10, actividad.getId_horario());

			preparedStatement1.executeUpdate();
			
			dbConnection.close();
			
			}
		catch(SQLException e){
			System.out.print(e.getMessage());


		}


	}

	public static void cogerInstalaciones(JComboBox<String> cbInstalacion) {
		// TODO Auto-generated method stub
		Connection dbConnection= null;
		PreparedStatement preparedStatement= null;
		ResultSet result= null;

		String sql= "SELECT nombre FROM instalaciones ORDER BY nombre ASC";

		try {
			dbConnection= db.getConnection();
			preparedStatement= dbConnection.prepareStatement(sql);
			result=preparedStatement.executeQuery();

			cbInstalacion.addItem("Selecione una instalacion");
			while(result.next()) {
				cbInstalacion.addItem(result.getString("nombre"));
			}
				
			dbConnection.close();
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
	}

	public static void cogerActividades(JComboBox<String> cbActividad) {
		// TODO Auto-generated method stub
			Connection dbConnection= null;
			PreparedStatement preparedStatement= null;
			ResultSet result= null;

			String sql= "SELECT nombre FROM actividades ORDER BY nombre ASC";

			try {
				dbConnection= db.getConnection();
				preparedStatement= dbConnection.prepareStatement(sql);
				result=preparedStatement.executeQuery();

				cbActividad.addItem("Selecione una actividad");
				while(result.next()) {
					cbActividad.addItem(result.getString("nombre"));
				}
						
					dbConnection.close();
			}
			catch (SQLException e) {
				System.out.print(e.getMessage());
			}
	}

	public static void cogerPeriodos(JComboBox<String> cbPeriodoInscripcion) {
		// TODO Auto-generated method stub
		Connection dbConnection= null;
		PreparedStatement preparedStatement= null;
		ResultSet result= null;

		String sql= "SELECT id_inscripcion FROM inscripciones";
		
		try {
			dbConnection= db.getConnection();
			preparedStatement= dbConnection.prepareStatement(sql);
			result=preparedStatement.executeQuery();

			cbPeriodoInscripcion.addItem("Selecione un periodo inscripción");
			while(result.next()) {
				cbPeriodoInscripcion.addItem(result.getString("id_inscripcion"));
			}
					
				dbConnection.close();
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}

}
