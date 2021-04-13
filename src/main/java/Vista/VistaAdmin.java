package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class VistaAdmin {

	public JFrame frame;
	public JButton bPlanificarActividad;
	public JButton bListaActividades;
	public JButton bVerReservas;
	public JButton bHacerReserva;
	public JButton bCrearPeriodoInscripcion;
	public JButton bResInstalacion;
	public JButton bListarActOfertadas;
	public JButton bContabilidad;
	public JButton bCancelar;
	public JButton bReservarTodaUnaActividad;
	
	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAdmin window = new VistaAdmin();
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
	public VistaAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 254);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		bPlanificarActividad = new JButton("Planificar actividad");
		bPlanificarActividad.setBounds(10, 10, 194, 21);
		frame.getContentPane().add(bPlanificarActividad);
		
		bListaActividades = new JButton("Lista de actividades");
		bListaActividades.setBounds(10, 40, 194, 21);
		frame.getContentPane().add(bListaActividades);
		
		bVerReservas = new JButton("Ver reservas");
		bVerReservas.setBounds(10, 71, 194, 21);
		frame.getContentPane().add(bVerReservas);
		
		bHacerReserva = new JButton("Hacer reserva");
		bHacerReserva.setBounds(10, 102, 194, 21);
		frame.getContentPane().add(bHacerReserva);
		
		bCrearPeriodoInscripcion = new JButton("Crear periodo de inscripción");
		bCrearPeriodoInscripcion.setBounds(261, 10, 194, 21);
		frame.getContentPane().add(bCrearPeriodoInscripcion);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(191, 163, 85, 21);
		frame.getContentPane().add(bCancelar);
		
		bListarActOfertadas = new JButton("Listar Actividades en un Periodo");
		bListarActOfertadas.setBounds(261, 71, 194, 21);
		frame.getContentPane().add(bListarActOfertadas);
		
		bResInstalacion = new JButton("Reserva Instalacion Socios");
		bResInstalacion.setBounds(261, 102, 194, 21);
		frame.getContentPane().add(bResInstalacion);
		
		bReservarTodaUnaActividad = new JButton("Reservar toda una actividad");
		bReservarTodaUnaActividad.setBounds(10, 228, 194, 21);
		frame.getContentPane().add(bReservarTodaUnaActividad);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getbPlanificarActividad() {
		return bPlanificarActividad;
	}

	public void setbPlanificarActividad(JButton bPlanificarActividad) {
		this.bPlanificarActividad = bPlanificarActividad;
	}

	public JButton getbListaActividades() {
		return bListaActividades;
	}

	public void setbListaActividades(JButton bListaActividades) {
		this.bListaActividades = bListaActividades;
	}

	public JButton getbVerReservas() {
		return bVerReservas;
	}

	public void setbVerReservas(JButton bVerReservas) {
		this.bVerReservas = bVerReservas;
	}

	public JButton getbHacerReserva() {
		return bHacerReserva;
	}

	public void setbHacerReserva(JButton bHacerReserva) {
		this.bHacerReserva = bHacerReserva;
	}

	public JButton getbCrearPeriodoDeInscripcion() {
		return bCrearPeriodoInscripcion;
	}

	public void setbCrearPeriodoDeInscripcion(JButton bCrearPeriodoDeInscripcion) {
		this.bCrearPeriodoInscripcion = bCrearPeriodoDeInscripcion;
	}
	public JButton getbCrearPeriodoInscripcion() {
		return bCrearPeriodoInscripcion;
	}

	public void setbCrearPeriodoInscripcion(JButton bCrearPeriodoInscripcion) {
		this.bCrearPeriodoInscripcion = bCrearPeriodoInscripcion;
	}

	public JButton getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(JButton bCancelar) {
		this.bCancelar = bCancelar;
	}
}
