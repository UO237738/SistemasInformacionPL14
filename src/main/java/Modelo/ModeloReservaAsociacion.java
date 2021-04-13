package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Controlador.ControladorReservasAdministracionInstalacion;
import giis.demo.util.Database;

public class ModeloReservaAsociacion {
	private Database db = new Database();
	private ControladorReservasAdministracionInstalacion CRA;
	
	//SQL para obtener la lista de reservas que entran en conflicto con la nueva reserva
	// que se quiere realizar. Tiene que ser aqui porque debe saberse antes de realizar la nueva reserva.
	public static final String SQL_LISTA_RESERVAS="SELECT id_reserva, id_actividad_ id_instalacion, fechaIni, fechaFin"
			+ "hora_ini, hora_fin from reservas where fechaIni<=? AND fechaFin>=? order by fechaIni";
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		return formateador.format(ahora);
	}
	
	//SQL para realizar una nueva reserva
	public void setNuevaReserva() {
		Connection dbConnection=null;
		PreparedStatement preparedStatement = null;
		
		String insertReserva = "INSERT INTO reservas"
				+ "(id_instalacion, id_actividad, fechaIni, fechaFin, hora_ini, hora_fin)"
				+ "VALUES (?,?,?,?,?,?)";
		try {
			dbConnection = db.getConnection();
			preparedStatement = dbConnection.prepareStatement(insertReserva);
			
			preparedStatement.setInt(1, 1);
			preparedStatement.setInt(2, 2);
			preparedStatement.setString(3, "12-04-2021");
			preparedStatement.setString(4, "20-04-2021");
			preparedStatement.setString(5, "17:00");
			preparedStatement.setString(6, "23:00");
		}
		catch(SQLException e) {
			System.out.print(e.getMessage());
		}
		
	}
}
