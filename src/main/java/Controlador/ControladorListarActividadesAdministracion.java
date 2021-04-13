package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import Modelo.ModeloCrearActividadDisplayDTO;
import Modelo.ModeloListarActividadesAdministracion;
import Vista.VistaListarActividadesAdministracion;
import giis.demo.util.SwingUtil;
import giis.demo.util.Util;

public class ControladorListarActividadesAdministracion {
	
	private VistaListarActividadesAdministracion vista;

	
	public ControladorListarActividadesAdministracion() {
		vista = new VistaListarActividadesAdministracion();
		this.initview();
		this.addListernerCRA();
	}
	
	public void initview() {
		vista.getFrame().setVisible(true);
		//mostrarActividades();
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	public  void reiniciarTabla(){
		DefaultTableModel modelo = (DefaultTableModel) vista.JTActividades.getModel();
		while(modelo.getRowCount()>0)modelo.removeRow(0);
	}
	
	
	private void addListernerCRA() {
		vista.JBBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciarTabla();
				mostrarActividadesFecha();
				}
				
		});
		
	}
	
	
	public void mostrarActividades() {
		ArrayList<ModeloCrearActividadDisplayDTO> list= ModeloListarActividadesAdministracion.listarActividades();
		DefaultTableModel model= (DefaultTableModel)vista.JTActividades.getModel();

		Object [] row = new Object[7];
		for (int i=0;i<list.size();i++) {
			row[0]=list.get(i).getId_instalacion();
			row[1]=list.get(i).getNombre();
			row[2]=list.get(i).getAforo();
			row[3]=list.get(i).getCuota_socio();
			row[4]=list.get(i).getCuota_no_socio();
			row[5]=list.get(i).getFechaInicioActividad();
			row[6]=list.get(i).getFechaFinActividad();

			model.addRow(row);
		}
	}
	
	
	public void mostrarActividadesFecha() {
		Date fi = Util.isoStringToDate(vista.JDFechaini.getJFormattedTextField().getText());
		Date ff = Util.isoStringToDate(vista.JDFechafin.getJFormattedTextField().getText());

		ArrayList<ModeloCrearActividadDisplayDTO> list= ModeloListarActividadesAdministracion.listarActividadesFecha(fi, ff);
		DefaultTableModel model= (DefaultTableModel)vista.JTActividades.getModel();

		Object [] row = new Object[7];
		for (int i=0;i<list.size();i++) {
			row[0]=list.get(i).getId_instalacion();
			row[1]=list.get(i).getNombre();
			row[2]=list.get(i).getAforo();
			row[3]=list.get(i).getCuota_socio();
			row[4]=list.get(i).getCuota_no_socio();
			row[5]=list.get(i).getFechaInicioActividad();
			row[6]=list.get(i).getFechaFinActividad();

			model.addRow(row);
		}
	}
	
	
	
	
	
}


