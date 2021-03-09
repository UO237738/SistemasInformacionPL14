package Vista;

import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import com.toedter.calendar.JDateChooser;

public class VistaListarActividadesAdministracion {

	private JFrame frame;
	public JPanel contentPane;
	public JDateChooser JDFechaIni;
	public JDateChooser JDFechaFin;
	public JTable JTActividades;
	public JButton JBBuscar;
	
	public JLabel JLHasta;
	public JLabel JLDesde;
	public JLabel JLPeriodo;
	private JTable table;
	
	

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLPeriodo = new JLabel("Periodo:");
		JLPeriodo.setBounds(35, 26, 46, 14);
		frame.getContentPane().add(JLPeriodo);
		
		JLDesde = new JLabel("Desde:");
		JLDesde.setBounds(45, 51, 46, 14);
		frame.getContentPane().add(JLDesde);
		
		JLHasta = new JLabel("Hasta:");
		JLHasta.setBounds(234, 51, 46, 14);
		frame.getContentPane().add(JLHasta);
		
		JDFechaFin = new JDateChooser();
		JDFechaFin.setBounds(101, 51, 95, 20);
		frame.getContentPane().add(JDFechaFin);
		
		JDFechaIni = new JDateChooser();
		JDFechaIni.setBounds(288, 51, 95, 20);
		frame.getContentPane().add(JDFechaIni);
		
		JBBuscar = new JButton("Buscar");
		JBBuscar.setBounds(172, 82, 89, 23);
		frame.getContentPane().add(JBBuscar);
		
		JTActividades = new JTable();
		JTActividades.setBounds(101, 146, 1, 1);
		frame.getContentPane().add(JTActividades);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public String getJDFechaIni() {
		int d = this.JDFechaIni.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JDFechaIni.getCalendar().get(Calendar.MONTH);
		int a = this.JDFechaIni.getCalendar().get(Calendar.YEAR);
		String FechaIni = d + "-" + m + "-" + d;
		return FechaIni;
	}

	public void setJDFechaIni(JDateChooser jDFechaIni) {
		JDFechaIni = jDFechaIni;
	}

	public String getJDFechaFin() {
		int d = this.JDFechaFin.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JDFechaFin.getCalendar().get(Calendar.MONTH);
		int a = this.JDFechaFin.getCalendar().get(Calendar.YEAR);
		String FechaFin = d + "-" + m + "-" + d;
		return FechaFin;
	}

	public void setJDFechaFin(JDateChooser jDFechaFin) {
		JDFechaFin = jDFechaFin;
	}

	public JTable getJTActividades() {
		return JTActividades;
	}

	public void setJTActividades(JTable jTActividades) {
		JTActividades = jTActividades;
	}

	public JButton getJBBuscar() {
		return JBBuscar;
	}

	public void setJBBuscar(JButton jBBuscar) {
		JBBuscar = jBBuscar;
	}

	public JLabel getJLHasta() {
		return JLHasta;
	}

	public void setJLHasta(JLabel jLHasta) {
		JLHasta = jLHasta;
	}

	public JLabel getJLDesde() {
		return JLDesde;
	}

	public void setJLDesde(JLabel jLDesde) {
		JLDesde = jLDesde;
	}

	public JLabel getJLPeriodo() {
		return JLPeriodo;
	}

	public void setJLPeriodo(JLabel jLPeriodo) {
		JLPeriodo = jLPeriodo;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
	
}
