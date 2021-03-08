package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VistaAdmin extends JFrame {

	public JPanel contentPane;
	public JButton bPlanificarActividad;
	public JButton bListaActividades;
	public JButton bVerReservas;
	public JButton bHacerReserva;
	public JButton bCrearPeriodoInscripcion;
	public JButton bAceptar;
	public JButton bCancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAdmin frame = new VistaAdmin();
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
	public VistaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new JPanel());
		getContentPane().setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		
		JButton bPlanificarActividad = new JButton("PlanificarActividad");
		bPlanificarActividad.setBounds(10, 10, 173, 21);
		getContentPane().add(bPlanificarActividad);
		
		JButton bListaActividades = new JButton("Lista de actividades");
		bListaActividades.setBounds(10, 43, 173, 21);
		getContentPane().add(bListaActividades);
		
		JButton bVerReservas = new JButton("Ver reservas");
		bVerReservas.setBounds(10, 74, 173, 21);
		getContentPane().add(bVerReservas);
		
		JButton bHacerReserva = new JButton("Hacer reserva");
		bHacerReserva.setBounds(10, 105, 173, 21);
		getContentPane().add(bHacerReserva);
		
		JButton bCrearPeriodoDe = new JButton("Crear periodo de inscripción");
		bCrearPeriodoDe.setBounds(10, 136, 173, 21);
		getContentPane().add(bCrearPeriodoDe);
		
		JButton bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 226, 85, 21);
		contentPane.add(bCancelar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
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

	public JButton getbCrearPeriodoInscripcion() {
		return bCrearPeriodoInscripcion;
	}

	public void setbCrearPeriodoInscripcion(JButton bCrearPeriodoInscripcion) {
		this.bCrearPeriodoInscripcion = bCrearPeriodoInscripcion;
	}

	public JButton getbAceptar() {
		return bAceptar;
	}

	public void setbAceptar(JButton bAceptar) {
		this.bAceptar = bAceptar;
	}

	public JButton getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(JButton bCancelar) {
		this.bCancelar = bCancelar;
	}
	
	

}
