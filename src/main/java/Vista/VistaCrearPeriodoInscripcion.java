package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaCrearPeriodoInscripcion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearPeriodoInscripcion frame = new VistaCrearPeriodoInscripcion();
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
	public VistaCrearPeriodoInscripcion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFechaInicioSocios = new JLabel("Fecha inicio socios:");
		lblFechaInicioSocios.setBounds(10, 21, 105, 13);
		contentPane.add(lblFechaInicioSocios);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(149, 15, 126, 19);
		contentPane.add(dateChooser);
		
		JLabel lblFechaFinSocios = new JLabel("Fecha fin socios:");
		lblFechaFinSocios.setBounds(10, 62, 83, 13);
		contentPane.add(lblFechaFinSocios);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(149, 56, 126, 19);
		contentPane.add(dateChooser_1);
		
		JLabel lblFechaInicioNo = new JLabel("Fecha inicio no socios:");
		lblFechaInicioNo.setBounds(10, 108, 117, 13);
		contentPane.add(lblFechaInicioNo);
		
		JLabel lblFechaFinNo = new JLabel("Fecha fin no socios:");
		lblFechaFinNo.setBounds(10, 138, 117, 13);
		contentPane.add(lblFechaFinNo);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(149, 132, 126, 19);
		contentPane.add(dateChooser_2);
		
		textField = new JTextField();
		textField.setBounds(149, 105, 126, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 208, 85, 21);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(305, 208, 85, 21);
		contentPane.add(btnAceptar);
	}
}
