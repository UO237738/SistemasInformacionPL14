package Controlador;

import Vista.VistaAdmin;
import Vista.VistaCrearActividades;
import Vista.VistaCrearHorario;
import Vista.VistaCrearPeriodoInscripcion;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import Modelo.ModeloCrearActividadDisplayDTO;
import Modelo.ModeloCrearActividades;
import Modelo.ModeloCrearPeriodoInscripcionDisplayDTO;

public class ControladorCrearActividades {


private VistaCrearActividades VCA;

private ControladorCrearPeriodoInscripcion CCPI;
private ModeloCrearActividades MCA;
private ControladorCrearHorario CCA;
private ControladorAdmin CA;
private ControladorCrearHorario CCH;
private int id_horario;
ArrayList<ModeloCrearPeriodoInscripcionDisplayDTO> periodos;
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
		//ModeloCrearActividades.cogerActividades(VCA.cbActividad);
		periodos = ModeloCrearActividades.cogerPeriodos();
		VCA.cbPeriodoInscripcion.addItem("Selecciona un periodo de inscripción");
		for (ModeloCrearPeriodoInscripcionDisplayDTO periodo : periodos) {
			VCA.cbPeriodoInscripcion.addItem(periodo.getNombre());
		}
			
		VCA.getFrame().setVisible(true);
	}
	
	private ControladorCrearActividades getCCA() {
		return this;
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
		
//		VCA.cbActividad.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				if (VCA.cbActividad != null) {
//					VCA.tfAforo.setEnabled(true);
//				}
//			}
//		});
		
		VCA.cbInstalacion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (VCA.cbInstalacion != null) {
					//VCA.cbActividad.setEnabled(true);
				}
			}
		});
		
		VCA.cbPeriodoInscripcion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String text = (String) VCA.cbPeriodoInscripcion.getSelectedItem();
				VCA.tfPeriodoInscrip.setText(text);
				VCA.bAceptar.setEnabled(false);
				if ((text.length()>0) && (text.length()<25)) {
					VCA.bAceptar.setEnabled(true);
				}
				else { VCA.bAceptar.setEnabled(false); }
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
				java.util.Date date2=VCA.getDcFechaFin().getDate();
				java.util.Date date1= VCA.getDcFechaInicio().getDate();
				java.util.Date date= new Date();
				
				if (date1.before(date)) {
					JOptionPane.showMessageDialog( null, VCA.dcFechaInicio , "Selecciona una fecha válida para inicio socios", JOptionPane.QUESTION_MESSAGE);
				}
				else if (date2.before(date1)) {
					JOptionPane.showMessageDialog( null, VCA.dcFechaFin , "Selecciona una fecha válida para fin socios", JOptionPane.QUESTION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Actividad creada con Exito!","Correcto",JOptionPane.INFORMATION_MESSAGE);
					VCA.getFrame().setVisible(false);
					crearActividad();
				}
			}

		});
		
		VCA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VCA.getFrame().setVisible(false);
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
		
//		VCA.tfPeriodoInscrip.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				if ((VCA.tfPeriodoInscrip.getText().length()<0) || (VCA.tfPeriodoInscrip.getText().length()>5)) {
//					VCA.bAceptar.setEnabled(true);
//				}
//			}
//		});
		
		
		VCA.bCrearHorario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CCH = new ControladorCrearHorario(getCCA());
				
			}
		});
		
		
	}

	private void crearActividad() {
		// TODO Auto-generated method stub
		
		//String nombre_instalacion= VCA.getCbInstalacion().getText
		//int id_instalacion= VCA.getCbInstalacion().getText()
		String nombre = VCA.tfNombre.getText();
		
		int idInst= (int) VCA.cbInstalacion.getSelectedIndex(); 
		
		String af = VCA.tfAforo.getText();
		int aforo = Integer.parseInt(af);
		
		String cs = VCA.tfSocios.getText();
		int cuotaSocio = Integer.parseInt(cs);
		
		String cns = VCA.tfNoSocios.getText();
		int cuotaNoSocio = Integer.parseInt(cns);
		
		
		String FI= new SimpleDateFormat("dd/MM/yyyy").format(VCA.getDcFechaInicio().getDate());
		String FF= new SimpleDateFormat("dd/MM/yyyy").format(VCA.getDcFechaFin().getDate());
		
		int idInsc= periodos.get(VCA.cbPeriodoInscripcion.getSelectedIndex()-1).getId();
		
		
		
		
		ModeloCrearActividadDisplayDTO actividad = new ModeloCrearActividadDisplayDTO(idInst,nombre, aforo, cuotaSocio,
				cuotaNoSocio,FI,FF,idInsc);
		int idActividad=MCA.setNuevaActividad(actividad);
		
		
		ArrayList<Integer> ids = CCH.getIds();
		for (Integer idHorario : ids) {
			MCA.setHorarioActividad(idHorario,idActividad);
		}
		
		
	
	
	}

	
	
	
}
