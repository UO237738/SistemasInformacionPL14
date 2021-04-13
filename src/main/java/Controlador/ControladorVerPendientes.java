package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import Modelo.ModeloVerPendientes;
import Modelo.ModeloVerPendientesEntity;
import Vista.VistaSocio;
import Vista.VistaVerPendientes;

public class ControladorVerPendientes {
	VistaVerPendientes VVP;
	ModeloVerPendientes MVP;
	VistaSocio VS;
	
	public ControladorVerPendientes() {
		VVP = new VistaVerPendientes();
		this.initView();
		this.addListener();
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	} 

	private void addListener() {
		VVP.btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VVP.getFrame().setVisible(false);
				VS.getFrame().setVisible(true);
			}
			
		});
		
		VVP.btnMostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String socio = VVP.textFieldDNI.getText();
				mostrarPendientes(socio);
			}
		});
	}
	
	public void mostrarPendientes(String socio) {
		Date factual = new Date();
		
		ArrayList<ModeloVerPendientesEntity> listaPendientes = ModeloVerPendientes.muestraPendientes(socio);
		DefaultTableModel model= (DefaultTableModel)VVP.tableContabilidad.getModel();
		
		Object [] row = new Object[2];
		
		for (int i=0;i<listaPendientes.size();i++) {

			row[0]=listaPendientes.get(i).getId_contabilidad();
			row[1]=listaPendientes.get(i).getPendiente();
			
			model.addRow(row);
		}
		VVP.getTableContabilidad().setModel(model);
	}

	private void initView() {
		// TODO Auto-generated method stub
		VVP.getFrame().setVisible(true);
	}
}
