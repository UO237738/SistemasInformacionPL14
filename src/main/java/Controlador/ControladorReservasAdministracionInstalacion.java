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
			
			
			if ((VRI.CBInstalaciones.getSelectedIndex()>0)&&(!VRI.TFieldDni.getText().isEmpty())) {
				VRI.JButtonReservar.setEnabled(true);
			}
			else {
				VRI.JButtonReservar.setEnabled(false);
			}
			
	

	
		
	
		
		
		VRI.JButtonReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date fechaActual= (Date) Util.isoStringToDate(getFechaActual());
				Date fechaInicioS= (Date) Util.isoStringToDate(VRI.JDFechaIni.getToolTipText());

				if(fechaInicioS.equals(fechaActual)||(fechaInicioS.after(fechaActual))) {
					if(ModeloReservaAdministracioninstalación.plazoMaximoReserva((String)VRI.CBInstalaciones.getSelectedItem(),VRI.JDFechaIni.getToolTipText())) {
						int conflicto=ModeloReservaAdministracioninstalación.ConflictoReserva(ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRI.CBInstalaciones.getSelectedItem()),VRI.JDFechaIni.getToolTipText(),VRI.JDFechaIni.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
						if(conflicto>=1) {
							JOptionPane.showMessageDialog(null, "La instalacion esta ocupada para esa fecha", "Error",JOptionPane.ERROR_MESSAGE);
						}
						else {
							CreaReserva();	
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
			String nombreSocio=ModeloReservaAdministracioninstalación.obtenerNombreSocio(VRI.TFieldDni.getText());
			String apellidosSocio=ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VRI.TFieldDni.getText());
			ModeloReservaAdministracioninstalación.CrearReserva(idInstalacion,VRI.JDFechaIni.getToolTipText(),(String)VRI.CBDesde.getSelectedItem(),(String)VRI.CBHasta.getSelectedItem());
			ModeloReservaAdministracioninstalación.CrearResguardo((String)VRI.CBInstalaciones.getSelectedItem(), VRI.TFieldDni.getText(),  VRI.JDFechaIni.getToolTipText(), (String)VRI.CBDesde.getSelectedItem(), (String)VRI.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);

		}	
	
	
	
	
	
}
