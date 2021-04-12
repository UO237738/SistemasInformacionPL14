package Modelo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import giis.demo.util.Database;
import giis.demo.util.Util;

public class ModeloSocioVerReservas {

	private static Database db = new Database();

	/*public static List<ReservaDisplayDTO> getListaReservas(int idSocio, Date fechaInicio, Date fechaFinal) {
		String sql = "SELECT id_reserva, id_instalacion,id_actividad, id_socio, fecha_inicioReserva, fecha_finReserva, "
				+ "hora_inicioReserva, hora_finReserva from reservas where id_socio=? AND "
				+ "((fecha_inicioReserva>=?) AND (fecha_finReserva<=?)) "
				+ "order by id_reserva";
		String fi = Util.dateToIsoString(fechaInicio);
		String ff = Util.dateToIsoString(fechaFinal);
		return db.executeQueryPojo(ReservaDisplayDTO.class, sql, idSocio, fi, ff);
	}*/

	public static ArrayList<ModeloSocioVerReservasEntity> muestraReservas(String dni, Date factual){
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;
		
		ArrayList<ModeloSocioVerReservasEntity> ReservasList= new ArrayList<>();
		
		/*String sql = "SELECT id_reserva, id_instalacion,id_actividad, id_socio, fecha_inicioReserva, fecha_finReserva, "
				+ "hora_inicioReserva, hora_finReserva from reservas where id_socio=? AND "
				+ "((fecha_inicioReserva>=?) AND (fecha_finReserva<=?)) "
				+ "order by id_reserva"; */
		String sql = "SELECT id_reserva, fechaIni, fechaFin, id_actividad, id_instalacion, hora_ini, hora_fin,\r\n" + 
				"id_socio FROM reservas INNER JOIN socios USING (id_socio) WHERE socios.dni=? order by fechaIni";
		
		try {
			dbConnection =db.getConnection();
			
			preparedStatement = dbConnection.prepareStatement(sql);

			
			preparedStatement.setString(1, dni);
			

			
			ResultSet rs= preparedStatement.executeQuery();
			

			ModeloSocioVerReservasEntity RDdto;
			while (rs.next()) {
				
				String fird = rs.getString("fechaIni");
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date fini = (Date) sdf.parse(fird);
				
				
				Calendar calInicio = Calendar.getInstance();
				Calendar calFin = Calendar.getInstance();
				Calendar calReserva=Calendar.getInstance();				
				calReserva.set(Integer.parseInt(fini.getYear()+""), Integer.parseInt(fini.getMonth()+""), Integer.parseInt(fini.getDay()+""),0,0,0);
				calInicio.set(Integer.parseInt(factual.getYear()+""), Integer.parseInt(factual.getMonth()+""), 1,0,0,0);
				calFin.set(Integer.parseInt(factual.getYear()+""), Integer.parseInt(factual.getMonth()+"")+1, 1,0,0,0);
				calFin.add(Calendar.DATE, -1);
				//aca deberia setearle el mes y el año al metodo del calFin para obtenerlo	
				Date fechaInicio = calInicio.getTime();
				
				Date fechaFin = calFin.getTime();
				Date fechaReserva= calReserva.getTime();
				System.out.println("fecha actividad " + fechaReserva);
				System.out.println("fecha de inicio " + fechaInicio);
				System.out.println("fecha de fin " + fechaFin);
				
				if (fechaReserva.after(fechaInicio) && fechaReserva.before(fechaFin)) {
					RDdto= new ModeloSocioVerReservasEntity(
							rs.getInt("id_reserva"),rs.getString("fechaIni"),rs.getString("fechaFin"),
							rs.getInt("id_actividad"),rs.getInt("id_instalacion"),rs.getString("hora_ini"),rs.getString("hora_fin"),rs.getInt("id_socio"));
					
					ReservasList.add(RDdto);
				}
				
				
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return ReservasList;
	}
	
//	public static String ObtenerNombre(String socio) {
//		String sql = "SELECT nombre from socios WHERE ?=dni";
//		
//		List<Object[]>rows=db.executeQueryArray(sql,socio,socio);
//
//		return (String) rows.get(0)[0];
//	}
//	
//	public static String obtenerApellidos(String socio) {
//		String sql = "SELECT apellidos from socios WHERE ?=dni";
//		
//		List<Object[]>rows=db.executeQueryArray(sql,socio,socio);
//
//		return (String) rows.get(0)[0];
//	}
	
	




//	public static int existeSocio(String dniSocio) {
//		String sql="SELECT"
//				+" COUNT ( CASE WHEN ?=dni then 'existe' end)"
//				+" from socios";
//
//		List<Object[]>rows=db.executeQueryArray(sql, dniSocio, dniSocio);
//
//		return (int) rows.get(0)[0];
//	}

}
