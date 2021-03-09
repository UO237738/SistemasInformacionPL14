package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.modelmbean.ModelMBeanOperationInfo;
import javax.swing.event.AncestorListener;

import Modelo.ModeloReservaActividades;
import Vista.VistaReservaActividades;
import giis.demo.util.Util;

public class ControladorReservaActividades {
	private VistaReservaActividades vistaReservaActividades;
	private ModeloReservaActividades modeloReservaActividades;

	/**
	 * Constructor de la clase controlador de ReservaActividades
	 * @param v, VistaReservaActividades
	 */
	public ControladorReservaActividades(VistaReservaActividades v, ModeloReservaActividades m) {
		this.vistaReservaActividades = v;
		this.modeloReservaActividades = m;
		this.addListenerControladorReservaActividades();
		this.initView();
	}

	private void initView() {
		vistaReservaActividades.contentPane.setVisible(true);
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}

	private void addListenerControladorReservaActividades() {
		vistaReservaActividades.comboBoxActividades.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ModeloReservaActividades.ObtenerNombreActividad();
				if(vistaReservaActividades.comboBoxActividades.getSelectedIndex() > 0) {
					int precio = Integer.parseInt(ModeloReservaActividades.ObtenerPrecioReserva((String)vistaReservaActividades.comboBoxActividades.getSelectedItem()));
					int horas = (vistaReservaActividades.comboBoxHasta.getSelectedIndex() - vistaReservaActividades.comboBoxDesde.getSelectedIndex());
					vistaReservaActividades.lblPreciofinal.setText(horas*precio + " €");
					vistaReservaActividades.comboBoxDesde.setEnabled(true);
					vistaReservaActividades.comboBoxHasta.setEnabled(true);
				}
				
				if(!vistaReservaActividades.dateChooser.getToolTipText().isEmpty() && (vistaReservaActividades.comboBoxActividades.getSelectedIndex() > 0) && (!vistaReservaActividades.textFieldDNI.getText().isEmpty())) {
					vistaReservaActividades.btnCrear.setEnabled(true);
				}
				else {
					vistaReservaActividades.btnCancelar.setEnabled(false);
				}
			}
		});
		
		vistaReservaActividades.btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vistaReservaActividades.dispose();
			}
		});
		
		vistaReservaActividades.btnCrear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				Date fechaActual = (Date) Util.isoStringToDate(getFechaActual());
//				Date fechaInicioS = (Date) Util.isoStringToDate(vistaReservaActividades.dateChooser.getToolTipText());
				
				//Aqui me queda mucho por mejorar en el boton crear reserva
				
//				if(fechaInicioS.equals(fechaActual) || (fechaInicioS.after(fechaActual))) {
//					if(ModeloReservaActividades.plazoMaximoReserva((String)vistaReservaActividades.comboBoxActividades.getSelectedItem(), vistaReservaActividades.dateChooser.getToolTipText())) {
//						
//					}
//				}
				
				ModeloReservaActividades.setNuevaReserva((String)vistaReservaActividades.comboBoxActividades.getSelectedItem(), vistaReservaActividades.textFieldDNI.getText(), (String)vistaReservaActividades.comboBoxDesde.getSelectedItem(), (String)vistaReservaActividades.comboBoxHasta.getSelectedItem());
			}
			
		});
	}
}
