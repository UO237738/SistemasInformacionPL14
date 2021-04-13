package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ModeloCrearActividades;
import Vista.VistaAdmin;
import Vista.VistaReservarTodaUnaActividad;

public class ControladorReservarTodaUnaActividad {

	VistaReservarTodaUnaActividad VRTUA;
	ControladorAdmin CA;
	VistaAdmin VA;
	
	
	public ControladorReservarTodaUnaActividad() {
		VRTUA= new VistaReservarTodaUnaActividad();
		initView();
		addListener();
	}
	private void initView() {
		// TODO Auto-generated method stub
		VRTUA.getFrame().setVisible(true);
		ModeloCrearActividades.cogerActividades(VRTUA.cbActividad);
	}

	private void addListener() {
		// TODO Auto-generated method stub
		VRTUA.cbActividad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = (String) VRTUA.cbActividad.getSelectedItem();
			
				if (text.length()!=23) {
					VRTUA.bRealizarReserva.setEnabled(true);
				}
				else {VRTUA.bRealizarReserva.setEnabled(false);}
			}
		});
		
		VRTUA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VRTUA.getFrame().setVisible(false);
				VA.getFrame().setVisible(true);
			}
		});
		
		VRTUA.bRealizarReserva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VRTUA.getFrame().setVisible(false);
				VA.getFrame().setVisible(true);
				crearReservaTodaUnaActividad();
			}
		});
		
		
	}
	protected void crearReservaTodaUnaActividad() {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
}
