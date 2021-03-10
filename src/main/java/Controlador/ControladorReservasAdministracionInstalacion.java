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
				
				int conflicto=ModeloReservaAdministracioninstalación.ConflictoReserva(ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem()),VRI.JCFechaInico.getToolTipText(),VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem());
				if(conflicto>=1) {
					JOptionPane.showMessageDialog(null, "La instalacion esta ocupada para esa fecha", "Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem());
					String nombreSocio=VRI.TFDni.getText();
					String apellidosSocio=VRI.TFDni.getText();
					ModeloReservaAdministracioninstalación.CrearReserva(idInstalacion,VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
					ModeloReservaAdministracioninstalación.CrearResguardo(VRI.TFDni.getText(),(String)VRI.CBInstalaciones.getSelectedItem(),VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(), (String)VRI.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);
				}
			}
		});
		
		
		
	}

		
		

	
	public void CreaReserva() {
		int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem());
		String nombreSocio=VRI.TFNombre.getText();
		String apellidosSocio=VRI.TFApellidos.getText();
		ModeloReservaAdministracioninstalación.CrearReserva(idInstalacion,VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
		ModeloReservaAdministracioninstalación.CrearResguardo((String)VRI.CBInstalaciones.getSelectedItem(), VRI.TFDni.getText(),  VRI.JCFechaInico.getToolTipText(), (String)VRI.CBDesde.getSelectedItem(), (String)VRI.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);

	}	
	
	
	
	
	
}
