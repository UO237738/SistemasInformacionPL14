package Controlador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import Modelo.ModeloCrearActividadDisplayDTO;
import Modelo.ModeloListarActividadesAdministracion;
import Vista.VistaListarActividadesAdministracion;
import giis.demo.util.Util;

public class ControladorListarActividadesAdministracion {
	private VistaListarActividadesAdministracion VLAA;

	
	public ControladorListarActividadesAdministracion() {
		VLAA = new VistaListarActividadesAdministracion();
		this.initview();
		//this.addListernerCRA();
	}
	
	public void initview() {
		VLAA.getFrame().setVisible(true);
		mostrarTodasActividades();
	}
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	public  void reiniciarTabla(){
		DefaultTableModel modelo = (DefaultTableModel) VLAA.JTActividades.getModel();
		while(modelo.getRowCount()>0)modelo.removeRow(0);

	}
	

	
	public void mostrarTodasActividades() {
		String fa= getFechaActual();
		Date fechaactual=Util.isoStringToDate(fa);
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaactual); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
        Date fechaFin = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
        calendar.setTime(fechaactual); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE)); 
        Date fechaInicio=calendar.getTime();
		
		ArrayList<ModeloCrearActividadDisplayDTO> list= ModeloListarActividadesAdministracion.listarActividades(fechaInicio, fechaFin);
		DefaultTableModel model= (DefaultTableModel)VLAA.JTActividades.getModel();

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


