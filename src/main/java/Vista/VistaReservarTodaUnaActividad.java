package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class VistaReservarTodaUnaActividad {

	private JFrame frame;
	public JComboBox<String> cbActividad;
	public JButton bCancelar;
	public JButton bRealizarReserva;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaReservarTodaUnaActividad window = new VistaReservarTodaUnaActividad();
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
	public VistaReservarTodaUnaActividad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 173);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cbActividad = new JComboBox();
		cbActividad.setBounds(23, 31, 142, 21);
		frame.getContentPane().add(cbActividad);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 92, 85, 21);
		frame.getContentPane().add(bCancelar);
		
		bRealizarReserva = new JButton("Realizar reserva");
		bRealizarReserva.setEnabled(false);
		bRealizarReserva.setBounds(127, 92, 135, 21);
		frame.getContentPane().add(bRealizarReserva);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JComboBox<String> getCbActividad() {
		return cbActividad;
	}

	public void setCbActividad(JComboBox<String> cbActividad) {
		this.cbActividad = cbActividad;
	}

	public JButton getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(JButton bCancelar) {
		this.bCancelar = bCancelar;
	}

	public JButton getbRealizarReserva() {
		return bRealizarReserva;
	}

	public void setbRealizarReserva(JButton bRealizarReserva) {
		this.bRealizarReserva = bRealizarReserva;
	}
	
}
