package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class VistaSocio {

	public JFrame frame;
	public JButton bVerPagosPendientes;
	public JButton bVerReservas;
	public JButton bReservarInstalacion;
	public JButton bInscripcionEnActividades;
	public JButton bCancelar;
	public JButton bAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaSocio window = new VistaSocio();
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
	public VistaSocio() {
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
		
		JButton bVerPagosPendientes = new JButton("Ver pagos pendientes");
		bVerPagosPendientes.setBounds(10, 31, 185, 21);
		frame.getContentPane().add(bVerPagosPendientes);
		
		JButton bReservarInstalacin = new JButton("Reservar instalación");
		bReservarInstalacin.setBounds(10, 79, 185, 21);
		frame.getContentPane().add(bReservarInstalacin);
		
		JButton bVerReservas = new JButton("Ver reservas");
		bVerReservas.setBounds(10, 126, 185, 21);
		frame.getContentPane().add(bVerReservas);
		
		JButton bInscripcionEnActividades = new JButton("Inscripción en actividades");
		bInscripcionEnActividades.setBounds(10, 175, 185, 21);
		frame.getContentPane().add(bInscripcionEnActividades);
		
		JButton bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 232, 85, 21);
		frame.getContentPane().add(bCancelar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getbVerPagosPendientes() {
		return bVerPagosPendientes;
	}

	public void setbVerPagosPendientes(JButton bVerPagosPendientes) {
		this.bVerPagosPendientes = bVerPagosPendientes;
	}

	public JButton getbVerReservas() {
		return bVerReservas;
	}

	public void setbVerReservas(JButton bVerReservas) {
		this.bVerReservas = bVerReservas;
	}

	public JButton getbReservarInstalacion() {
		return bReservarInstalacion;
	}

	public void setbReservarInstalacion(JButton bReservarInstalacion) {
		this.bReservarInstalacion = bReservarInstalacion;
	}

	public JButton getbInscripcionEnActividades() {
		return bInscripcionEnActividades;
	}

	public void setbInscripcionEnActividades(JButton bInscripcionEnActividades) {
		this.bInscripcionEnActividades = bInscripcionEnActividades;
	}

	public JButton getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(JButton bCancelar) {
		this.bCancelar = bCancelar;
	}

	public JButton getbAceptar() {
		return bAceptar;
	}

	public void setbAceptar(JButton bAceptar) {
		this.bAceptar = bAceptar;
	}
	
}
