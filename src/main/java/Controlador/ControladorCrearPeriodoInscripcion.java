package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Modelo.ModeloCrearPeriodoInscripcion;
import Modelo.ModeloCrearPeriodoInscripcionDisplayDTO;
import Vista.VistaAdmin;
import Vista.VistaCrearPeriodoInscripcion;

public class ControladorCrearPeriodoInscripcion {

	VistaCrearPeriodoInscripcion VCPI;
	VistaAdmin VA;
	ModeloCrearPeriodoInscripcion MCPI;
	
	public ControladorCrearPeriodoInscripcion() {
		VCPI = new VistaCrearPeriodoInscripcion();
		this.initView();
		this.addListener();
		
	}

	private void initView() {
		// TODO Auto-generated method stub
		VCPI.getFrame().setVisible(true);
	}

	private void addListener() {
		// TODO Auto-generated method stub
		VCPI.bAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				java.util.Date date3=VCPI.getDcFechaFinNoSocios().getDate();
				java.util.Date date2=VCPI.getDcFechaFinSocios().getDate();
				java.util.Date date1= VCPI.getDcFechaInicioSocios().getDate();
				java.util.Date date= new Date();
				if(date1.before(date)) {
					JOptionPane.showMessageDialog( null, VCPI.dcFechaFinSocios , "Selecciona una fecha válida para inicio socios", JOptionPane.QUESTION_MESSAGE);
				}
				else if(date2.before(date1)) {
					JOptionPane.showMessageDialog( null, VCPI.dcFechaFinSocios , "Selecciona una fecha válida para fin socios", JOptionPane.QUESTION_MESSAGE);
				}
				else if(date3.before(date2)) {
					JOptionPane.showMessageDialog( null, VCPI.dcFechaFinNoSocios , "Selecciona una fecha válida para fin no socios", JOptionPane.QUESTION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Periodo inscripción creado!","Correcto",JOptionPane.INFORMATION_MESSAGE);
					VCPI.getFrame().setVisible(false);
					
					crearInscripcion();
				}
			
			}

		});
		
		VCPI.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VCPI.getFrame().setVisible(false);
				VA.getFrame().setVisible(true);
			}
		});
		
		VCPI.getDcFechaInicioSocios().addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				if(VCPI.dcFechaInicioSocios != null) {
					VCPI.getDcFechaFinSocios().getCalendarButton().setEnabled(true);
				}
			}
		});
		
		VCPI.getDcFechaFinSocios().addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				if (VCPI.dcFechaFinSocios != null) {
						VCPI.getDcFechaFinNoSocios().getCalendarButton().setEnabled(true);
						VCPI.tfFechaInicioNoSocios.setEnabled(true);
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						Date fecha = VCPI.getDcFechaFinSocios().getDate();
						String F = sdf.format(fecha);
						VCPI.tfFechaInicioNoSocios.setText(F);
				}
				
			}
		});
		
		VCPI.getDcFechaFinNoSocios().addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				if(VCPI.dcFechaFinNoSocios != null) {
					VCPI.bAceptar.setEnabled(true);
				}
			}
		});
		
	}
	
	public void crearInscripcion() {
		
		
		String FI= new SimpleDateFormat("dd/MM/yyyy").format(VCPI.getDcFechaInicioSocios().getDate());
		String FF=new SimpleDateFormat("dd/MM/yyyy").format(VCPI.getDcFechaFinSocios().getDate());
		String FFN=new SimpleDateFormat("dd/MM/yyyy").format(VCPI.getDcFechaFinNoSocios().getDate());
		ModeloCrearPeriodoInscripcionDisplayDTO periodo = new ModeloCrearPeriodoInscripcionDisplayDTO(FI,FF,FFN);
		
		System.out.println(FI);
		System.out.println(FF);
		System.out.println(FFN);
		MCPI.setPeriodo(periodo);
	}
	
}
