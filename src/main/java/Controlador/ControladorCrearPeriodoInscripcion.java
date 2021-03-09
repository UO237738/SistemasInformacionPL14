package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Vista.VistaAdmin;
import Vista.VistaCrearPeriodoInscripcion;

public class ControladorCrearPeriodoInscripcion {

	VistaCrearPeriodoInscripcion VCPI;
	VistaAdmin VA;
	
	public ControladorCrearPeriodoInscripcion() {
		VCPI = new VistaCrearPeriodoInscripcion();
		this.addListener();
		this.initView();
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
				JOptionPane.showMessageDialog(null, "Periodo inscripción creado!","Correcto",JOptionPane.INFORMATION_MESSAGE);
				VCPI.getFrame().setVisible(false);
				VA.getFrame().setVisible(true);
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
				java.util.Date date2=VCPI.getDcFechaFinSocios().getDate();
				java.util.Date date1= VCPI.getDcFechaInicioSocios().getDate();
				if(date2.before(date1)) {
					JOptionPane.showMessageDialog( null, VCPI.dcFechaFinSocios , "Selecciona una fecha válida", JOptionPane.QUESTION_MESSAGE);
				}
				if (VCPI.dcFechaFinSocios != null) {
						VCPI.getDcFechaFinNoSocios().getCalendarButton().setEnabled(true);
						VCPI.tfFechaInicioNoSocios.setEnabled(true);
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						Date fecha = new Date();
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
	
}
