package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaCrearActividades extends JFrame {

	public JPanel contentPane;
	public JTextField tfPeriodoInscrip;
	public JTextField tfNoSocios;
	public JTextField tfSocios;
	public JTextField tfAforo;
	public JComboBox<String> cbInstalacion;
	public JComboBox<String> cbActividad;
	public JButton bCrearHorario;
	public JButton bCancelar;
	public JButton bAceptar;
	public JButton bAsignar;
	public JDateChooser dcFechaInicio;
	public JDateChooser dcFechaFin;
	private JTextField tfNombre;


	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VistaCrearActividades() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstalacin = new JLabel("Instalación:");
		lblInstalacin.setBounds(302, 36, 54, 19);
		contentPane.add(lblInstalacin);
		
		JLabel lblActividad = new JLabel("Actividad:");
		lblActividad.setBounds(10, 39, 46, 13);
		contentPane.add(lblActividad);
		
		JLabel lblAforo = new JLabel("Aforo:");
		lblAforo.setBounds(10, 62, 46, 13);
		contentPane.add(lblAforo);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setBounds(10, 85, 46, 13);
		contentPane.add(lblHorario);
		
		JLabel lblPeriodo = new JLabel("Periodo:");
		lblPeriodo.setBounds(10, 108, 46, 13);
		contentPane.add(lblPeriodo);
		
		JLabel lblCuotas = new JLabel("Cuotas:");
		lblCuotas.setBounds(10, 131, 46, 13);
		contentPane.add(lblCuotas);
		
		JLabel lblNoSocios = new JLabel("No socios:");
		lblNoSocios.setBounds(34, 171, 59, 13);
		contentPane.add(lblNoSocios);
		
		JButton bCrearHorario = new JButton("Crear horario");
		bCrearHorario.setBounds(69, 83, 96, 17);
		contentPane.add(bCrearHorario);
		
		JButton bAsignar = new JButton("Asignar periodo de inscripción");
		bAsignar.setBounds(10, 194, 171, 21);
		contentPane.add(bAsignar);
		
		JLabel lblPeriodoDeInscripcin = new JLabel("Periodo de inscripción:");
		lblPeriodoDeInscripcin.setBounds(191, 198, 111, 13);
		contentPane.add(lblPeriodoDeInscripcin);
		
		tfPeriodoInscrip = new JTextField();
		tfPeriodoInscrip.setEditable(false);
		tfPeriodoInscrip.setBounds(309, 195, 96, 19);
		contentPane.add(tfPeriodoInscrip);
		tfPeriodoInscrip.setColumns(10);
		
		JButton bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(10, 225, 85, 21);
		contentPane.add(bCancelar);
		
		JButton bAceptar = new JButton("Aceptar");
		bAceptar.setEnabled(false);
		bAceptar.setBounds(438, 225, 85, 21);
		contentPane.add(bAceptar);
		
		JLabel lblSocios = new JLabel("Socios:");
		lblSocios.setBounds(34, 154, 46, 13);
		contentPane.add(lblSocios);
		
		tfNoSocios = new JTextField();
		tfNoSocios.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if(((c < '0') || (c > '9')) && (c != '\b' ))
				      {
				         e.consume();  // ignorar el evento de teclado
				      }
			}
		});
		tfNoSocios.setBounds(94, 169, 46, 16);
		contentPane.add(tfNoSocios);
		tfNoSocios.setColumns(10);
		
		tfSocios = new JTextField();
		tfSocios.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if(((c < '0') || (c > '9')) && (c != '\b' ))
				      {
				         e.consume();  // ignorar el evento de teclado
				      }
			}
		});
		tfSocios.setColumns(10);
		tfSocios.setBounds(94, 151, 46, 16);
		contentPane.add(tfSocios);
		
		JLabel label = new JLabel("€");
		label.setBounds(150, 154, 46, 13);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("€");
		label_1.setBounds(150, 171, 46, 13);
		contentPane.add(label_1);
		
		JDateChooser dcFechaInicio = new JDateChooser();
		dcFechaInicio.setBounds(140, 102, 69, 19);
		contentPane.add(dcFechaInicio);
		
		JDateChooser dcFechaFin = new JDateChooser();
		dcFechaFin.getCalendarButton().setEnabled(false);
		dcFechaFin.setBounds(287, 102, 69, 19);
		contentPane.add(dcFechaFin);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setBounds(66, 108, 64, 13);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha fin");
		lblFechaFin.setBounds(238, 108, 64, 13);
		contentPane.add(lblFechaFin);
		
		JComboBox cbActividad = new JComboBox();
		cbActividad.setBounds(66, 35, 160, 21);
		contentPane.add(cbActividad);
		
		JComboBox cbInstalacion = new JComboBox();
		cbInstalacion.setBounds(371, 35, 152, 21);
		contentPane.add(cbInstalacion);
		
		tfAforo = new JTextField();
		tfAforo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if(((c < '0') || (c > '9')) && (c != '\b' ))
				      {
				         e.consume();  // ignorar el evento de teclado
				      }
			}
		});
		tfAforo.setBounds(69, 59, 96, 19);
		contentPane.add(tfAforo);
		tfAforo.setColumns(10);
		
		JLabel lblPersonas = new JLabel("personas");
		lblPersonas.setBounds(175, 62, 46, 13);
		contentPane.add(lblPersonas);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 16, 46, 13);
		contentPane.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(69, 13, 140, 19);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
	}



	public JPanel getContentPane() {
		return contentPane;
	}



	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
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



	public JButton getbAsignar() {
		return bAsignar;
	}



	public void setbAsignar(JButton bAsignar) {
		this.bAsignar = bAsignar;
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



	public JComboBox<String> getCbInstalacion() {
		return cbInstalacion;
	}



	public void setCbInstalacion(JComboBox<String> cbInstalacion) {
		this.cbInstalacion = cbInstalacion;
	}



	public JTextField getTextField() {
		return tfNombre;
	}



	public void setTfNombre(JTextField tfNombre) {
		this.tfNombre = tfNombre;
	}
	
}
