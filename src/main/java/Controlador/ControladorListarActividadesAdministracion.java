package Controlador;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.TableModel;

import Modelo.ModeloListarActividadesAdministracion;
import Vista.VistaVisualizarActividades;
import giis.demo.util.SwingUtil;
import giis.demo.util.Util;

public class ControladorListarActividadesAdministracion {
	
	private ModeloListarActividadesAdministracion listar;
	private VistaVisualizarActividades vista;
	private JFrame inFrame;
	
	public ControladorListarActividadesAdministracion(ModeloListarActividadesAdministracion m, VistaVisualizarActividades v) {
		this.listar = m;
		this.vista = v;
	}
	
	public ControladorListarActividadesAdministracion(ModeloListarActividadesAdministracion m, VistaVisualizarActividades v, JFrame JF) {
		this.listar = m;
		this.vista = v;
		this.inFrame = JF;
	}
	

	
	
	private void getListaActividades(){
		List<Object[]> actividades = listar.getListaActividades(Util.isoStringToDate(vista.getFechaIni()), Util.isoStringToDate(vista.getFechaFin()));
		TableModel tmodel = SwingUtil.getTableModelFromPojos(actividades, new String[] {"id_actividad", "nombre", "fechaIniActividad", "aforo", "cuota socio", "cuota no socio"});
		vista.getTablaActividades().setModel(tmodel);
		
		vista.getTablaActividades().getColumnModel().getColumn(0).setHeaderValue("ID actividad");
		vista.getTablaActividades().getColumnModel().getColumn(1).setHeaderValue("Nombre");
		vista.getTablaActividades().getColumnModel().getColumn(2).setHeaderValue("Fecha");
		vista.getTablaActividades().getColumnModel().getColumn(3).setHeaderValue("Aforo");
		vista.getTablaActividades().getColumnModel().getColumn(4).setHeaderValue("Cuota Socio");
		vista.getTablaActividades().getColumnModel().getColumn(5).setHeaderValue("cuota No Socio");
	}
	
	
	
}
