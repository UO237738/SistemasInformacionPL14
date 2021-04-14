package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import giis.demo.util.Database;

public class ModeloReservarTodaUnaActividad {
	
	
	private static Database basedatos = new Database();
	
	
	
	public static ArrayList<ModeloCrearActividadHorarioDisplayDTO> listarActividades(){
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		ArrayList<ModeloCrearActividadHorarioDisplayDTO> listarActividad = new ArrayList<>();

		String consulta = "SELECT * FROM actividades";

		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);
		
			ResultSet rs= preparedStatement.executeQuery();
		
			ModeloCrearActividadHorarioDisplayDTO MCDdto;
			while (rs.next()) {
				MCDdto = new ModeloCrearActividadHorarioDisplayDTO(rs.getInt("id_actividad"),rs.getInt("id_instalacion"), rs.getString("nombre"), rs.getInt("aforo"), rs.getInt("cuota_socio"),rs.getInt("cuota_no_socio"),rs.getString("fechaInicioActividad"),rs.getString("fechaFinActividad"));
				listarActividad.add(MCDdto);
				
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return listarActividad;
	}
	
	
	public ModeloCrearActividadHorarioDisplayDTO listarHorario(ModeloCrearActividadHorarioDisplayDTO actividad){
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		String consulta = "SELECT dia, hora_ini, hora_fin FROM horario INNER JOIN horarioActividad WHERE id_actividad=?";
		ArrayList<ModeloHorarioDisplayDTO> horarios = new ArrayList<>();
		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);
			
			preparedStatement.setInt(1,	actividad.getId_actividad());
			
			ResultSet rs= preparedStatement.executeQuery();
		
			ModeloHorarioDisplayDTO MHD;
			while (rs.next()) {
				MHD = new ModeloHorarioDisplayDTO(rs.getString("dia"),rs.getString("hora_ini"),rs.getString("hora_fin"));
				horarios.add(MHD);
				actividad.setHorarios(horarios);
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return actividad;
	}
	
	public boolean compruebaSocio(String dni) {
		// TODO Auto-generated method stub
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;
		String consulta = "SELECT dni FROM socios WHERE dni=?";
		String identificador="";
		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);
			
			preparedStatement.setString(1,dni);
			
			ResultSet rs= preparedStatement.executeQuery();
		
			while (rs.next()) {
				identificador=rs.getString("dni");
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return !identificador.equals("");
	}
	

	public ArrayList<ModeloSocioVerReservasEntity> obtenerReservasSocio(String dni) {
		// TODO Auto-generated method stub
		
			Connection ConectarBaseDatos = null;
			PreparedStatement preparedStatement = null;

			ArrayList<ModeloSocioVerReservasEntity> listarReservas = new ArrayList<>();

			String consulta = "SELECT id_reserva,fechaIni, fechaFin, id_Actividad, id_instalacion, hora_ini, hora_fin, reservas.id_socio FROM reservas INNER JOIN socios WHERE dni=?";

			try {
				ConectarBaseDatos = basedatos.getConnection();
				preparedStatement = ConectarBaseDatos.prepareStatement(consulta);
				preparedStatement.setString(1,dni);
				ResultSet rs= preparedStatement.executeQuery();
			
				ModeloSocioVerReservasEntity MSRdto;
				while (rs.next()) {
					MSRdto = new ModeloSocioVerReservasEntity(rs.getInt("id_reserva"),rs.getString("fechaIni"),rs.getString("fechaFin"),rs.getInt("id_Actividad"), 
							rs.getInt("id_instalacion"), rs.getString("hora_ini"), rs.getString("hora_fin"),rs.getInt("id_socio"));
					listarReservas.add(MSRdto);
					
				}	
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
			return listarReservas;
		
	}

		public int creaReserva(ModeloSocioVerReservasEntity reservas) {
			// TODO Auto-generated method stub
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int id_reserva=0;
			String nuevaReserva = "Insert into reservas"
					+"(fechaIni, fechaFin,"
					+ "id_actividad, id_instalacion,"
					+ "hora_ini, hora_fin, id_socio)"
					+"VALUES"
					+"(?,?,?,?,?,?,?)";
			try {
				connection = basedatos.getConnection();
				preparedStatement = connection.prepareStatement(nuevaReserva);
				
				preparedStatement.setString(1, reservas.getFechaIni());
				preparedStatement.setString(2, reservas.getFechaFin());
				preparedStatement.setInt(3, reservas.getId_actividad());
				preparedStatement.setInt(4, reservas.getId_instalacion());
				preparedStatement.setString(5, reservas.getHora_ini());
				preparedStatement.setString(6, reservas.getHora_fin());
				preparedStatement.setInt(7, reservas.getId_socio());
				

				int rows = preparedStatement.executeUpdate();
				
				if(rows > 0) {
	                try (ResultSet rs = preparedStatement.getGeneratedKeys()) {
	                    if (rs.next()) {
	                    	id_reserva = rs.getInt(1);
	                        System.out.println(id_reserva);
	                    }
	                } catch (SQLException ex) {
	                    System.out.println(ex.getMessage());
	                }
				}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	        
	        return id_reserva;
		}
}
