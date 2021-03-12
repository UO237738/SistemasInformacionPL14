package Vista;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VistaCrearActividades {

	private JFrame frame;
	public JTextField tfPeriodoInscrip;
	public JTextField tfNoSocios;
	public JTextField tfSocios;
	public JTextField tfAforo;
	public JComboBox<String> cbInstalacion;
	public JComboBox<String> cbActividad;
	public JComboBox<String> cbPeriodoInscripcion;
	public JButton bCrearHorario;
	public JButton bCancelar;
	public JButton bAceptar;
	public JDateChooser dcFechaInicio;
	public JDateChooser dcFechaFin;
	public JTextField tfNombre;
	public JLabel lPeriodoDeInscripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearActividades window = new VistaCrearActividades();
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
	public VistaCrearActividades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstalacin = new JLabel("Instalación:");
		lblInstalacin.setBounds(302, 36, 54, 19);
		frame.getContentPane().add(lblInstalacin);
		
//		JLabel lblActividad = new JLabel("Actividad:");
//		lblActividad.setEnabled(false);
//		lblActividad.setBounds(10, 39, 46, 13);
//		frame.getContentPane().add(lblActividad);
		
		JLabel lblAforo = new JLabel("Aforo:");
		lblAforo.setBounds(10, 62, 46, 13);
		frame.getContentPane().add(lblAforo);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setBounds(10, 85, 46, 13);
		frame.getContentPane().add(lblHorario);
		
		JLabel lblPeriodo = new JLabel("Periodo:");
		lblPeriodo.setBounds(10, 108, 46, 13);
		frame.getContentPane().add(lblPeriodo);
		
		JLabel lblCuotas = new JLabel("Cuotas:");
		lblCuotas.setBounds(10, 131, 46, 13);
		frame.getContentPane().add(lblCuotas);
		
		JLabel lblNoSocios = new JLabel("No socios:");
		lblNoSocios.setBounds(34, 171, 59, 13);
		frame.getContentPane().add(lblNoSocios);
		
		bCrearHorario = new JButton("Crear horario");
		bCrearHorario.setEnabled(false);
		bCrearHorario.setBounds(69, 83, 96, 17);
		frame.getContentPane().add(bCrearHorario);
		
		lPeriodoDeInscripcion = new JLabel("Periodo de inscripción:");
		lPeriodoDeInscripcion.setBounds(191, 198, 111, 13);
		frame.getContentPane().add(lPeriodoDeInscripcion);
		
		tfPeriodoInscrip = new JTextField();
		tfPeriodoInscrip.setBounds(309, 195, 96, 19);
		frame.getContentPane().add(tfPeriodoInscrip);
		tfPeriodoInscrip.setColumns(10);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 225, 85, 21);
		frame.getContentPane().add(bCancelar);
		
		bAceptar = new JButton("Aceptar");
		bAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bAceptar.setEnabled(false);
		bAceptar.setBounds(438, 225, 85, 21);
		frame.getContentPane().add(bAceptar);
		
		JLabel lblSocios = new JLabel("Socios:");
		lblSocios.setBounds(34, 154, 46, 13);
		frame.getContentPane().add(lblSocios);
		
		tfNoSocios = new JTextField();
		
		tfNoSocios.setBounds(94, 169, 46, 16);
		frame.getContentPane().add(tfNoSocios);
		tfNoSocios.setColumns(10);
		
		tfSocios = new JTextField();
		
		tfSocios.setColumns(10);
		tfSocios.setBounds(94, 151, 46, 16);
		frame.getContentPane().add(tfSocios);
		
		JLabel label = new JLabel("€");
		label.setBounds(150, 154, 46, 13);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("€");
		label_1.setBounds(150, 171, 46, 13);
		frame.getContentPane().add(label_1);
		
		dcFechaInicio = new JDateChooser();
		dcFechaInicio.setBounds(140, 102, 69, 19);
		frame.getContentPane().add(dcFechaInicio);
		
		dcFechaFin = new JDateChooser();
		dcFechaFin.setBounds(287, 102, 69, 19);
		frame.getContentPane().add(dcFechaFin);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setBounds(66, 108, 64, 13);
		frame.getContentPane().add(lblFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha fin");
		lblFechaFin.setBounds(238, 108, 64, 13);
		frame.getContentPane().add(lblFechaFin);
		
		//cbActividad = new JComboBox();
		//cbActividad.setBounds(66, 35, 160, 21);
		//frame.getContentPane().add(cbActividad);
		
		cbInstalacion = new JComboBox();
		cbInstalacion.setEditable(true);
		cbInstalacion.setBounds(371, 35, 152, 21);
		frame.getContentPane().add(cbInstalacion);
		
		tfAforo = new JTextField();
		tfAforo.setBounds(69, 59, 96, 19);
		frame.getContentPane().add(tfAforo);
		tfAforo.setColumns(10);
		
		JLabel lblPersonas = new JLabel("personas");
		lblPersonas.setBounds(175, 62, 46, 13);
		frame.getContentPane().add(lblPersonas);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 16, 46, 13);
		frame.getContentPane().add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(69, 13, 96, 19);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		cbPeriodoInscripcion = new JComboBox();
		
		cbPeriodoInscripcion.setEditable(true);
		cbPeriodoInscripcion.setBounds(10, 194, 155, 21);
		frame.getContentPane().add(cbPeriodoInscripcion);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTfPeriodoInscrip() {
		return tfPeriodoInscrip;
	}

	public void setTfPeriodoInscrip(JTextField tfPeriodoInscrip) {
		this.tfPeriodoInscrip = tfPeriodoInscrip;
	}

	public JTextField getTfNoSocios() {
		return tfNoSocios;
	}

	public void setTfNoSocios(JTextField tfNoSocios) {
		this.tfNoSocios = tfNoSocios;
	}

	public JTextField getTfSocios() {
		return tfSocios;
	}

	public void setTfSocios(JTextField tfSocios) {
		this.tfSocios = tfSocios;
	}

	public JTextField getTfAforo() {
		return tfAforo;
	}

	public void setTfAforo(JTextField tfAforo) {
		this.tfAforo = tfAforo;
	}

	public JComboBox<String> getCbInstalacion() {
		return cbInstalacion;
	}

	public void setCbInstalacion(JComboBox<String> cbInstalacion) {
		this.cbInstalacion = cbInstalacion;
	}

	public JComboBox<String> getCbActividad() {
		return cbActividad;
	}

	public void setCbActividad(JComboBox<String> cbActividad) {
		this.cbActividad = cbActividad;
	}

	public JButton getbCrearHorario() {
		return bCrearHorario;
	}

	public void setbCrearHorario(JButton bCrearHorario) {
		this.bCrearHorario = bCrearHorario;
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

	

	public JDateChooser getDcFechaInicio() {
		return dcFechaInicio;
	}

	public void setDcFechaInicio(JDateChooser dcFechaInicio) {
		this.dcFechaInicio = dcFechaInicio;
	}

	public JDateChooser getDcFechaFin() {
		return dcFechaFin;
	}

	public void setDcFechaFin(JDateChooser dcFechaFin) {
		this.dcFechaFin = dcFechaFin;
	}

	public JTextField getTfNombre() {
		return tfNombre;
	}

	public void setTfNombre(JTextField tfNombre) {
		this.tfNombre = tfNombre;
	}

	public JLabel getlPeriodoDeInscripcion() {
		return lPeriodoDeInscripcion;
	}

	public void setlPeriodoDeInscripcion(JLabel lPeriodoDeInscripcion) {
		this.lPeriodoDeInscripcion = lPeriodoDeInscripcion;
	}

	public JComboBox<String> getCbPeriodoInscripcion() {
		return cbPeriodoInscripcion;
	}

	public void setCbPeriodoInscripcion(JComboBox<String> cbPeriodoInscripcion) {
		this.cbPeriodoInscripcion = cbPeriodoInscripcion;
	}
	
}
