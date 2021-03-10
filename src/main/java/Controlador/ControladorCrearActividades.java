package Controlador;

import Vista.VistaAdmin;
import Vista.VistaCrearActividades;
import Vista.VistaCrearHorario;
import Vista.VistaCrearPeriodoInscripcion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import Modelo.ModeloCrearActividades;

public class ControladorCrearActividades {


private VistaCrearActividades VCA;

private ControladorCrearPeriodoInscripcion CCPI;
private ModeloCrearActividades MCA;
private ControladorCrearHorario CCA;
private ControladorAdmin CA;
private ControladorCrearHorario CCH;

	//Constructor
	public ControladorCrearActividades(ControladorAdmin CA) {
		this.CA=CA;
		VCA = new VistaCrearActividades();
		MCA = new ModeloCrearActividades();
		this.addListenerVCA();
		this.initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		ModeloCrearActividades.cogerInstalaciones(VCA.cbInstalacion);
		ModeloCrearActividades.cogerActividades(VCA.cbActividad);
		ModeloCrearActividades.cogerPeriodos(VCA.cbPeriodoInscripcion);
		VCA.getFrame().setVisible(true);
	}

	private void addListenerVCA() {
		// TODO Auto-generated method stub
		VCA.tfNombre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.tfNombre == null) {
					VCA.cbInstalacion.setEditable(false);
				}
				else { VCA.cbInstalacion.setEditable(true);}
			}
		});
		
		VCA.tfNoSocios.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if(((c < '0') || (c > '9')) && (c != '\b' ))
				      {
				         e.consume();  // ignorar el evento de teclado
				      }
			}
		});
		
		VCA.tfSocios.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if(((c < '0') || (c > '9')) && (c != '\b' ))
				      {
				         e.consume();  // ignorar el evento de teclado
				      }
			}
		});
		
		VCA.cbActividad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.cbActividad != null) {
					VCA.tfAforo.setEnabled(true);
				}
			}
		});
		
		VCA.cbInstalacion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.cbInstalacion != null) {
					VCA.cbActividad.setEnabled(true);
				}
			}
		});
		
		VCA.cbPeriodoInscripcion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.cbInstalacion != null) {
					VCA.cbActividad.setEnabled(true);
				}
			}
		});
		
		
		VCA.tfAforo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.tfAforo != null) {
					VCA.bCrearHorario.setEnabled(true);
					VCA.dcFechaInicio.setEnabled(true);
				}
				
			}
		});
		
		VCA.tfAforo.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(((c < '0') || (c > '9')) && (c != '\b' )){
					e.consume();  // ignorar el evento de teclado
					
				}
			}
		});
		
		
		VCA.bAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Actividad creada con Exito!","Correcto",JOptionPane.INFORMATION_MESSAGE);
				VCA.getFrame().setVisible(false);
				
			}
		});
		
		VCA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VCA.getFrame().dispose();
				CA.getVA().getFrame().setVisible(true);
			}
		});
		
		VCA.getDcFechaInicio().addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if(VCA.getDcFechaInicio().getDate()!=null) {
					VCA.getDcFechaFin().getCalendarButton().setEnabled(true);
				}
			}
		});
		
		VCA.getDcFechaFin().addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				java.util.Date date2=VCA.getDcFechaFin().getDate();
				java.util.Date date1= VCA.getDcFechaInicio().getDate();
				//if(date2.before(date1)) {
				//	JOptionPane.showMessageDialog( null, VCA.dcFechaFin , "Selecciona una fecha válida", JOptionPane.QUESTION_MESSAGE);
				//}
				if (VCA.dcFechaFin != null) {
					VCA.tfSocios.setEnabled(true);
				}
				
			}
		});
		
		VCA.tfSocios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.tfSocios != null) {
					VCA.tfNoSocios.setEnabled(true);
				}
			}
		});
		
		VCA.tfNoSocios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.tfNoSocios != null) {
					VCA.cbPeriodoInscripcion.setEnabled(true);
				}
			}
		});
		
		VCA.tfPeriodoInscrip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.tfPeriodoInscrip != null) {
					VCA.bAceptar.setEnabled(true);
				}
			}
		});
		
		
		VCA.bCrearHorario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CCH = new ControladorCrearHorario();
			}
		});
		
		
		
	}

	
	
	
}
