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

	
	public ControladorListarActividadesAdministracion(ModeloListarActividadesAdministracion m, VistaListarActividadesAdministracion v) {
		this.listar = m;
		this.vista = v;
		this.initview();
		this.addListernerCRA();
	}
	
	public void initview() {
		vista.frame.setVisible(true);
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	
	private void addListernerCRA() {
		vista.JBBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vista.JDFechaIni.getToolTipText().isEmpty() && vista.JDFechaFin.getToolTipText().isEmpty()) {
					getListaActividades();
				}
			}	
		});
		
	}
	

	
	
	private void getListaActividades(){
		List<Object[]> actividades = listar.getListaActividades(Util.isoStringToDate(vista.getJDFechaIni()), Util.isoStringToDate(vista.getJDFechaFin()));
		TableModel tmodel = SwingUtil.getTableModelFromPojos(actividades, new String[] {"id_actividad", "nombre", "fechaIniActividad", "aforo", "cuota socio", "cuota no socio"});
		vista.getJTActividades().setModel(tmodel);
		
		vista.getJTActividades().getColumnModel().getColumn(0).setHeaderValue("ID actividad");
		vista.getJTActividades().getColumnModel().getColumn(1).setHeaderValue("Nombre");
		vista.getJTActividades().getColumnModel().getColumn(2).setHeaderValue("Fecha");
		vista.getJTActividades().getColumnModel().getColumn(3).setHeaderValue("Aforo");
		vista.getJTActividades().getColumnModel().getColumn(4).setHeaderValue("Cuota Socio");
		vista.getJTActividades().getColumnModel().getColumn(5).setHeaderValue("cuota No Socio");
	}
	
	
	
}
