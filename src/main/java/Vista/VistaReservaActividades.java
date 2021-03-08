package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaReservaActividades extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaReservaActividades frame = new VistaReservaActividades();
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
	public VistaReservaActividades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList listActividades = new JList();
		listActividades.setBounds(10, 32, 148, 128);
		contentPane.add(listActividades);
		
		JLabel lblActividades = new JLabel("Actividades");
		lblActividades.setBounds(10, 11, 148, 14);
		contentPane.add(lblActividades);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(168, 70, 148, 20);
		contentPane.add(dateChooser);
		
		JLabel lblDesde = new JLabel("Desde");
		lblDesde.setBounds(168, 8, 59, 20);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setBounds(237, 10, 59, 17);
		contentPane.add(lblHasta);
		
		JComboBox comboBoxDesde = new JComboBox();
		comboBoxDesde.setModel(new DefaultComboBoxModel(new String[] {"08:00 ", "09:00 ", "10:00 ", "11:00 ", "12:00 ", "13:00 ", "14:00 ", "15:00 ", "16:00 ", "17:00 ", "18:00 ", "19:00 ", "20:00", "21:00"}));
		comboBoxDesde.setBounds(168, 39, 59, 20);
		contentPane.add(comboBoxDesde);
		
		JComboBox comboBoxHasta = new JComboBox();
		comboBoxHasta.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		comboBoxHasta.setBounds(237, 38, 59, 20);
		contentPane.add(comboBoxHasta);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 171, 52, 20);
		contentPane.add(lblPrecio);
		
		JLabel lblPreciofinal = new JLabel("");
		lblPreciofinal.setBounds(72, 174, 86, 17);
		contentPane.add(lblPreciofinal);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 202, 52, 14);
		contentPane.add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(50, 199, 108, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCrea = new JButton("Crear");
		btnCrea.setEnabled(false);
		btnCrea.setBounds(207, 269, 89, 23);
		contentPane.add(btnCrea);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(72, 269, 89, 23);
		contentPane.add(btnCancelar);
	}
}
