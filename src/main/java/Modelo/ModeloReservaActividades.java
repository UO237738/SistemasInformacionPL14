package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
	
	public static int CogerIdSocio (String dniSocio) {
		String sql= "SELECT id_socio FROM socios WHERE dni=?";

		List<Object[]>rows=db.executeQueryArray(sql, dniSocio);

		return (int) rows.get(0)[0];
	}
	
	public static void setNuevaReserva(String nombreAct, String idSocio, String h1,String h2) {
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;

		String insertReserva= "INSERT INTO reservas"
				+"(nombre_actividad,id_socio, hora_inicioReserva, hora_finReserva) VALUES "
				+"(?,null,?,?,?,?,?)";
		try {
			dbConnection = db.getConnection();
			preparedStatement = dbConnection.prepareStatement(insertReserva);

			preparedStatement.setString(1, nombreAct);
			preparedStatement.setString(2, idSocio);
			preparedStatement.setString(5, h1);
			preparedStatement.setString(6, h2);

			preparedStatement.executeUpdate();

			dbConnection.close();
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}
}
