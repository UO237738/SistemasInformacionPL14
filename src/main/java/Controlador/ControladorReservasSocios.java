package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Modelo.ModeloReservaAdministracioninstalación;
import Modelo.ModeloReservaAsociacion;
import Vista.VistaCrearReservaInstalacionSocio;
import giis.demo.util.Util;

public class ControladorReservasSocios {
	private VistaCrearReservaInstalacionSocio VCRIS;
	private ModeloReservaAsociacion MRA;
	
	
	//Constructor
	public ControladorReservasSocios(ModeloReservaAsociacion m, VistaCrearReservaInstalacionSocio v) {
		this.VCRIS = v;
		this.MRA = m;
		this.addListenerCRA();
		this.initView();
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	public void addListenerCRA() {
		VCRIS.comboBoxInstalaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(VCRIS.comboBoxInstalaciones.getSelectedIndex() > 0) {
					//int precio = Integer.parseInt(Modelo)
					int horas = (VCRIS.comboBoxHoraIni.getSelectedIndex() - VCRIS.comboBoxHoraFin.getSelectedIndex())+1;
					//VCRIS.lblPrecio2.setText(horas*precio+" €");
					VCRIS.comboBoxHoraIni.setEnabled(true);
					VCRIS.comboBoxHoraFin.setEnabled(false);
				}
				else {
					VCRIS.comboBoxHoraIni.setEnabled(false);
					VCRIS.comboBoxHoraFin.setEnabled(false);
				}
				
				if((!VCRIS.dateChooserFechaInicio.getToolTipText().isEmpty()) && (VCRIS.comboBoxInstalaciones.getSelectedIndex()>0)&& (!VCRIS.textFieldDNI.getText().isEmpty())) {
					VCRIS.btnCrear.setEnabled(true);
				}
				else {
					VCRIS.btnCrear.setEnabled(false);
				}
			}
		});
		
		VCRIS.btnCrear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Date fechaActual = Util.isoStringToDate(getFechaActual());
				Date fechaInicioS = Util.isoStringToDate(VCRIS.dateChooserFechaInicio.getToolTipText());
				
				//vamos a suponer que no existe socio
				int idInstalacion = ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VCRIS.comboBoxInstalaciones.getSelectedItem());
				String nombreSocio = ModeloReservaAdministracioninstalación.obtenerNombreSocio(VCRIS.textFieldDNI.getText());
				String apellidosSocio = ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VCRIS.textFieldDNI.getText());
				String[] opciones = {"Añadir a la cuota mensual", "Pagar ahora"};
				int pago = JOptionPane.showOptionDialog(null, "Cómo desea realizar el pago", "Pago", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
				
				if(pago==0) {
					ModeloReservaAdministracioninstalación.CrearReservaM(idInstalacion, (String)VCRIS.comboBoxHoraIni.getSelectedItem(), (String)VCRIS.comboBoxHoraFin.getSelectedItem(), VCRIS.dateChooserFechaInicio.getToolTipText());
					//hacer el precio
					int horas = (VCRIS.comboBoxHoraFin.getSelectedIndex() - VCRIS.comboBoxHoraIni.getSelectedIndex())+1;
					//int precioTotal = precio*horas;
					//String PT = ""+precioTotal;
					ModeloReservaAdministracioninstalación.CrearResguardo(VCRIS.textFieldDNI.getText(), (String)VCRIS.comboBoxInstalaciones.getSelectedItem(), VCRIS.dateChooserFechaInicio.getToolTipText(), (String)VCRIS.comboBoxHoraIni.getSelectedItem(), (String)VCRIS.comboBoxHoraFin.getSelectedItem(), nombreSocio, apellidosSocio);
					JOptionPane.showMessageDialog(null, "Reserva creada con exito","Correcto",JOptionPane.INFORMATION_MESSAGE);
					VCRIS.frame.dispose();
				}
			}
		});
		
		VCRIS.btnCancelar.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				VCRIS.frame.dispose();
			}
		});
	}
	
	public void CreaReserva() {
		int idInstalacion = ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VCRIS.comboBoxInstalaciones.getSelectedItem());
		String idSocio = ModeloReservaAdministracioninstalación.obtenerNombreSocio(VCRIS.textFieldDNI.getText());
		String apellidosSocio = ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VCRIS.textFieldDNI.getText());
		ModeloReservaAdministracioninstalación.CrearReservaM(idInstalacion, (String)VCRIS.comboBoxHoraIni.getSelectedItem(), (String)VCRIS.comboBoxHoraFin.getSelectedItem(), VCRIS.dateChooserFechaInicio.getToolTipText());
		JOptionPane.showMessageDialog(null, "Reserva creada con exito","Correcto",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void initView() {
		ModeloReservaAdministracioninstalación.ObtenerInstalaciones(VCRIS.comboBoxInstalaciones);
		
		VCRIS.getFrameR().setVisible(true);
	}
}
