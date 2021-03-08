package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import giis.demo.util.Database;

public class ModeloReservaActividades {
	private static Database db = new Database();
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	/**
	 * Método para mostrar el nombre de las actividades y mostrarlas en la JList.
	 * @return
	 */
	public static String ObtenerNombreActividad() {
		String sql = "SELECT nombre FROM actividades";
		
		List<Object[]>rows=db.executeQueryArray(sql);
		
		return (String) rows.get(0)[0];
	}
	
	public static String ObtenerPrecioReserva(String nombreInstalacion) {
		String sql = "SELECT precio FROM instalaciones WHERE nombre=?";
		
		List<Object[]>rows=db.executeQueryArray(sql, nombreInstalacion);
		
		return (String) rows.get(0)[0];
	}
}
