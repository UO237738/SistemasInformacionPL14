package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import javax.swing.table.DefaultTableModel;

import Modelo.ModeloSocioVerReservas;
import Modelo.ModeloSocioVerReservasEntity;
import Vista.VistaSocio;
import Vista.VistaSocioVerReservas;

import giis.demo.util.*;


public class ControladorSocioVerReservas {
	VistaSocioVerReservas VSVR;
	ModeloSocioVerReservas MSVR;
	Util Util;
	VistaSocio VS;
	public ControladorSocioVerReservas() {
		VSVR=new VistaSocioVerReservas();
		this.initView();
		this.addListener();
	
	}

	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	} 
	private void addListener() {
		// TODO Auto-generated method stub
		VSVR.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VSVR.getFrame().setVisible(false);
				VS.getFrame().setVisible(true);
				
			}
		});
		
		VSVR.bFiltrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
						
						
				String socio=VSVR.tfDNI.getText();
				show_reservas(socio);
				
			}
		});
	}

	public void show_reservas(String socio) {

		Date factual=new Date();
		
		ArrayList<ModeloSocioVerReservasEntity> list= ModeloSocioVerReservas.muestraReservas(socio, factual);
		DefaultTableModel model= (DefaultTableModel)VSVR.table.getModel();

		Object [] row = new Object[8];
		
		
		for (int i=0;i<list.size();i++) {

			row[0]=list.get(i).getId_reserva();
			row[1]=list.get(i).getFechaIni();
			row[2]=list.get(i).getFechaFin();
			row[3]=list.get(i).getId_actividad();
			row[4]=list.get(i).getId_instalacion();
			row[5]=list.get(i).getHora_ini();
			row[6]=list.get(i).getHora_fin();
			row[7]=list.get(i).getId_socio();			

			model.addRow(row);

		}
		VSVR.getTable().setModel(model);
	}
	private void initView() {
		// TODO Auto-generated method stub
		VSVR.getFrame().setVisible(true);
		
		
	}

}