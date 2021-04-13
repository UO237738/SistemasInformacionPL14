package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ModeloGestionarInscripcionesSocio;
import Vista.VistaGestionarInscripcionesSocio;

public class ControladorGestionarInscripcionesSocio {
	private VistaGestionarInscripcionesSocio VGIS;
	
	public ControladorGestionarInscripcionesSocio() {
		this.addListenerCGIS();
		this.initView();
	}

	private void initView() {
		
		ModeloGestionarInscripcionesSocio.ObtenerActividades(VGIS.CBActividades);
		
	}

	private void addListenerCGIS() {
		VGIS.CBActividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ModeloGestionarInscripcionesSocio.esSocio(VGIS.TFDNI.getText())) {
					VGIS.CBActividades.setEnabled(true);
				}
				else
					VGIS.CBActividades.setEnabled(false);
			}
		});
		
		
		VGIS.JBInscribirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	
}
