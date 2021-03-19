package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

import javax.swing.DefaultComboBoxModel;

public class VistaReservaadministracionAplicacion<JDatePickerImpl> {

	

	public JFrame frame;
	
	public JDateChooser JDFechaIni;
	public JComboBox<String> CBDesde;
	public JComboBox<String> CBHasta;
	public JButton JButtonReservar;
	public JComboBox<String> CBInstalaciones;
	public JLabel lblSolicitante;
	public JLabel LDni;
	public JTextField TFieldDni;
	public JLabel JLDesde;
	public JLabel JLHasta;
	public JLabel LPrecio;
	public JButton JButtonResguardo;

	

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
		frame.setResizable(false);
		frame.setTitle("Nueva Reserva");
		frame.setBounds(100, 100, 372, 380);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstalacion = new JLabel("Instalacion:");
		lblInstalacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInstalacion.setBounds(10, 11, 129, 20);
		frame.getContentPane().add(lblInstalacion);
		
		JDFechaIni = new JDateChooser();
		JDFechaIni.setBounds(35, 106, 130, 20);
		frame.getContentPane().add(JDFechaIni);
			
		JLabel lblPeriodoDeReserva = new JLabel("Fecha de Reserva:");
		lblPeriodoDeReserva.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPeriodoDeReserva.setBounds(10, 75, 181, 20);
		frame.getContentPane().add(lblPeriodoDeReserva);
		
		JLDesde = new JLabel("Desde:");
		JLDesde.setEnabled(false);
		JLDesde.setFont(new Font("Tahoma", Font.PLAIN, 17));
		JLDesde.setBounds(35, 142, 59, 14);
		frame.getContentPane().add(JLDesde);
		
		CBDesde = new JComboBox<String>();
		CBDesde.setEnabled(false);
		
		CBDesde.setModel(new DefaultComboBoxModel<String>(new String[] {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"}));
		CBDesde.setBounds(106, 142, 59, 20);
		frame.getContentPane().add(CBDesde);
		
		JLHasta = new JLabel("Hasta:");
		JLHasta.setEnabled(false);
		JLHasta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		JLHasta.setBounds(199, 142, 59, 20);
		frame.getContentPane().add(JLHasta);
		
		CBHasta = new JComboBox<String>();
		CBHasta.setEnabled(false);
		
		CBHasta.setModel(new DefaultComboBoxModel<String>(new String[] {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		CBHasta.setBounds(268, 142, 59, 20);
		frame.getContentPane().add(CBHasta);
		
		
		
		JButtonReservar = new JButton("Reservar");
		JButtonReservar.setEnabled(false);
		
		JButtonReservar.setBounds(18, 308, 89, 32);
		frame.getContentPane().add(JButtonReservar);
		
		JButtonResguardo = new JButton("Crear Resguardo");
		JButtonResguardo.setBounds(217, 308, 128, 32);
		frame.getContentPane().add(JButtonResguardo);
		
		CBInstalaciones = new JComboBox<String>();
		CBInstalaciones.setModel(new DefaultComboBoxModel(new String[] {"Pista Tennis", "Pista Tennis 1", "Pista Baloncesto", "Pista Baloncesto 1"}));
		
		CBInstalaciones.setBounds(20, 42, 208, 20);
		frame.getContentPane().add(CBInstalaciones);
		
		
		
		lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSolicitante.setBounds(10, 235, 97, 20);
		frame.getContentPane().add(lblSolicitante);
		
		LDni = new JLabel("DNI:");
		LDni.setFont(new Font("Tahoma", Font.PLAIN, 17));
		LDni.setBounds(48, 266, 46, 20);
		frame.getContentPane().add(LDni);
		
		TFieldDni = new JTextField();
		TFieldDni.setBounds(151, 269, 144, 20);
		frame.getContentPane().add(TFieldDni);
		TFieldDni.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPrecio.setBounds(35, 210, 59, 20);
		frame.getContentPane().add(lblPrecio);
		
		LPrecio = new JLabel("");
		LPrecio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		LPrecio.setBounds(106, 210, 59, 20);
		frame.getContentPane().add(LPrecio);
	}


public JFrame getFrameR() { return this.frame;}
	
	public String getCBDesde() {return (String)this.CBDesde.getSelectedItem();}
	public String getCBHasta() {return (String)this.CBHasta.getSelectedItem();}

	

	
	
	public String getDatePickerFechaIniS() {
		int d = this.JDFechaIni.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JDFechaIni.getCalendar().get(Calendar.MONTH);
		int a = this.JDFechaIni.getCalendar().get(Calendar.YEAR);
		String FechaIni = d + "-" + m + "-" + d;
		return FechaIni;
	}
	public void setDatePickerFechaInicio(String fecha) {
		String[] f = fecha.split("-");
		int a = Integer.parseInt(f[0]);
		int m = Integer.parseInt(f[1])-1;
		int d = Integer.parseInt(f[2]);
		this.JDFechaIni.getCalendar().set(a, m, d);
	}
}
