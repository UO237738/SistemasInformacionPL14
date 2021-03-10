package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import Modelo.ModeloReservaAdministracioninstalación;
import Vista.VistaReservaadministracionAplicacion;
import giis.demo.util.Util;

public class ControladorReservasAdministracionInstalacion {

	private VistaReservaadministracionAplicacion VRI;
	private ModeloReservaAdministracioninstalación MRAI;
	
	public ControladorReservasAdministracionInstalacion() {
		VRI = new VistaReservaadministracionAplicacion();
		this.addListenerCRA();
		this.initview();
	}

	private void initview() {
		VRI.frame.setVisible(true);
	}
	
	public static String getFechaActual() {
		Date ahora = new Date(0);
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	

	private void addListenerCRA() {
		
		
		VRI.JBReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					CrearReserva();
			}
		});
		
		
		
	}

		
		

	
	public void CrearReserva() {
		int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem());
		String nombreSocio=VRI.TFNombre.getText();
		String apellidosSocio=VRI.TFApellidos.getText();
		ModeloReservaAdministracioninstalación.CrearReserva(idInstalacion,VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
		ModeloReservaAdministracioninstalación.CrearResguardo((String)VRI.CBInstalaciones.getSelectedItem(), VRI.TFDni.getText(),  VRI.JCFechaInico.getToolTipText(), (String)VRI.CBDesde.getSelectedItem(), (String)VRI.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);

	}	
	
	
	
	
	
}
