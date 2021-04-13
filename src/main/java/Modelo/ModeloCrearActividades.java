package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JComboBox;

import giis.demo.util.Database;

import Controlador.ControladorCrearActividades;

public class ModeloCrearActividades {
	
	private int idHorario;
	private int idActividad;
	private static Database db=new Database();
	
	public int setNuevaActividad(ModeloCrearActividadDisplayDTO actividad ) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement1= null;
		idActividad=0;
		String insertActividad = "INSERT INTO actividades" 
				+"(id_instalacion, nombre, aforo,"
				+ "cuota_socio, cuota_no_socio,"
				+ "fechaInicioActividad, fechaFinActividad,"
				+ "id_inscripcion) VALUES "
				+"(?,?,?,?,?,?,?,?)";

		try {
			dbConnection = db.getConnection();
			preparedStatement1 = dbConnection.prepareStatement(insertActividad);
				
			preparedStatement1.setInt(1, actividad.getId_instalacion());
			preparedStatement1.setString(2, actividad.getNombre());
			preparedStatement1.setInt(3, actividad.getAforo());
			preparedStatement1.setInt(4, actividad.getCuota_socio());	
			preparedStatement1.setInt(5, actividad.getCuota_no_socio());
			preparedStatement1.setString(6, actividad.getFechaInicioActividad());	
			preparedStatement1.setString(7, actividad.getFechaFinActividad());
			preparedStatement1.setInt(8, actividad.getId_inscripcion());
			

			
			
			int rows = preparedStatement1.executeUpdate();
			
			if(rows > 0) {
                try (ResultSet rs = preparedStatement1.getGeneratedKeys()) {
                    if (rs.next()) {
                        idActividad = rs.getInt(1);
                        System.out.println(idActividad);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
        return idActividad;
	}



	
	public void setHorarioActividad(int idHorario,int idActividad) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;
		
		String insertJornada = "INSERT INTO horarioActividad (id_Horario, id_Actividad)"
				+ "VALUES (?, ?)";
		
		try {
			dbConnection=db.getConnection();
			preparedStatement=dbConnection.prepareStatement(insertJornada);

			preparedStatement.setInt(1,	idHorario);
			preparedStatement.setInt(2, idActividad);
			
			preparedStatement.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
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


	public static ArrayList<ModeloCrearPeriodoInscripcionDisplayDTO> cogerPeriodos() {
		// TODO Auto-generated method stub
		Connection dbConnection= null;
		PreparedStatement preparedStatement= null;
		ResultSet result= null;
		ArrayList<ModeloCrearPeriodoInscripcionDisplayDTO> periodos = new ArrayList<ModeloCrearPeriodoInscripcionDisplayDTO>(); 
		String sql= "SELECT * FROM inscripciones";
		
		try {
			dbConnection=db.getConnection();
			preparedStatement=dbConnection.prepareStatement(sql);

			ResultSet rs= preparedStatement.executeQuery();

			ModeloCrearPeriodoInscripcionDisplayDTO periodo;
			while (rs.next()) {
				periodo = new ModeloCrearPeriodoInscripcionDisplayDTO (rs.getInt("id_inscripcion"),
						rs.getString("Nombre"),rs.getString("fechaInicioSocios"),
						rs.getString("fechaFinSocios"),rs.getString("fechaFinNoSocios"));
				periodos.add(periodo);
			}
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	return periodos;
	}
	

	
}
