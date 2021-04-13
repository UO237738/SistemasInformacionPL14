package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VistaGestionarInscripcionesSocio {

	private JFrame frame;
	public JComboBox<String> CBActividades;
	public JButton JBInscribirse;
	public JButton JBCInscripcion;
	public JTable JTInscripcion;
	public JTextField TFDNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGestionarInscripcionesSocio window = new VistaGestionarInscripcionesSocio();
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
	public VistaGestionarInscripcionesSocio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 266);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione una actividad:");
		lblNewLabel.setBounds(34, 61, 146, 14);
		frame.getContentPane().add(lblNewLabel);
		
		CBActividades = new JComboBox<String>();
		CBActividades.setEnabled(false);
		CBActividades.setBounds(287, 58, 154, 20);
		frame.getContentPane().add(CBActividades);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 489, 56);
		frame.getContentPane().add(scrollPane);
		
		JTInscripcion = new JTable();
		JTInscripcion.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Plazas Disponibles", "Inicio Inscripcion Socio", "Fin Inscripcion Socio"
			}
		));
		JTInscripcion.getColumnModel().getColumn(0).setPreferredWidth(76);
		scrollPane.setViewportView(JTInscripcion);
		
		JBInscribirse = new JButton("Incribirse");
		JBInscribirse.setBounds(327, 184, 139, 23);
		frame.getContentPane().add(JBInscribirse);
		
		JLabel lblNewLabel_1 = new JLabel("Inroduce tu DNI:");
		lblNewLabel_1.setBounds(34, 24, 146, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		TFDNI = new JTextField();
		TFDNI.setBounds(287, 21, 154, 20);
		frame.getContentPane().add(TFDNI);
		TFDNI.setColumns(10);
		
		JBCInscripcion = new JButton("Cancelar Inscripcion");
		JBCInscripcion.setBounds(41, 184, 139, 23);
		frame.getContentPane().add(JBCInscripcion);
	}
}
