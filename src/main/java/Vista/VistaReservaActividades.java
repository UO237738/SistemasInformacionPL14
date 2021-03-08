package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class VistaReservaActividades extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldDNI;
	public JLabel lblActividades;
	public JDateChooser dateChooser;
	public JLabel lblDesde;
	public JLabel lblHasta;
	public JComboBox<String> comboBoxDesde;
	public JComboBox<String> comboBoxHasta;
	public JLabel lblPreciofinal;
	public JButton btnCrear;
	public JButton btnCancelar;
	public JComboBox<String> comboBoxActividades;

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
		setBounds(100, 100, 368, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblActividades = new JLabel("Actividades");
		lblActividades.setBounds(10, 11, 148, 14);
		contentPane.add(lblActividades);
		
		comboBoxActividades = new JComboBox();
		comboBoxActividades.setBounds(10, 36, 148, 23);
		contentPane.add(comboBoxActividades);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(168, 70, 148, 20);
		contentPane.add(dateChooser);
		
		lblDesde = new JLabel("Desde");
		lblDesde.setBounds(168, 8, 59, 20);
		contentPane.add(lblDesde);
		
		lblHasta = new JLabel("Hasta");
		lblHasta.setBounds(237, 10, 59, 17);
		contentPane.add(lblHasta);
		
		comboBoxDesde = new JComboBox();
		comboBoxDesde.setEnabled(false);
		comboBoxDesde.setModel(new DefaultComboBoxModel(new String[] {"08:00 ", "09:00 ", "10:00 ", "11:00 ", "12:00 ", "13:00 ", "14:00 ", "15:00 ", "16:00 ", "17:00 ", "18:00 ", "19:00 ", "20:00", "21:00"}));
		comboBoxDesde.setBounds(168, 39, 59, 20);
		contentPane.add(comboBoxDesde);
		
		comboBoxHasta = new JComboBox();
		comboBoxHasta.setEnabled(false);
		comboBoxHasta.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		comboBoxHasta.setBounds(237, 38, 59, 20);
		contentPane.add(comboBoxHasta);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 70, 52, 20);
		contentPane.add(lblPrecio);
		
		lblPreciofinal = new JLabel("");
		lblPreciofinal.setBounds(72, 174, 86, 17);
		contentPane.add(lblPreciofinal);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 101, 52, 14);
		contentPane.add(lblDni);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(50, 101, 108, 20);
		contentPane.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		btnCrear = new JButton("Crear");
		btnCrear.setEnabled(false);
		btnCrear.setBounds(237, 140, 89, 23);
		contentPane.add(btnCrear);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(60, 140, 89, 23);
		contentPane.add(btnCancelar);
	}

	public JTextField getTextFieldDNI() {
		return textFieldDNI;
	}

	public void setTextFieldDNI(JTextField textFieldDNI) {
		this.textFieldDNI = textFieldDNI;
	}

	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	public void setDateChooser(JDateChooser dateChooser) {
		this.dateChooser = dateChooser;
	}

	public JComboBox<String> getComboBoxDesde() {
		return comboBoxDesde;
	}

	public void setComboBoxDesde(JComboBox<String> comboBoxDesde) {
		this.comboBoxDesde = comboBoxDesde;
	}

	public JComboBox<String> getComboBoxHasta() {
		return comboBoxHasta;
	}

	public void setComboBoxHasta(JComboBox<String> comboBoxHasta) {
		this.comboBoxHasta = comboBoxHasta;
	}

	public JLabel getLblPreciofinal() {
		return lblPreciofinal;
	}

	public void setLblPreciofinal(JLabel lblPreciofinal) {
		this.lblPreciofinal = lblPreciofinal;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JComboBox<String> getComboBoxActividades() {
		return comboBoxActividades;
	}

	public void setComboBoxActividades(JComboBox<String> comboBoxActividades) {
		this.comboBoxActividades = comboBoxActividades;
	}
}
