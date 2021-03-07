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

public class VistaReservaActividades extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 619, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList listActividades = new JList();
		listActividades.setBounds(10, 32, 148, 337);
		contentPane.add(listActividades);
		
		JLabel lblActividades = new JLabel("Actividades");
		lblActividades.setBounds(10, 11, 148, 14);
		contentPane.add(lblActividades);
		
		JLabel lblTipoDePista = new JLabel("Tipo de pista:");
		lblTipoDePista.setBounds(303, 36, 103, 25);
		contentPane.add(lblTipoDePista);
		
		JLabel lblImportePor = new JLabel("Importe por 60 minutos:");
		lblImportePor.setBounds(303, 72, 148, 27);
		contentPane.add(lblImportePor);
		
		JLabel lblImportePor_1 = new JLabel("Importe por 1 día:");
		lblImportePor_1.setBounds(303, 110, 148, 25);
		contentPane.add(lblImportePor_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(293, 32, 300, 128);
		contentPane.add(textPane);
		
		JLabel lblDatos = new JLabel("Datos");
		lblDatos.setBounds(293, 11, 77, 14);
		contentPane.add(lblDatos);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(199, 171, 394, 198);
		contentPane.add(calendar);
	}
}
