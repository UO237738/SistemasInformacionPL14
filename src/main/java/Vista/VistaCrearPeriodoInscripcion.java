package Vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class VistaCrearPeriodoInscripcion {

	private JFrame frame;
	public JTextField tfFechaInicioNoSocios;
	public JDateChooser dcFechaInicioSocios;
	public JDateChooser dcFechaFinSocios;
	public JDateChooser dcFechaFinNoSocios;
	public JButton bAceptar;
	public JButton bCancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearPeriodoInscripcion window = new VistaCrearPeriodoInscripcion();
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
	public VistaCrearPeriodoInscripcion() {
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
		
		JLabel lblFechaInicioSocios = new JLabel("Fecha inicio socios:");
		lblFechaInicioSocios.setBounds(10, 21, 105, 13);
		frame.getContentPane().add(lblFechaInicioSocios);
		
		dcFechaInicioSocios = new JDateChooser();
		dcFechaInicioSocios.setBounds(149, 15, 126, 19);
		frame.getContentPane().add(dcFechaInicioSocios);
		
		JLabel lblFechaFinSocios = new JLabel("Fecha fin socios:");
		lblFechaFinSocios.setBounds(10, 62, 83, 13);
		frame.getContentPane().add(lblFechaFinSocios);
		
		dcFechaFinSocios = new JDateChooser();
		dcFechaFinSocios.getCalendarButton().setEnabled(false);
		dcFechaFinSocios.setBounds(149, 56, 126, 19);
		frame.getContentPane().add(dcFechaFinSocios);
		
		JLabel lblFechaInicioNo = new JLabel("Fecha inicio no socios:");
		lblFechaInicioNo.setBounds(10, 108, 117, 13);
		frame.getContentPane().add(lblFechaInicioNo);
		
		JLabel lblFechaFinNo = new JLabel("Fecha fin no socios:");
		lblFechaFinNo.setBounds(10, 138, 117, 13);
		frame.getContentPane().add(lblFechaFinNo);
		
		dcFechaFinNoSocios = new JDateChooser();
		dcFechaFinNoSocios.getCalendarButton().setEnabled(false);
		dcFechaFinNoSocios.setBounds(149, 132, 126, 19);
		frame.getContentPane().add(dcFechaFinNoSocios);
		
		tfFechaInicioNoSocios = new JTextField();
		tfFechaInicioNoSocios.setEnabled(false);
		tfFechaInicioNoSocios.setEditable(false);
		tfFechaInicioNoSocios.setBounds(149, 105, 126, 19);
		frame.getContentPane().add(tfFechaInicioNoSocios);
		tfFechaInicioNoSocios.setColumns(10);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 208, 85, 21);
		frame.getContentPane().add(bCancelar);
		
		bAceptar = new JButton("Aceptar");
		bAceptar.setEnabled(false);
		bAceptar.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(bAceptar);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTfFechaInicioNoSocios() {
		return tfFechaInicioNoSocios;
	}

	public void setTfFechaInicioNoSocios(JTextField tfFechaInicioNoSocios) {
		this.tfFechaInicioNoSocios = tfFechaInicioNoSocios;
	}

	public JDateChooser getDcFechaInicioSocios() {
		return dcFechaInicioSocios;
	}

	public void setDcFechaInicioSocios(JDateChooser dcFechaInicioSocios) {
		this.dcFechaInicioSocios = dcFechaInicioSocios;
	}

	public JDateChooser getDcFechaFinSocios() {
		return dcFechaFinSocios;
	}

	public void setDcFechaFinSocios(JDateChooser dcFechaFinSocios) {
		this.dcFechaFinSocios = dcFechaFinSocios;
	}

	public JDateChooser getDcFechaFinNoSocios() {
		return dcFechaFinNoSocios;
	}

	public void setDcFechaFinNoSocios(JDateChooser dcFechaFinNoSocios) {
		this.dcFechaFinNoSocios = dcFechaFinNoSocios;
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
