package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.management.modelmbean.ModelMBeanOperationInfo;
import javax.swing.event.AncestorListener;

import Modelo.ModeloReservaActividades;
import Vista.VistaReservaActividades;

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

	private void addListenerControladorReservaActividades() {
		vistaReservaActividades.comboBoxActividades.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
		
	}
}
