package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import giis.demo.util.Database;
import giis.demo.util.Util;

public class ModeloListarActividadesAdministracion {
	
	private static Database basedatos = new Database();
	

	public static List<Object[]> getListaActividades(java.util.Date date, java.util.Date date2){
		String sql = "SELECT id_actividad, id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad, id_inscripcion, id_horario " 
				+ "FROM actividades WHERE ((fechaInicioActividad>=?) AND (fechaFinActividad<=?)) order by nombre";
		return basedatos.executeQueryArray(sql, date, date2);
		
	}
	
	
	

	
}

