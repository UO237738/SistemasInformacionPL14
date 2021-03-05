package Controlador;

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

import javax.swing.JOptionPane;

import Modelo.ModeloCrearActividades;

public class ControladorCrearActividades {

private VistaCrearActividades VCA;
private VistaCrearHorario VCH;
private VistaCrearPeriodoInscripcion VAPI;
	//Constructor
	public ControladorCrearActividades(VistaCrearActividades v) {
		this.VCA=v;
		this.addListenerVCA();
		this.initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		ModeloCrearActividades.cogerInstalaciones(VCA.cbInstalacion);
		ModeloCrearActividades.cogerActividades(VCA.cbActividad);
		VCA.contentPane.setVisible(true);
	}

	private void addListenerVCA() {
		// TODO Auto-generated method stub
		VCA.bAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Actividad creada con Exito!","Correcto",JOptionPane.INFORMATION_MESSAGE);
				VCA.contentPane.setVisible(false);
			}
		});
		
		VCA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VCA.contentPane.setVisible(false);
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
				if(date2.before(date1)) {
					JOptionPane.showMessageDialog( null, VCA.dcFechaFin , "Selecciona una fecha válida", JOptionPane.QUESTION_MESSAGE);
				}
				
			}
		});
		
		VCA.bCrearHorario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VCH.getContentPane().setVisible(true);
			}
		});
		
		VCA.bAsignar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VAPI.getContentPane().setVisible(true);
			}
		});
		
	}
}
