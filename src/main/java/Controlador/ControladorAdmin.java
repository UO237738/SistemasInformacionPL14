package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.VistaAdmin;
import Vista.VistaCrearActividades;
import Vista.VistaCrearPeriodoInscripcion;
import Vista.VistaInicio;

public class ControladorAdmin {

	private VistaInicio VI;
	private VistaAdmin VA;
	private VistaCrearActividades VCA;
	private VistaCrearPeriodoInscripcion VCPI;
	public ControladorAdmin(VistaAdmin VA) {
		VA = VA;
		this.addListenerVA();
		this.initView();
	}
	
	private void initView() {
		// TODO Auto-generated method stub
		VA.contentPane.setVisible(true);
	}
	private void addListenerVA() {
		// TODO Auto-generated method stub
		VA.bPlanificarActividad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VA.contentPane.setVisible(false);
				VCA.contentPane.setVisible(true);
			}
		});
		
		VA.bCrearPeriodoInscripcion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VA.contentPane.setVisible(false);
				VCPI.contentPane.setVisible(true);
			}
		});
		VA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VA.contentPane.setVisible(false);
				VI.contentPane.setVisible(true);
			}
		});
	}
	
	
	
	
	
}
