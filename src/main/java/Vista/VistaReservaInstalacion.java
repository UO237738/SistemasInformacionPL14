package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.DefaultComboBoxModel;

public class VistaReservaInstalacion extends JFrame {

	public JPanel contentPane;

	public JComboBox<String> CBInstalaciones;
	public JTextField TFNombre;
	public JTextField TFDni;
	public JTextField TFApellidos;
	public JComboBox<String> CBDesde;
	public JComboBox<String> CBHasta;
	public JCalendar JCFechaInico;
	public JLabel JLDesde;
	public JLabel JLHasta;
	public JLabel JLFecha;
	public JLabel JLHora;
	public JLabel JLInstalacion;
	public JButton JBReservar;
	public JButton JBResguardo;
	public JLabel JLDatosSocio;
	public JLabel JLNombre;
	public JLabel JLApellidos;
	public JLabel JLDni;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaReservaInstalacion frame = new VistaReservaInstalacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaReservaInstalacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLInstalacion = new JLabel("Que instalacion quiere reservar:");
		JLInstalacion.setBounds(25, 24, 163, 14);
		contentPane.add(JLInstalacion);
		
		JBReservar = new JButton("Reservar");
		JBReservar.setBounds(80, 354, 89, 23);
		contentPane.add(JBReservar);
		JBReservar.setEnabled(false);
		
		JBResguardo = new JButton("Crear Resguardo");
		JBResguardo.setBounds(396, 354, 115, 23);
		contentPane.add(JBResguardo);
		
		
		CBInstalaciones = new JComboBox<String>();
		CBInstalaciones.setBounds(285, 21, 196, 20);
		((RootPaneContainer) contentPane).getContentPane().add(CBInstalaciones);
		
		JLFecha = new JLabel("Fecha:");
		JLFecha.setBounds(25, 61, 39, 14);
		contentPane.add(JLFecha);
		
		JLHora = new JLabel("Hora:");
		JLHora.setBounds(285, 61, 33, 14);
		contentPane.add(JLHora);
		
		JLDatosSocio = new JLabel("Datos del Socio que quiere hacer la reserva:");
		JLDatosSocio.setBounds(29, 227, 263, 14);
		contentPane.add(JLDatosSocio);
		
		JLNombre = new JLabel("Nombre:");
		JLNombre.setBounds(46, 255, 46, 14);
		contentPane.add(JLNombre);
		
		JLApellidos = new JLabel("Apellidos:");
		JLApellidos.setBounds(272, 255, 46, 14);
		contentPane.add(JLApellidos);
		
		JLDni = new JLabel("DNI:");
		JLDni.setBounds(46, 301, 46, 14);
		contentPane.add(JLDni);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(116, 252, 86, 20);
		contentPane.add(TFNombre);
		TFNombre.setColumns(10);
		
		TFDni = new JTextField();
		TFDni.setBounds(116, 298, 86, 20);
		contentPane.add(TFDni);
		TFDni.setColumns(10);
		
		TFApellidos = new JTextField();
		TFApellidos.setBounds(364, 252, 146, 20);
		contentPane.add(TFApellidos);
		TFApellidos.setColumns(10);
		
		JCFechaInico = new JCalendar();
		JCFechaInico.setBounds(68, 63, 184, 153);
		contentPane.add(JCFechaInico);
		
		CBDesde = new JComboBox<String>();
		CBDesde.setEnabled(false);
		CBDesde.setModel(new DefaultComboBoxModel<String>(new String[] {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"}));
		CBDesde.setBounds(106, 142, 59, 20);
		((RootPaneContainer) contentPane).getContentPane().add(CBDesde);
		
		JLDesde = new JLabel("Desde");
		JLDesde.setBounds(295, 86, 46, 14);
		contentPane.add(JLDesde);
		
		JLHasta = new JLabel("Hasta");
		JLHasta.setBounds(295, 138, 46, 14);
		contentPane.add(JLHasta);
		
		CBHasta = new JComboBox<String>();
		CBHasta.setEnabled(false);
		CBHasta.setModel(new DefaultComboBoxModel<String>(new String[] {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		CBHasta.setBounds(106, 173, 59, 20);
		((RootPaneContainer) contentPane).getContentPane().add(CBHasta);
	}
	
	public String getFechaInicio() {
		int d = this.JCFechaInico.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JCFechaInico.getCalendar().get(Calendar.MONTH);
		int a = this.JCFechaInico.getCalendar().get(Calendar.YEAR);
		String FechaIni = d + "-" + m + "-" + d;
		return FechaIni;
	}

	
}
