package Modelo;

import java.util.List;

import giis.demo.util.Database;

public class ModeloListarActividadesAdministracion {
	
	private static Database basedatos = new Database();
	

	
	
	public static List<Object[]> getListaActividades(String fechaini, String fechafin){
		String sql = "SELECT id_actividad, nombre, fechaInicioActividad, fechaFinActividad,"
				+ "aforo, cuota_socio, cuota_no_socio "
				+ "FROM actividades WHERE (fechaInicioActividad BETWEEN ? AND ?)  order by id_actividad";
		
		return basedatos.executeQueryArray(sql, fechaini, fechafin);
	}

	
}
