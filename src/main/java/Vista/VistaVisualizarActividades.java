package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JYearChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.table.DefaultTableModel;

public class VistaVisualizarActividades extends JFrame {
	
	public JPanel contentPane;
	public JDateChooser JDFechaIni;
	public JDateChooser JDFechaFin;
	public JTable JTActividades;
	public JButton JBBuscar;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaVisualizarActividades frame = new VistaVisualizarActividades();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VistaVisualizarActividades() {
		getContentPane().setLayout(null);
		
		JLabel JLPeriodo = new JLabel("Periodo:");
		JLPeriodo.setLabelFor(JLPeriodo);
		JLPeriodo.setBounds(26, 11, 46, 14);
		getContentPane().add(JLPeriodo);
		
		JLabel JLFechaIni = new JLabel("Fecha Inicio:");
		JLFechaIni.setBounds(36, 36, 69, 14);
		getContentPane().add(JLFechaIni);
		
		JDFechaIni = new JDateChooser();
		JDFechaIni.setBounds(110, 36, 95, 20);
		getContentPane().add(JDFechaIni);
		
		JLabel JLFechaFin = new JLabel("Fecha Fin:");
		JLFechaFin.setBounds(240, 36, 61, 14);
		getContentPane().add(JLFechaFin);
		
		JDFechaFin = new JDateChooser();
		JDFechaFin.setBounds(311, 36, 95, 20);
		getContentPane().add(JDFechaFin);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(178, 81, 89, 23);
		getContentPane().add(btnNewButton);
		
		JTActividades = new JTable();
		JTActividades.setName("tablaActividades");
		JTActividades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JTActividades.setDefaultEditor(Object.class, null); //readonly
		
		
		
		
		
		
	}

	public String getFechaIni() {
		int d = this.JDFechaIni.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JDFechaIni.getCalendar().get(Calendar.MONTH);
		int a = this.JDFechaIni.getCalendar().get(Calendar.YEAR);
		String FechaIni = d + "-" + m + "-" + d;
		return FechaIni;
	}
	

	
	public String getFechaFin() {
		int d = this.JDFechaFin.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JDFechaFin.getCalendar().get(Calendar.MONTH);
		int a = this.JDFechaFin.getCalendar().get(Calendar.YEAR);
		String FechaFin = d + "-" + m + "-" + d;
		return FechaFin;
	}
	
	
	public JTable getTablaActividades() {
		return JTActividades;
	}
	
	
	public JButton getBBuscar() {
		return JBBuscar;
	}
	
	
	
}
