package Modelo;

import java.sql.Date;
import java.util.List;

import giis.demo.util.Database;

public class ModeloListarActividadesAdministracion {
	
	private Database basedatos = new Database();
	
	//obtenemos la lista de actividades apartir de una fecha dada
	public static final String SQL_ACTIVIDADES = "SELECT id_activiad, nombre, fecha_InicioActiviad, fecha_FinActividad"
			+ "hora_ini, hora_fin, fecha_InicioSocios, fecha_FinSocios, fecha_FinNoSocios, aforo, cuota_socio, cueto_no_socio"
			+ "FROM activiades WHERE (fecha_InicioActividad BETWEEN ? AND ?) order by id_actividad";

	
	public List<Object[]> getListaActividades(java.util.Date fechaini, java.util.Date fechafin){
		String sql = "SELECT id_activiad, nombre, fecha_InicioActiviad, fecha_FinActividad"
				+ "hora_ini, hora_fin, fecha_InicioSocios, fecha_FinSocios, fecha_FinNoSocios, aforo, cuota_socio, cuota_no_socio"
				+ "FROM activiades WHERE (fecha_InicioActividad BETWEEN ? AND ?)  order by id_actividad";
		return basedatos.executeQueryArray(sql, fechaini, fechafin);
	}

	
}
