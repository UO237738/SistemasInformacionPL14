package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaCrearReservaInstalacionSocio {

	public JFrame frame;
	public JTextField textFieldDNI;
	public JComboBox<String> comboBoxInstalaciones;
	public JComboBox<String> comboBoxHoraIni;
	public JComboBox<String> comboBoxHoraFin;
	public JDateChooser dateChooserFechaInicio;
	public JButton btnCrear;
	public JButton btnCancelar;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearReservaInstalacionSocio window = new VistaCrearReservaInstalacionSocio();
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
	public VistaCrearReservaInstalacionSocio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 224, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstalacion = new JLabel("INSTALACIÓN");
		lblInstalacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInstalacion.setBounds(10, 11, 147, 20);
		frame.getContentPane().add(lblInstalacion);
		
		JComboBox comboBoxInstalaciones = new JComboBox();
		comboBoxInstalaciones.setBounds(10, 42, 188, 20);
		frame.getContentPane().add(comboBoxInstalaciones);
		
		JLabel lblFechaDeReserva = new JLabel("FECHA DE RESERVA");
		lblFechaDeReserva.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaDeReserva.setBounds(10, 90, 147, 20);
		frame.getContentPane().add(lblFechaDeReserva);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(10, 121, 188, 20);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(56, 152, 63, 19);
		frame.getContentPane().add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(56, 182, 63, 20);
		frame.getContentPane().add(lblHasta);
		
		JComboBox comboBoxHoraIni = new JComboBox();
		comboBoxHoraIni.setModel(new DefaultComboBoxModel(new String[] {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"}));
		comboBoxHoraIni.setBounds(135, 151, 63, 20);
		frame.getContentPane().add(comboBoxHoraIni);
		
		JComboBox comboBoxHoraFin = new JComboBox();
		comboBoxHoraFin.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		comboBoxHoraFin.setBounds(135, 182, 63, 20);
		frame.getContentPane().add(comboBoxHoraFin);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(10, 225, 46, 21);
		frame.getContentPane().add(lblPrecio);
		
		JLabel lblPrecio2 = new JLabel("");
		lblPrecio2.setBounds(94, 226, 104, 20);
		frame.getContentPane().add(lblPrecio2);
		
		JLabel lblNewLabel = new JLabel("DNI DEL SOCIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 251, 147, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(10, 282, 147, 20);
		frame.getContentPane().add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(10, 323, 86, 23);
		frame.getContentPane().add(btnCrear);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(112, 323, 86, 23);
		frame.getContentPane().add(btnCancelar);
	}
	
	public JFrame getFrameR() {return this.frame;}
}
