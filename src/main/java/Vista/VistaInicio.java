package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VistaInicio extends JFrame {

	public JFrame contentPane;
	public JButton bAdministracion;
	public JButton bSocios;
	public JButton bNoSocios;
	public JButton bAceptar;
	public JButton bCancelar;
	public JButton bInicializarBbdd;
	public JButton bCargarBbdd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaInicio frame = new VistaInicio();
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
	

	public VistaInicio() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JFrame();
		contentPane.setTitle("Vista Inicio");
		contentPane.setBounds(5, 5, 600, 600);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.getContentPane().setLayout(null);
		
		
		JButton bAdministracin = new JButton("Administración");
		bAdministracin.setBounds(10, 36, 157, 31);
		contentPane.getContentPane().add(bAdministracin);
		
		JButton bSocios = new JButton("Socios");
		bSocios.setBounds(10, 91, 157, 31);
		contentPane.getContentPane().add(bSocios);
		
		JButton bNoSocios = new JButton("No socios");
		bNoSocios.setBounds(10, 149, 157, 31);
		contentPane.getContentPane().add(bNoSocios);
		
		JButton bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 239, 85, 21);
		contentPane.getContentPane().add(bCancelar);
		
		JButton bInicializarBbdd = new JButton("Inicializar bbdd");
		bInicializarBbdd.setBounds(258, 41, 85, 21);
		contentPane.getContentPane().add(bInicializarBbdd);
		
		JButton bCargarBbdd = new JButton("Cargar bbdd");
		bCargarBbdd.setBounds(243, 68, 180, 31);
		contentPane.getContentPane().add(bCargarBbdd);
	}

	public JFrame getContentPane() {
		return contentPane;
	}

	public void setContentPane(JFrame contentPane) {
		this.contentPane = contentPane;
	}

	public JButton getbAdministracion() {
		return bAdministracion;
	}

	public void setbAdministracion(JButton bAdministracion) {
		this.bAdministracion = bAdministracion;
	}

	public JButton getbSocios() {
		return bSocios;
	}

	public void setbSocios(JButton bSocios) {
		this.bSocios = bSocios;
	}

	public JButton getbNoSocios() {
		return bNoSocios;
	}

	public void setbNoSocios(JButton bNoSocios) {
		this.bNoSocios = bNoSocios;
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

	public JButton getbInicializarBbdd() {
		return bInicializarBbdd;
	}

	public void setbInicializarBbdd(JButton bInicializarBbdd) {
		this.bInicializarBbdd = bInicializarBbdd;
	}

	public JButton getbCargarBbdd() {
		return bCargarBbdd;
	}

	public void setbCargarBbdd(JButton bCargarBbdd) {
		this.bCargarBbdd = bCargarBbdd;
	}
	
}
