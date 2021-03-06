package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import Modelo.ModeloReservaAdministracioninstalación;
import Vista.VistaReservaInstalacion;

public class ControladorReservasAdministracionInstalacion {

	private VistaReservaInstalacion VRI;
	private ModeloReservaAdministracioninstalación MRAI;
	
	public ControladorReservasAdministracionInstalacion(VistaReservaInstalacion v, ModeloReservaAdministracioninstalación m) {
		this.VRI=v;
		this.MRAI=m;
		this.addListenerCRA();
	}

	private void addListenerCRA() {
		// TODO Auto-generated method stub
		
		VRI.CBInstalaciones.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(VRI.CBInstalaciones.getSelectedIndex()>0) {
					int tiempo = (VRI.CBHasta.getSelectedIndex()-VRI.CBDesde.getSelectedIndex());
				
			}

			
			
		});
	
		
		
		VRI.CBDesde.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		}
		
		
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
