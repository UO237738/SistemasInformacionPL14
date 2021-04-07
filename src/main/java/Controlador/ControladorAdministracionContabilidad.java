package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.ModeloAdministracionContabilidad;
import Modelo.ModeloContabilidadDisplayDTO;
import Vista.VistaAdministracionContabilidad;
import giis.demo.util.Util;

public class ControladorAdministracionContabilidad {
	private VistaAdministracionContabilidad VAC;
	
	
	public ControladorAdministracionContabilidad() {
		VAC = new VistaAdministracionContabilidad();
		this.addListenerCAC();
		this.initView();
	}
	
	
	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}
	
	
	public  void reiniciarTabla (){
		DefaultTableModel modelo = (DefaultTableModel) VAC.JTContabilidad.getModel();
		while(modelo.getRowCount()>0)modelo.removeRow(0);
	}
	
	
	public void mostrarPagado() {
		String fechaInicio = getFechaActual();
		Date fi = Util.isoStringToDate(fechaInicio);
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fi); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
        Date ff = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
		
		int Pagado = ModeloAdministracionContabilidad.CalcularPagado(fi, ff);
		VAC.JLPagado.setText("Pagado: "+Pagado+" €");
	}
	
	public void mostrarPendiente() {
		String fechaInicio = getFechaActual();
		Date fi = Util.isoStringToDate(fechaInicio);
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fi); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
        Date ff = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
		
		int Pendiente = ModeloAdministracionContabilidad.CalcularPendiente(fi, ff);
		VAC.JLPendiente.setText("Pendiente: "+Pendiente+" €");
	}	
	

	public void mostrarTotal() {
		String fechaInicio = getFechaActual();
		Date fi = Util.isoStringToDate(fechaInicio);
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fi); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
        Date ff = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
		
		int Total = ModeloAdministracionContabilidad.CalcularTotal(fi, ff);
		VAC.JLTotal.setText("Ingresos Totales: "+Total+" €");
	}	

	
	
	public void mostrarContabilidad() {
		String fechaActual = getFechaActual();
		Date fa = Util.isoStringToDate(fechaActual);
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fa); 
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
        Date ff = calendar.getTime(); 
        calendar.setTime(fa); 
        calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE)); 
        Date fi = calendar.getTime();

		ArrayList<ModeloContabilidadDisplayDTO> list= ModeloAdministracionContabilidad.listarContabilidad(fi, ff);
		DefaultTableModel model= (DefaultTableModel)VAC.JTContabilidad.getModel();

		Object [] row = new Object[6];
		for (int i=0;i<list.size();i++) {
			row[0]=list.get(i).getId_contabilidad();
			row[1]=list.get(i).getId_socio();
			row[2]=list.get(i).getFecha();
			row[3]=list.get(i).getDescripcion();
			row[4]=list.get(i).getImporte();
			row[5]=list.get(i).getPendiente();

			model.addRow(row);
		}
	}
	
	
	
	
	
	

	private void initView() {
		VAC.getFrame().setVisible(true);
		mostrarContabilidad();
		mostrarPendiente();
		mostrarPagado();
		mostrarTotal();
	}

	private void addListenerCAC() {
		VAC.JBSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VAC.frame.dispose();
			}
		});
		
		VAC.JBCobrarPendiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fechaInicio= getFechaActual();
				Date fi=Util.isoStringToDate(fechaInicio);
			
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(fi); 
				calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
				Date ff = calendar.getTime(); 
				
				ModeloAdministracionContabilidad.RealizarCobros(fi, ff);
				reiniciarTabla();
				mostrarContabilidad();
				mostrarPendiente();
				mostrarPagado();
				mostrarTotal();
				JOptionPane.showMessageDialog(null, "Se han realizado todos los pagos pendientes", "Correcto", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}
	
	
	
	
	
	
}
