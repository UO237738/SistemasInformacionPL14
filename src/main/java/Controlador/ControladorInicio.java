package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Vista.VistaInicio;

public class ControladorInicio {
	
	
	private VistaInicio VI;
	ControladorAdmin CA;
	ControladorSocio CS;

	public ControladorInicio() {
		
		
		VI = new VistaInicio();
		this.initView();
		this.addListener();
	
	}
	
	
	public void initView() {
		VI.contentPane.setVisible(true);
	}

	
	public void addListener() {
		// TODO Auto-generated method stub
		VI.bAdministracion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.setVisible(false);
				CA = new ControladorAdmin();
				
			
			}
		});
		
		
		/*VI.bNoSocios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.contentPane.setVisible(false);
				VnS.contentPane.setVisible(true);
			}
		});*/
		VI.bSocios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.setVisible(false);
				CS = new ControladorSocio();
			}
		});
		
		VI.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.contentPane.setVisible(false);
				
			}
		});
	}

	public VistaInicio getVI() {
		return VI;
	}

	public void setVI(VistaInicio vI) {
		VI = vI;
	}
	
	
	
}
