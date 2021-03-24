package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaAdmin;
import Vista.VistaInicio;

public class ControladorAdmin {

	private VistaInicio VI;
	private VistaAdmin VA;
	ControladorCrearPeriodoInscripcion CCPI;
	ControladorCrearActividades CCA;
	ControladorListarActividadesAdministracion CLAA;
	ControladorReservasAdministracionInstalacion CRAI;
	
	
	public ControladorAdmin() {
		VA = new VistaAdmin();
		this.initView();
		this.addListenerVA();
	
	}
	
	private void initView() {
		// TODO Auto-generated method stub
		VA.getFrame().setVisible(true);
	}
	
	private ControladorAdmin getCA() {
		return this;
	}
	
	public void addListenerVA() {
		// TODO Auto-generated method stub
		VA.bPlanificarActividad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VA.getFrame().setVisible(false);
				CCA = new ControladorCrearActividades(getCA());
			}
		});
		
		VA.bCrearPeriodoInscripcion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VA.getFrame().setVisible(false);
				CCPI = new ControladorCrearPeriodoInscripcion();
			}
		});
		
		VA.bListarActOfertadas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VA.getFrame().setVisible(false);
				CRAI = new ControladorReservasAdministracionInstalacion();
			}		
		});
		
		VA.bResInstalacion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VA.getFrame().setVisible(false);
				CLAA = new ControladorListarActividadesAdministracion();
			}	
				
		});
		
		VA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VA.getFrame().setVisible(false);
				VI.contentPane.setVisible(true);
			}
		});
		
	}

	public VistaAdmin getVA() {
		return VA;
	}

	public void setVA(VistaAdmin vA) {
		VA = vA;
	}
	
	
	
	
	
	
}
