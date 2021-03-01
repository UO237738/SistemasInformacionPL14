package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class VistaCrearActividades extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearActividades frame = new VistaCrearActividades();
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
	public VistaCrearActividades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstalacin = new JLabel("Instalación:");
		lblInstalacin.setBounds(10, 10, 54, 19);
		contentPane.add(lblInstalacin);
		
		JLabel lblActividad = new JLabel("Actividad:");
		lblActividad.setBounds(10, 39, 46, 13);
		contentPane.add(lblActividad);
		
		JLabel lblAforo = new JLabel("Aforo:");
		lblAforo.setBounds(10, 62, 46, 13);
		contentPane.add(lblAforo);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setBounds(10, 85, 46, 13);
		contentPane.add(lblHorario);
		
		JLabel lblPeriodo = new JLabel("Periodo:");
		lblPeriodo.setBounds(10, 108, 46, 13);
		contentPane.add(lblPeriodo);
		
		JLabel lblCuotas = new JLabel("Cuotas:");
		lblCuotas.setBounds(10, 131, 46, 13);
		contentPane.add(lblCuotas);
		
		JLabel lblNoSocios = new JLabel("No socios:");
		lblNoSocios.setBounds(34, 171, 59, 13);
		contentPane.add(lblNoSocios);
		
		JButton btnCrearHorario = new JButton("Crear horario");
		btnCrearHorario.setBounds(69, 83, 96, 17);
		contentPane.add(btnCrearHorario);
		
		JButton btnAsignarPeriodoDe = new JButton("Asignar periodo de inscripción");
		btnAsignarPeriodoDe.setBounds(10, 194, 171, 21);
		contentPane.add(btnAsignarPeriodoDe);
		
		JLabel lblPeriodoDeInscripcin = new JLabel("Periodo de inscripción:");
		lblPeriodoDeInscripcin.setBounds(191, 198, 111, 13);
		contentPane.add(lblPeriodoDeInscripcin);
		
		textField = new JTextField();
		textField.setBounds(309, 195, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 225, 85, 21);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(341, 224, 85, 21);
		contentPane.add(btnAceptar);
		
		JLabel lblSocios = new JLabel("Socios:");
		lblSocios.setBounds(34, 154, 46, 13);
		contentPane.add(lblSocios);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 169, 46, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 151, 46, 16);
		contentPane.add(textField_2);
		
		JLabel label = new JLabel("€");
		label.setBounds(150, 154, 46, 13);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("€");
		label_1.setBounds(150, 171, 46, 13);
		contentPane.add(label_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(140, 102, 69, 19);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(287, 102, 69, 19);
		contentPane.add(dateChooser_1);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setBounds(66, 108, 64, 13);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha fin");
		lblFechaFin.setBounds(238, 108, 64, 13);
		contentPane.add(lblFechaFin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 35, 160, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(74, 9, 152, 21);
		contentPane.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(69, 59, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPersonas = new JLabel("personas");
		lblPersonas.setBounds(175, 62, 46, 13);
		contentPane.add(lblPersonas);
	}
}
