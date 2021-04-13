package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaVerPendientes {

	private JFrame frame;
	public JTextField textFieldDNI;
	public JTable tableContabilidad;
	public JButton btnMostrar;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaVerPendientes window = new VistaVerPendientes();
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
	public VistaVerPendientes() {
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
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblDni);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(66, 8, 114, 20);
		frame.getContentPane().add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(190, 7, 89, 23);
		frame.getContentPane().add(btnMostrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 414, 177);
		frame.getContentPane().add(scrollPane);
		
		tableContabilidad = new JTable();
		tableContabilidad.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id_contabilidad", "pendiente"
			}
		));
		scrollPane.setViewportView(tableContabilidad);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 224, 89, 23);
		frame.getContentPane().add(btnSalir);
	}

	public JTable getTableContabilidad() {
		return tableContabilidad;
	}

	public void setTableContabilidad(JTable tableContabilidad) {
		this.tableContabilidad = tableContabilidad;
	}

	public JFrame getFrame() {
		return frame;
	}
}
