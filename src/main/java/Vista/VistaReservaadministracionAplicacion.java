package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.util.Properties;

public class VistaReservaadministracionAplicacion {

	

	public JFrame frame;
	
	public JDatePickerImpl JDFechaIni;
	public JComboBox<String> CBDesde;
	public JComboBox<String> CBHasta;
	public JButton JButtonReservar;
	public JComboBox<String> CBInstalaciones;
	public JLabel lblSolicitante;
	public JLabel LDni;
	public JTextField TFieldDni;
	public JLabel JLDesde;
	public JLabel JLHasta;
	
	



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
		frame.setBounds(100, 100, 372, 354);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstalacion = new JLabel("Instalacion:");
		lblInstalacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInstalacion.setBounds(10, 11, 129, 20);
		frame.getContentPane().add(lblInstalacion);
		

		// ++Calendario desplegable
		UtilDateModel modelFechaInicioS = new UtilDateModel();
		modelFechaInicioS.setSelected(true);
		Properties modelProperties = new Properties();
		modelProperties.put("text.today", "Today");
		modelProperties.put("text.month", "Month");
		modelProperties.put("text.year", "Year");
			
		JDatePanelImpl datePanelImpl = new JDatePanelImpl(modelFechaInicioS, modelProperties);
		JDFechaIni = new JDatePickerImpl(datePanelImpl, new DateLabelFormatter());
		JDFechaIni.setBounds(35, 106, 193, 23);
		frame.getContentPane().add(JDFechaIni);
				
		
			
		JLabel lblPeriodoDeReserva = new JLabel("Fecha de Reserva:");
		lblPeriodoDeReserva.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPeriodoDeReserva.setBounds(10, 75, 181, 20);
		frame.getContentPane().add(lblPeriodoDeReserva);
		
		JLDesde = new JLabel("Desde:");
		JLDesde.setFont(new Font("Tahoma", Font.PLAIN, 17));
		JLDesde.setBounds(35, 158, 59, 14);
		frame.getContentPane().add(JLDesde);
		
		CBDesde = new JComboBox<String>();
		CBDesde.setModel(new DefaultComboBoxModel<String>(new String[] {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"}));
		CBDesde.setBounds(104, 158, 59, 20);
		frame.getContentPane().add(CBDesde);
		
		JLHasta = new JLabel("Hasta:");
		JLHasta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		JLHasta.setBounds(199, 155, 59, 20);
		frame.getContentPane().add(JLHasta);
		
		CBHasta = new JComboBox<String>();
		CBHasta.setModel(new DefaultComboBoxModel<String>(new String[] {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		CBHasta.setBounds(268, 158, 59, 20);
		frame.getContentPane().add(CBHasta);
		
		JButtonReservar = new JButton("Reservar");
		JButtonReservar.setEnabled(false);
		
		JButtonReservar.setBounds(139, 282, 89, 32);
		frame.getContentPane().add(JButtonReservar);
		
		CBInstalaciones = new JComboBox<String>();
		
		CBInstalaciones.setBounds(20, 42, 208, 20);
		frame.getContentPane().add(CBInstalaciones);
		
		
		
		lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSolicitante.setBounds(10, 197, 97, 20);
		frame.getContentPane().add(lblSolicitante);
		
		LDni = new JLabel("DNI:");
		LDni.setFont(new Font("Tahoma", Font.PLAIN, 17));
		LDni.setBounds(35, 231, 46, 20);
		frame.getContentPane().add(LDni);
		
		TFieldDni = new JTextField();
		TFieldDni.setBounds(152, 234, 144, 20);
		frame.getContentPane().add(TFieldDni);
		TFieldDni.setColumns(10);
		
	}


public JFrame getFrameR() { return this.frame;}
	
	public String getCBDesde() {return (String)this.CBDesde.getSelectedItem();}
	public String getCBHasta() {return (String)this.CBHasta.getSelectedItem();}



	public String getJCFechaInico() {
		int d = this.JCFechaInico.getCalendar().get(Calendar.DAY_OF_MONTH);
		int m = this.JCFechaInico.getCalendar().get(Calendar.MONTH);
		int a = this.JCFechaInico.getCalendar().get(Calendar.YEAR);
		String FechaIni = d + "-" + m + "-" + d;
		return FechaIni;
	}
	
	public void setJCFechaInico(String fecha) {
		String[] f = fecha.split("-");
		int a = Integer.parseInt(f[0]);
		int m = Integer.parseInt(f[1])-1;
		int d = Integer.parseInt(f[2]);
		this.JDFechaIni.getModel().setDate(a, m, d);
	}

	

}
