package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.CardLayout;
import java.awt.EventQueue;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.JButton;
import java.util.Properties;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class VistaListarActividadesAdministracion {

	public JFrame frame;
	public JPanel contentPane;
	public JButton JBBuscar;
	public JDatePickerImpl JDFechaini;
	public JDatePickerImpl JDFechafin;
	public JLabel JLHasta;
	public JLabel JLDesde;
	public JLabel JLPeriodo;
	private JScrollPane scrollPane;
	public JTable JTActividades;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaListarActividadesAdministracion window = new VistaListarActividadesAdministracion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaListarActividadesAdministracion() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 154, 696, 152);
		frame.getContentPane().add(scrollPane);
		
		JTActividades = new JTable();
		JTActividades.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id_Instalacion", "Nombre", "Aforo", "Cuota Socio", "Cuota No Socio", "Fecha Inicio", "Fehca Fin"
			}
		));
		scrollPane.setViewportView(JTActividades);
		
		
		JLPeriodo = new JLabel("Periodo:");
		JLPeriodo.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(JLPeriodo);
		
		JLDesde = new JLabel("Desde:");
		JLDesde.setBounds(45, 36, 46, 14);
		frame.getContentPane().add(JLDesde);
		
		JLHasta = new JLabel("Hasta:");
		JLHasta.setBounds(45, 86, 46, 14);
		frame.getContentPane().add(JLHasta);
		
		JBBuscar = new JButton("Buscar");
		JBBuscar.setBounds(454, 59, 89, 23);
		frame.getContentPane().add(JBBuscar);
		
		// ++Calendario desplegable 1 
		UtilDateModel modelFechaInicioS = new UtilDateModel();
		modelFechaInicioS.setSelected(true);
		Properties modelProperties = new Properties();
		modelProperties.put("text.today", "Today");
		modelProperties.put("text.month", "Month");
		modelProperties.put("text.year", "Year");
		
		
		JDatePanelImpl datePanelImpl = new JDatePanelImpl(modelFechaInicioS, modelProperties);
		JDFechaini = new JDatePickerImpl(datePanelImpl, new DateLabelFormatter());
		JDFechaini.setBounds(95, 36, 193, 23);
		frame.getContentPane().add(JDFechaini);
		
		// ++Calendario desplegable 2 
		UtilDateModel modelFechaFinS = new UtilDateModel();
		modelFechaInicioS.setSelected(true);
		Properties modelProperties1 = new Properties();
		modelProperties.put("text.today", "Today");
		modelProperties.put("text.month", "Month");
		modelProperties.put("text.year", "Year");
		
		JDatePanelImpl datePanelImpl_1 = new JDatePanelImpl(modelFechaFinS, modelProperties1);
		JDFechafin = new JDatePickerImpl(datePanelImpl_1, new DateLabelFormatter());
		JDFechafin.setBounds(95, 86, 193, 23);
		frame.getContentPane().add(JDFechafin);
		
		
		
			
		
	}

	public JFrame getFrame() {
		return frame;
	}
	
	public String getJDFechaini() {
		int d = this.JDFechaini.getModel().getDay();
		int m = this.JDFechaini.getModel().getMonth()+1;
		int y = this.JDFechaini.getModel().getYear();
		String fechaIni = y + "-" + m + "-" + d;
		return fechaIni;
	}
	public void setJDFechaini(String fechaIni) {
		String[] f = fechaIni.split("-");
		int a = Integer.parseInt(f[0]);
		int m = Integer.parseInt(f[1])-1;
		int d = Integer.parseInt(f[2]);
		this.JDFechaini.getModel().setDate(a, m, d);
	}
	
	public String getJDFechafin() {
		int d = this.JDFechafin.getModel().getDay();
		int m = this.JDFechafin.getModel().getMonth()+1;
		int y = this.JDFechafin.getModel().getYear();
		String fechaFin = y + "-" + m + "-" + d;
		return fechaFin;
	}
	public void setJDFechafin(String fechaFin) {
		String[] f = fechaFin.split("-");
		int a = Integer.parseInt(f[0]);
		int m = Integer.parseInt(f[1])-1;
		int d = Integer.parseInt(f[2]);
		this.JDFechafin.getModel().setDate(a, m, d);
	}
	
	public JTable getJTActiviades() {
		return JTActividades;
	}
}

