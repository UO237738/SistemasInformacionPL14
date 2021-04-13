package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.table.TableModel;

import Modelo.ModeloListarActividadesAdministracion;
import Vista.VistaListarActividadesAdministracion;
import giis.demo.util.SwingUtil;
import giis.demo.util.Util;

public class ControladorListarActividadesAdministracion {
	
	private ModeloListarActividadesAdministracion listar;
	private VistaListarActividadesAdministracion vista;

	
	public ControladorListarActividadesAdministracion() {
		vista = new VistaListarActividadesAdministracion();
		this.initview();
		this.addListernerCRA();
	}
	
	public void initview() {
		vista.getFrame().setVisible(true);
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	
	private void addListernerCRA() {
		vista.JBBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getListaActividades();
				}
				
		});
		
	}
	

	
	
	private void getListaActividades(){
		List<Object[]> actividades = ModeloListarActividadesAdministracion.getListaActividades(Util.isoStringToDate(vista.getJDFechaini()), Util.isoStringToDate(vista.getJDFechafin()));
		TableModel tmodel = SwingUtil.getTableModelFromPojos(actividades, new String[] {"id_actividad", "nombre", "fechaIniActividad", "aforo", "cuota socio", "cuota no socio"});
		vista.gettableactividades().setModel(tmodel);
		
		vista.gettableactividades().getColumnModel().getColumn(0).setHeaderValue("ID actividad");
		vista.gettableactividades().getColumnModel().getColumn(1).setHeaderValue("Nombre");
		vista.gettableactividades().getColumnModel().getColumn(2).setHeaderValue("Fecha");
		vista.gettableactividades().getColumnModel().getColumn(3).setHeaderValue("Aforo");
		vista.gettableactividades().getColumnModel().getColumn(4).setHeaderValue("Cuota Socio");
		vista.gettableactividades().getColumnModel().getColumn(5).setHeaderValue("cuota No Socio");
	}
	
	
	
}


