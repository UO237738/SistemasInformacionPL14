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
		this.initview();
	}

	private void initview() {
		VRI.contentPane.setVisible(true);
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
			
			
			if ((!VRI.datePickerFechaInicio.getJFormattedTextField().getText().isEmpty())&&(VRA.CBInstalaciones.getSelectedIndex()>0)&&(!VRA.TFieldDni.getText().isEmpty())) {
				VRI.JBReservar.setEnabled(true);
				VRI.JBResguardo.setEnabled(true);
			}
			else {
				VRI.JBReservar.setEnabled(false);
				VRI.JBResguardo.setEnabled(false);
			}
			
	}

	
		
	
		
		
		VRI.CBDesde.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		}
		
		
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
