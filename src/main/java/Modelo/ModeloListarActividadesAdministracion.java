package Modelo;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import giis.demo.util.Database;
import giis.demo.util.Util;

public class ModeloListarActividadesAdministracion {
	
	private static Database basedatos = new Database();
	


	

	public static ArrayList<ModeloCrearActividadDisplayDTO> listarActividades(){
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		ArrayList<ModeloCrearActividadDisplayDTO> listarActividad = new ArrayList<>();

		String consulta = "SELECT id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad FROM actividades";

		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);
		
			ResultSet rs= preparedStatement.executeQuery();
		
			ModeloCrearActividadDisplayDTO MCDdto;
			while (rs.next()) {
				MCDdto = new ModeloCrearActividadDisplayDTO(rs.getInt("id_instalacion"), rs.getString("nombre"), rs.getInt("aforo"), rs.getInt("cuota_socio"),rs.getInt("cuota_no_socio"),rs.getString("fechaInicioActividad"),rs.getString("fechaFinActividad"));
				listarActividad.add(MCDdto);
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return listarActividad;
	}
 

	public static ArrayList<ModeloCrearActividadDisplayDTO> listarActividadesFecha(Date fechaIni, Date fechaFin){
		Connection ConectarBaseDatos = null;
		PreparedStatement preparedStatement = null;

		ArrayList<ModeloCrearActividadDisplayDTO> listarActividad = new ArrayList<>();

		String consulta = "SELECT id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad FROM actividades WHERE fechaInicioActividad<=? AND fechaFinActividad>=?";

		try {
			ConectarBaseDatos = basedatos.getConnection();
			preparedStatement = ConectarBaseDatos.prepareStatement(consulta);

			String fi = Util.dateToIsoString(fechaIni);
			String ff = Util.dateToIsoString(fechaFin);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);
			
			ResultSet rs= preparedStatement.executeQuery();

			ModeloCrearActividadDisplayDTO MCDdto;
			while (rs.next()) {
				MCDdto = new ModeloCrearActividadDisplayDTO(rs.getInt("id_instalacion"), rs.getString("nombre"), rs.getInt("aforo"), rs.getInt("cuota_socio"),rs.getInt("cuota_no_socio"),rs.getString("fechaInicioActividad"),rs.getString("fechaFinActividad"));
				listarActividad.add(MCDdto);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return listarActividad;
	}
		
}

