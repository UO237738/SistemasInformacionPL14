package Vista;

import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

import javax.swing.DefaultComboBoxModel;

public class VistaReservaadministracionAplicacion {

	public JFrame frame;
	
	public JComboBox<String> CBInstalaciones;
	public JTextField TFNombre;
	public JTextField TFDni;
	public JTextField TFApellidos;
	public JComboBox<String> CBDesde;
	public JComboBox<String> CBHasta;
	public JDateChooser JCFechaInico;
	public JButton JBReservar;
	
	
	
	public JLabel JLDesde;
	public JLabel JLHasta;
	public JLabel JLFecha;
	public JLabel JLHora;
	public JLabel JLInstalacion;
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
					VistaReservaadministracionAplicacion window = new VistaReservaadministracionAplicacion();
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
	public VistaReservaadministracionAplicacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLInstalacion = new JLabel("¿Que instalacion quiere reservar?");
		JLInstalacion.setBounds(23, 31, 188, 14);
		frame.getContentPane().add(JLInstalacion);
		
		CBInstalaciones = new JComboBox<String>();
		CBInstalaciones.setEnabled(true);
		CBInstalaciones.setModel(new DefaultComboBoxModel<String>(new String[] {"Pista de tenis", "Pista de Tenis 1", "Pista de Tenis 2", "Pista de Futbol", "Pista de Futbol 1", "Pista de Baloncesto", "Pista de Baloncesto 1", "Pista de Baloncesto 2"}));
		CBInstalaciones.setBounds(264, 28, 120, 20);
		frame.getContentPane().add(CBInstalaciones);
		
		JLFecha = new JLabel("Fecha: ");
		JLFecha.setBounds(23, 86, 46, 14);
		frame.getContentPane().add(JLFecha);
		
		JLHora = new JLabel("Hora:");
		JLHora.setBounds(293, 75, 46, 14);
		frame.getContentPane().add(JLHora);
		
		JLDesde = new JLabel("Desde:");
		JLDesde.setBounds(303, 107, 46, 14);
		frame.getContentPane().add(JLDesde);
		
		CBDesde = new JComboBox<String>();
		CBDesde.setEnabled(true);
		CBDesde.setModel(new DefaultComboBoxModel<String>(new String[] {"8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"}));
		CBDesde.setBounds(375, 104, 76, 20);
		frame.getContentPane().add(CBDesde);
		
		JLHasta = new JLabel("Hasta:");
		JLHasta.setBounds(303, 176, 46, 14);
		frame.getContentPane().add(JLHasta);
		
		CBHasta= new JComboBox<String>();
		CBHasta.setModel(new DefaultComboBoxModel<String>(new String[] {"9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		CBHasta.setBounds(375, 173, 76, 20);
		frame.getContentPane().add(CBHasta);
		
		JBReservar = new JButton("Reservar");
		JBReservar.setBounds(198, 274, 89, 23);
		frame.getContentPane().add(JBReservar);
		
		
		JCFechaInico = new JDateChooser();
		JCFechaInico.setBounds(97, 86, 95, 20);
		frame.getContentPane().add(JCFechaInico);
		
		JLDni = new JLabel("DNI:");
		JLDni.setBounds(23, 129, 46, 14);
		frame.getContentPane().add(JLDni);
		
		TFDni = new JTextField();
		TFDni.setBounds(97, 126, 95, 20);
		frame.getContentPane().add(TFDni);
		TFDni.setColumns(10);
		
		JLNombre = new JLabel("Nombre:");
		JLNombre.setBounds(23, 176, 64, 14);
		frame.getContentPane().add(JLNombre);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(97, 173, 95, 20);
		frame.getContentPane().add(TFNombre);
		TFNombre.setColumns(10);
		
		JLApellidos = new JLabel("Apellidos:");
		JLApellidos.setBounds(23, 230, 64, 14);
		frame.getContentPane().add(JLApellidos);
		
		TFApellidos = new JTextField();
		TFApellidos.setText("");
		TFApellidos.setBounds(97, 227, 147, 20);
		frame.getContentPane().add(TFApellidos);
		TFApellidos.setColumns(10);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JComboBox<String> getCBInstalaciones() {
		return CBInstalaciones;
	}

	public void setCBInstalaciones(JComboBox<String> cBInstalaciones) {
		CBInstalaciones = cBInstalaciones;
	}

	public JComboBox<String> getCBDesde() {
		return CBDesde;
	}

	public void setCBDesde(JComboBox<String> cBDesde) {
		CBDesde = cBDesde;
	}

	public JComboBox<String> getCBHasta() {
		return CBHasta;
	}

	public void setCBHasta(JComboBox<String> cBHasta) {
		CBHasta = cBHasta;
	}

	public String getJCFechaInico() {
		int d = this.JCFechaInico.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JCFechaInico.getCalendar().get(Calendar.MONTH);
		int a = this.JCFechaInico.getCalendar().get(Calendar.YEAR);
		String FechaIni = d + "-" + m + "-" + d;
		return FechaIni;
	}

	public void setJCFechaInico(JDateChooser jCFechaInico) {
		JCFechaInico = jCFechaInico;
	}

	public JButton getJBReservar() {
		return JBReservar;
	}

	public void setJBReservar(JButton jBReservar) {
		JBReservar = jBReservar;
	}

	public JLabel getJLDesde() {
		return JLDesde;
	}

	public void setJLDesde(JLabel jLDesde) {
		JLDesde = jLDesde;
	}

	public JLabel getJLHasta() {
		return JLHasta;
	}

	public void setJLHasta(JLabel jLHasta) {
		JLHasta = jLHasta;
	}

	public JLabel getJLFecha() {
		return JLFecha;
	}

	public void setJLFecha(JLabel jLFecha) {
		JLFecha = jLFecha;
	}

	public JLabel getJLHora() {
		return JLHora;
	}

	public void setJLHora(JLabel jLHora) {
		JLHora = jLHora;
	}

	public JLabel getJLDatosSocio() {
		return JLDatosSocio;
	}

	public void setJLDatosSocio(JLabel jLDatosSocio) {
		JLDatosSocio = jLDatosSocio;
	}

	public JLabel getJLApellidos() {
		return JLApellidos;
	}

	public void setJLApellidos(JLabel jLApellidos) {
		JLApellidos = jLApellidos;
	}

	public JLabel getJLDni() {
		return JLDni;
	}

	public void setJLDni(JLabel jLDni) {
		JLDni = jLDni;
	}
}
