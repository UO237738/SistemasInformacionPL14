package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaAdmin;
import Vista.VistaInicio;
import Vista.VistaSocio;

public class ControladorSocio {

	private VistaInicio VI;
	VistaSocio VS;
	ControladorInicio CI;
	ControladorSocioVerReservas CSVR;
	ControladorGestionarInscripcionesSocio CGIS;
	
	public ControladorSocio() {
		VS = new VistaSocio();
		this.initView();
		this.addListener();
	
	}
	

	private void initView() {
		// TODO Auto-generated method stub
		VS.getFrame().setVisible(true);
	}
	
	private void addListener() {
		// TODO Auto-generated method stub		
		
		VS.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VS.getFrame().setVisible(false);
				VI.contentPane.setVisible(true);
			}
		});
		
		VS.bVerReservas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VS.getFrame().setVisible(false);
				CSVR = new ControladorSocioVerReservas();
			}
		});
		
		VS.bInscripcionEnActividades.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VS.getFrame().setVisible(false);
				CGIS = new ControladorGestionarInscripcionesSocio();
			}
		});
		
	}
}
