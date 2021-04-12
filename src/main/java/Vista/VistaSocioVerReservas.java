package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class VistaSocioVerReservas {

	public JFrame frame;
	public JTable table;
	public JTextField tfDNI;
	
	public JButton bCancelar;
	public JButton bFiltrar;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaSocioVerReservas window = new VistaSocioVerReservas();
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
	public VistaSocioVerReservas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 48, 561, 152);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id_reserva", "FechaIni", "FechaFin", "Id_actividad", "Id_instalacion", "Hora_ini", "Hora_fin", "Id_socio"
			}
		));
//		table.setModel(new DefaultTableModel(
//				new Object[][] {
//				},
//				new String[] {
//					"Id Reserva", "Fecha Inicio", "Fecha Fin", "Id Actividad", "Id Instalación", "Hora Fin", "Hora Fin", "Id Socio"
//				}
//			));
//		
		JLabel lDni = new JLabel("DNI:");
		lDni.setBounds(10, 25, 46, 13);
		frame.getContentPane().add(lDni);
		
		tfDNI = new JTextField();
		tfDNI.setBounds(39, 22, 96, 19);
		frame.getContentPane().add(tfDNI);
		tfDNI.setColumns(10);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(0, 218, 85, 21);
		frame.getContentPane().add(bCancelar);
		
		bFiltrar = new JButton("Filtrar");
		bFiltrar.setBounds(145, 21, 85, 21);
		frame.getContentPane().add(bFiltrar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTfDNI() {
		return tfDNI;
	}

	public void setTfDNI(JTextField tfDNI) {
		this.tfDNI = tfDNI;
	}

	

	public JButton getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(JButton bCancelar) {
		this.bCancelar = bCancelar;
	}

	public JButton getbAceptar() {
		return bFiltrar;
	}

	public void setbAceptar(JButton bAceptar) {
		this.bFiltrar = bAceptar;
	}
	
}
