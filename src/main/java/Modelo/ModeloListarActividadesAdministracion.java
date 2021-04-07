package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import giis.demo.util.Database;
import giis.demo.util.Util;

public class ModeloListarActividadesAdministracion {
	
	private static Database basedatos = new Database();
	
	public static ArrayList<ModeloCrearActividadDisplayDTO> listarActividades(Date fechaInicio, Date fechaFin){
		Connection dbConnection=null;
		PreparedStatement preparedStatement=null;

		ArrayList<ModeloCrearActividadDisplayDTO> listaActividades= new ArrayList<>();

		String sql= "SELECT id_instalacion, nombre, aforo, cuota_socio, cuota_no_socio, fechaInicioActividad, fechaFinActividad FROM actividades WHERE fechaInicioActividad>=? AND fechaFinActividad<=?";

		try {
			dbConnection=basedatos.getConnection();
			preparedStatement=dbConnection.prepareStatement(sql);

			String fi= Util.dateToIsoString(fechaInicio);
			String ff= Util.dateToIsoString(fechaFin);

			preparedStatement.setString(1, fi);
			preparedStatement.setString(2, ff);

			ResultSet rs= preparedStatement.executeQuery();

			ModeloCrearActividadDisplayDTO CDdto;
			while (rs.next()) {
				CDdto = new ModeloCrearActividadDisplayDTO(rs.getInt("id_instalacion"), rs.getString("nombre"), rs.getInt("aforo"), rs.getInt("cuota_socio"), rs.getInt("cuota_no_socio"),rs.getString("fechaInicioActividad"),rs.getString("fechaFinActividad"));
				listaActividades.add(CDdto);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaActividades;

	}
	
}

