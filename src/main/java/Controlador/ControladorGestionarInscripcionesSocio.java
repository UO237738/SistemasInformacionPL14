package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Modelo.ModeloGestionarInscripcionesSocio;
import Modelo.ModeloIncripcionesDisplayDTO;
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
		
		VGIS.JBMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraInfromeInscripcion();
			}
		});
		
		VGIS.JBInscribirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ModeloGestionarInscripcionesSocio.esSocio(VGIS.TFDNI.getText())) {
					VGIS.CBActividades.setEnabled(true);
				}
				else
					VGIS.CBActividades.setEnabled(false);
				
				ModeloGestionarInscripcionesSocio.setNuevaReserva(2, ModeloGestionarInscripcionesSocio.ObtenerFechaini(VGIS.CBActividades.getToolTipText()), ModeloGestionarInscripcionesSocio.ObtenerFechafin(VGIS.CBActividades.getToolTipText()), ModeloGestionarInscripcionesSocio.ObteneridActividad(VGIS.CBActividades.getToolTipText()), ModeloGestionarInscripcionesSocio.ObtenerIdInstalacion(VGIS.CBActividades.getToolTipText()), ModeloGestionarInscripcionesSocio.ObtenerIdSocio(VGIS.TFDNI.getText()));
			}
		});
	}
	
	
	public void muestraInfromeInscripcion() {
		ArrayList<ModeloIncripcionesDisplayDTO> list= ModeloGestionarInscripcionesSocio.muestraEstadoInscripciones(VGIS.CBActividades.getToolTipText());
		DefaultTableModel model= (DefaultTableModel)VGIS.JTInscripcion.getModel();

		Object [] row = new Object[6];
		for (int i=0;i<list.size();i++) {

			row[0]=list.get(i).getNumero_plazas_disp();
			row[1]=list.get(i).getFechaInicioSocios();
			row[2]=list.get(i).getFechaFinSocios();

			model.addRow(row);
		}
	}
	
}
