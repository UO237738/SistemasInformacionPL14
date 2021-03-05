package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class VistaCrearHorario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearHorario frame = new VistaCrearHorario();
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
	public VistaCrearHorario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxLunes = new JCheckBox("Lunes");
		chckbxLunes.setBounds(6, 6, 69, 21);
		contentPane.add(chckbxLunes);
		
		JCheckBox chckbxMartes = new JCheckBox("Martes");
		chckbxMartes.setBounds(6, 42, 95, 21);
		contentPane.add(chckbxMartes);
		
		JCheckBox chckbxMircoles = new JCheckBox("Miércoles");
		chckbxMircoles.setBounds(6, 79, 95, 21);
		contentPane.add(chckbxMircoles);
		
		JCheckBox chckbxJueves = new JCheckBox("Jueves");
		chckbxJueves.setBounds(6, 118, 95, 21);
		contentPane.add(chckbxJueves);
		
		JCheckBox chckbxViernes = new JCheckBox("Viernes");
		chckbxViernes.setBounds(6, 155, 95, 21);
		contentPane.add(chckbxViernes);
		
		JCheckBox chckbxSbado = new JCheckBox("Sábado");
		chckbxSbado.setBounds(6, 193, 95, 21);
		contentPane.add(chckbxSbado);
		
		JCheckBox chckbxDomingo = new JCheckBox("Domingo");
		chckbxDomingo.setBounds(6, 236, 95, 21);
		contentPane.add(chckbxDomingo);
		
		JLabel lblHoraInicio = new JLabel("Hora inicio:");
		lblHoraInicio.setBounds(107, 10, 79, 13);
		contentPane.add(lblHoraInicio);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(200, 7, 30, 20);
		contentPane.add(spinner);
		
		JLabel label = new JLabel("Hora inicio:");
		label.setBounds(107, 46, 79, 13);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Hora inicio:");
		label_1.setBounds(107, 83, 79, 13);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Hora inicio:");
		label_2.setBounds(107, 122, 79, 13);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Hora inicio:");
		label_3.setBounds(107, 159, 79, 13);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Hora inicio:");
		label_4.setBounds(107, 197, 79, 13);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Hora inicio:");
		label_5.setBounds(107, 240, 79, 13);
		contentPane.add(label_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(200, 43, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(200, 80, 30, 20);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(200, 119, 30, 20);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(200, 156, 30, 20);
		contentPane.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(200, 194, 30, 20);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(200, 237, 30, 20);
		contentPane.add(spinner_6);
		
		JLabel lblH = new JLabel("h");
		lblH.setBounds(240, 10, 22, 13);
		contentPane.add(lblH);
		
		JLabel label_6 = new JLabel("h");
		label_6.setBounds(240, 46, 22, 13);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("h");
		label_7.setBounds(240, 83, 22, 13);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("h");
		label_8.setBounds(240, 122, 22, 13);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("h");
		label_9.setBounds(240, 159, 22, 13);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("h");
		label_10.setBounds(240, 197, 22, 13);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("h");
		label_11.setBounds(240, 240, 22, 13);
		contentPane.add(label_11);
		
		JLabel lblHoraFin = new JLabel("Hora fin:");
		lblHoraFin.setBounds(288, 10, 46, 13);
		contentPane.add(lblHoraFin);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(344, 7, 30, 20);
		contentPane.add(spinner_7);
		
		JLabel label_12 = new JLabel("Hora fin:");
		label_12.setBounds(288, 46, 46, 13);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Hora fin:");
		label_13.setBounds(288, 83, 46, 13);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("Hora fin:");
		label_14.setBounds(288, 122, 46, 13);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Hora fin:");
		label_15.setBounds(288, 159, 46, 13);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("Hora fin:");
		label_16.setBounds(288, 197, 46, 13);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("Hora fin:");
		label_17.setBounds(288, 240, 46, 13);
		contentPane.add(label_17);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(344, 43, 30, 20);
		contentPane.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(344, 80, 30, 20);
		contentPane.add(spinner_9);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(344, 119, 30, 20);
		contentPane.add(spinner_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(344, 156, 30, 20);
		contentPane.add(spinner_11);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(344, 194, 30, 20);
		contentPane.add(spinner_12);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setBounds(344, 237, 30, 20);
		contentPane.add(spinner_13);
		
		JLabel label_18 = new JLabel("h");
		label_18.setBounds(381, 10, 22, 13);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("h");
		label_19.setBounds(381, 46, 22, 13);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("h");
		label_20.setBounds(381, 83, 22, 13);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("h");
		label_21.setBounds(381, 122, 22, 13);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("h");
		label_22.setBounds(384, 159, 22, 13);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("h");
		label_23.setBounds(384, 197, 22, 13);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("h");
		label_24.setBounds(381, 240, 22, 13);
		contentPane.add(label_24);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(6, 282, 85, 21);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(426, 282, 85, 21);
		contentPane.add(btnAceptar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	
}
