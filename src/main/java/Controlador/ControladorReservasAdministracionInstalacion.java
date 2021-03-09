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

		
		VRI.CBInstalaciones.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(VRI.CBInstalaciones.getSelectedIndex()>0) {
					VRI.CBDesde.setEnabled(true);
					VRI.CBHasta.setEnabled(true);
					VRI.JLDesde.setEnabled(true);
					VRI.JLHasta.setEnabled(true);
				}
				else
				{
					VRI.CBDesde.setEnabled(false);
					VRI.CBHasta.setEnabled(false);
					VRI.JLDesde.setEnabled(false);
					VRI.JLHasta.setEnabled(false);
				}
			}
		});
			
			
			if ((VRI.CBInstalaciones.getSelectedIndex()>0)&&(!VRI.TFDni.getText().isEmpty())) {
				VRI.JBReservar.setEnabled(true);
				VRI.JBResguardo.setEnabled(true);
			}
			else {
				VRI.JBReservar.setEnabled(false);
				VRI.JBResguardo.setEnabled(false);
			}
			
	

	
		
	
		
		
		VRI.JBReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date fechaActual= (Date) Util.isoStringToDate(getFechaActual());
				Date fechaInicioS= (Date) Util.isoStringToDate(VRI.JCFechaInico.getToolTipText());

				if(fechaInicioS.equals(fechaActual)||(fechaInicioS.after(fechaActual))) {
					if(ModeloReservaAdministracioninstalación.plazoMaximoReserva((String)VRI.CBInstalaciones.getSelectedItem(),VRI.JCFechaInico.getToolTipText())) {
						int conflicto=ModeloReservaAdministracioninstalación.ConflictoReserva(ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem()),VRI.JCFechaInico.getToolTipText(),VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
						if(conflicto>=1) {
							JOptionPane.showMessageDialog(null, "La instalacion esta ocupada para esa fecha", "Error",JOptionPane.ERROR_MESSAGE);
						}
						else {
							int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem());
							String nombreSocio=ModeloReservaAdministracioninstalación.obtenerNombreSocio(VRI.TFDni.getText());
							String apellidosSocio=ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VRI.TFDni.getText());
								
							ModeloReservaAdministracioninstalación.CrearReserva(idInstalacion,VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
							ModeloReservaAdministracioninstalación.CrearResguardo(VRI.TFDni.getText(),(String)VRI.CBInstalaciones.getSelectedItem(),VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(), (String)VRI.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);
								
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Solo se pude reservar con una antelaciónd e 30 dias","Error",JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Seleccione una fecha psoterior a la actual","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
					
		});	
		
		
	}
	
		public void CreaReserva() {
			int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem());
			String nombreSocio=ModeloReservaAdministracioninstalación.obtenerNombreSocio(VRI.TFDni.getText());
			String apellidosSocio=ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VRI.TFDni.getText());
			ModeloReservaAdministracioninstalación.CrearReserva(idInstalacion,VRI.JCFechaInico.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
			ModeloReservaAdministracioninstalación.CrearResguardo((String)VRI.CBInstalaciones.getSelectedItem(), VRI.TFDni.getText(),  VRI.JCFechaInico.getToolTipText(), (String)VRI.CBDesde.getSelectedItem(), (String)VRI.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);

		}	
	
	
	
	
	
}
