package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaAdministracionContabilidad {

	public JFrame frame;
	public JTable JTContabilidad;
	private JScrollPane scrollPane;
	/*public JLabel JLPagado;*/
	public JLabel JLPendiente;
	/*public JLabel JLTotal;*/
	public JButton JBSalir;
	public JButton JBCobrarPendiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAdministracionContabilidad window = new VistaAdministracionContabilidad();
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
	public VistaAdministracionContabilidad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 554, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTContabilidad = new JTable();
		JTContabilidad.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id Pago", "Usuario", "Fecha", "Descripcion", "Importe", "Estado "
			}
		));
		
		scrollPane = new JScrollPane(JTContabilidad);
		scrollPane.setBounds(10, 11, 518, 266);
		frame.getContentPane().add(scrollPane);
		
		/*
		JLPagado = new JLabel("Pagado:");
		JLPagado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		JLPagado.setBounds(10, 306, 168, 21);
		frame.getContentPane().add(JLPagado);
		*/
		
		JLPendiente = new JLabel("Pendiente:");
		JLPendiente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		JLPendiente.setBounds(10, 338, 168, 21);
		frame.getContentPane().add(JLPendiente);
		
		/*
		JLTotal = new JLabel("Total:");
		JLTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		JLTotal.setBounds(10, 370, 168, 21);
		frame.getContentPane().add(JLTotal);
		*/
		
		JBSalir = new JButton("SALIR");
		JBSalir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		JBSalir.setBounds(396, 337, 106, 23);
		frame.getContentPane().add(JBSalir);
		
		JBCobrarPendiente = new JButton("Cobrar Pendiente");
		JBCobrarPendiente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		JBCobrarPendiente.setBounds(255, 338, 131, 23);
		frame.getContentPane().add(JBCobrarPendiente);
	}
	

	public JFrame getFrame() {
		return frame;
	}
}
