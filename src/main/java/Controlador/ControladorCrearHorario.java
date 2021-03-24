package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Vista.VistaAdmin;
import Vista.VistaCrearActividades;
import Vista.VistaCrearHorario;
import Modelo.ModeloCrearHorario;
import Modelo.ModeloHorarioDisplayDTO;


public class ControladorCrearHorario {

	private VistaCrearHorario VCH;
	private ModeloCrearHorario MCH;
	private VistaCrearActividades VCA;
	private ArrayList <Integer> ids;
	ControladorCrearActividades cca;
	
	
	public ControladorCrearHorario(ControladorCrearActividades cca) {
		this.cca=cca;
		MCH = new ModeloCrearHorario();
		VCH = new VistaCrearHorario();
		ids=new ArrayList<Integer>();
		this.initView();
		this.addListener();
		
	}


	
	private void initView() {
		// TODO Auto-generated method stub
		VCH.getFrame().setVisible(true);
	}


	private void addListener() {
		// TODO Auto-generated method stub
		VCH.bCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					VCH.getFrame().setVisible(false);
					VCA.getFrame().setVisible(true);
			}
		});
		
		VCH.bAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Horario creado con éxito!","Correcto",JOptionPane.INFORMATION_MESSAGE);
					VCH.getFrame().setVisible(false);
					
					crearHorario();
					//cca.setId_horario(crearHorario());
					//VCA.getFrame().setVisible(true);
			}
		});
		
		
		
		
		VCH.chbLunes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbLunes.isSelected()) {
					VCH.lLunes1.setEnabled(true);
					VCH.lLunes2.setEnabled(true);
					VCH.spLunesHI.setEnabled(true);
					VCH.spLunesHF.setEnabled(true);
//					VCH.chbMartes.setEnabled(false);
//					VCH.chbMiercoles.setEnabled(false);
//					VCH.chbJueves.setEnabled(false);
//					VCH.chbViernes.setEnabled(false);
//					VCH.chbSabado.setEnabled(false);
//					VCH.chbDomingo.setEnabled(false);
				}
				else {
					VCH.lLunes1.setEnabled(false);
					VCH.lLunes2.setEnabled(false);
					VCH.spLunesHI.setEnabled(false);
					VCH.spLunesHF.setEnabled(false);
//					VCH.chbMartes.setEnabled(true);
//					VCH.chbMiercoles.setEnabled(true);
//					VCH.chbJueves.setEnabled(true);
//					VCH.chbViernes.setEnabled(true);
//					VCH.chbSabado.setEnabled(true);
//					VCH.chbDomingo.setEnabled(true);
				
					
				}
			}
		});
		
		VCH.chbMartes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbMartes.isSelected()) {
					VCH.lMartes1.setEnabled(true);
					VCH.lMartes2.setEnabled(true);
					VCH.spMartesHI.setEnabled(true);
					VCH.spMartesHF.setEnabled(true);
//					VCH.chbLunes.setEnabled(false);
//					VCH.chbMiercoles.setEnabled(false);
//					VCH.chbJueves.setEnabled(false);
//					VCH.chbViernes.setEnabled(false);
//					VCH.chbSabado.setEnabled(false);
//					VCH.chbDomingo.setEnabled(false);
				}
				else {
					VCH.lMartes1.setEnabled(false);
					VCH.lMartes2.setEnabled(false);
					VCH.spMartesHI.setEnabled(false);
					VCH.spMartesHF.setEnabled(false);
//					VCH.chbLunes.setEnabled(true);
//					VCH.chbMiercoles.setEnabled(true);
//					VCH.chbJueves.setEnabled(true);
//					VCH.chbViernes.setEnabled(true);
//					VCH.chbSabado.setEnabled(true);
//					VCH.chbDomingo.setEnabled(true);
				}
			}
		});
		
		VCH.chbMiercoles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbMiercoles.isSelected()) {
					VCH.lMiercoles1.setEnabled(true);
					VCH.lMiercoles2.setEnabled(true);
					VCH.spMiercolesHI.setEnabled(true);
					VCH.spMiercolesHF.setEnabled(true);
//					VCH.chbMartes.setEnabled(false);
//					VCH.chbLunes.setEnabled(false);
//					VCH.chbJueves.setEnabled(false);
//					VCH.chbViernes.setEnabled(false);
//					VCH.chbSabado.setEnabled(false);
//					VCH.chbDomingo.setEnabled(false);
				}
				else {
					VCH.lMiercoles1.setEnabled(false);
					VCH.lMiercoles2.setEnabled(false);
					VCH.spMiercolesHI.setEnabled(false);
					VCH.spMiercolesHF.setEnabled(false);
//					VCH.chbMartes.setEnabled(true);
//					VCH.chbLunes.setEnabled(true);
//					VCH.chbJueves.setEnabled(true);
//					VCH.chbViernes.setEnabled(true);
//					VCH.chbSabado.setEnabled(true);
//					VCH.chbDomingo.setEnabled(true);
				}
			}
		});
		
		VCH.chbJueves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbJueves.isSelected()) {
					VCH.lJueves1.setEnabled(true);
					VCH.lJueves2.setEnabled(true);
					VCH.spJuevesHI.setEnabled(true);
					VCH.spJuevesHF.setEnabled(true);
//					VCH.chbMartes.setEnabled(false);
//					VCH.chbMiercoles.setEnabled(false);
//					VCH.chbLunes.setEnabled(false);
//					VCH.chbViernes.setEnabled(false);
//					VCH.chbSabado.setEnabled(false);
//					VCH.chbDomingo.setEnabled(false);
				}
				else {
					VCH.lJueves1.setEnabled(false);
					VCH.lJueves2.setEnabled(false);
					VCH.spJuevesHI.setEnabled(false);
					VCH.spJuevesHF.setEnabled(false);
//					VCH.chbMartes.setEnabled(true);
//					VCH.chbMiercoles.setEnabled(true);
//					VCH.chbLunes.setEnabled(true);
//					VCH.chbViernes.setEnabled(true);
//					VCH.chbSabado.setEnabled(true);
//					VCH.chbDomingo.setEnabled(true);
				}
			}
		});
		
		VCH.chbViernes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbViernes.isSelected()) {
					VCH.lViernes1.setEnabled(true);
					VCH.lViernes2.setEnabled(true);
					VCH.spViernesHI.setEnabled(true);
					VCH.spViernesHF.setEnabled(true);
//					VCH.chbMartes.setEnabled(false);
//					VCH.chbMiercoles.setEnabled(false);
//					VCH.chbJueves.setEnabled(false);
//					VCH.chbLunes.setEnabled(false);
//					VCH.chbSabado.setEnabled(false);
//					VCH.chbDomingo.setEnabled(false);
				}
				else {
					VCH.lViernes1.setEnabled(false);
					VCH.lViernes2.setEnabled(false);
					VCH.spViernesHI.setEnabled(false);
					VCH.spViernesHF.setEnabled(false);
//					VCH.chbMartes.setEnabled(true);
//					VCH.chbMiercoles.setEnabled(true);
//					VCH.chbJueves.setEnabled(true);
//					VCH.chbLunes.setEnabled(true);
//					VCH.chbSabado.setEnabled(true);
//					VCH.chbDomingo.setEnabled(true);
				}
			}
		});
		
		
		VCH.chbSabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbSabado.isSelected()) {
					VCH.lSabado1.setEnabled(true);
					VCH.lSabado2.setEnabled(true);
					VCH.spSabadoHI.setEnabled(true);
					VCH.spSabadoHF.setEnabled(true);
//					VCH.chbMartes.setEnabled(false);
//					VCH.chbMiercoles.setEnabled(false);
//					VCH.chbJueves.setEnabled(false);
//					VCH.chbViernes.setEnabled(false);
//					VCH.chbLunes.setEnabled(false);
//					VCH.chbDomingo.setEnabled(false);
				}
				else {
					VCH.lSabado1.setEnabled(false);
					VCH.lSabado2.setEnabled(false);
					VCH.spSabadoHI.setEnabled(false);
					VCH.spSabadoHF.setEnabled(false);
//					VCH.chbMartes.setEnabled(true);
//					VCH.chbMiercoles.setEnabled(true);
//					VCH.chbJueves.setEnabled(true);
//					VCH.chbViernes.setEnabled(true);
//					VCH.chbLunes.setEnabled(true);
//					VCH.chbDomingo.setEnabled(true);
				}
			}
		});
		
		VCH.chbDomingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbDomingo.isSelected()) {
					VCH.lDomingo1.setEnabled(true);
					VCH.lDomingo2.setEnabled(true);
					VCH.spDomingoHI.setEnabled(true);
					VCH.spDomingoHF.setEnabled(true);
//					VCH.chbMartes.setEnabled(false);
//					VCH.chbMiercoles.setEnabled(false);
//					VCH.chbJueves.setEnabled(false);
//					VCH.chbViernes.setEnabled(false);
//					VCH.chbSabado.setEnabled(false);
//					VCH.chbLunes.setEnabled(false);
				}
				else {
					VCH.lDomingo1.setEnabled(false);
					VCH.lDomingo2.setEnabled(false);
					VCH.spDomingoHI.setEnabled(false);
					VCH.spDomingoHF.setEnabled(false);
//					VCH.chbMartes.setEnabled(true);
//					VCH.chbMiercoles.setEnabled(true);
//					VCH.chbJueves.setEnabled(true);
//					VCH.chbViernes.setEnabled(true);
//					VCH.chbSabado.setEnabled(true);
//					VCH.chbLunes.setEnabled(true);
				}
			}
		});
		VCH.spLunesHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spLunesHI.getValue();

				if(valor<0) {
					VCH.spLunesHI.setValue(0);
				}
				if(valor>24) {
					VCH.spLunesHI.setValue(24);
				}
			}
		});
		
		
		VCH.spLunesHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spLunesHF.getValue();
				
				if(valor <0 ) {
					VCH.spLunesHF.setValue(0);
				}
				if(valor>24) {
					VCH.spLunesHF.setValue(24);
				}
			}
		});
		VCH.spMartesHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spMartesHI.getValue();
				
				if(valor <0 ) {
					VCH.spMartesHI.setValue(0);
				}
				if(valor>24) {
					VCH.spMartesHI.setValue(24);
				}
			}
		});
		VCH.spMartesHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spMartesHF.getValue();
				
				if(valor <0 ) {
					VCH.spMartesHF.setValue(0);
				}
				if(valor>24 ) {
					VCH.spMartesHF.setValue(24);
				}
			}
		});
		VCH.spMiercolesHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spMiercolesHI.getValue();
				if(valor <0 ) {
					VCH.spMiercolesHI.setValue(0);
				}
				if(valor>24 ) {
					VCH.spMiercolesHI.setValue(24);
				}
				
			}
		});
		VCH.spMiercolesHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spMiercolesHF.getValue();
				if(valor <0 ) {
					VCH.spMiercolesHF.setValue(0);
				}
				if(valor>24 ) {
					VCH.spMiercolesHF.setValue(24);
				}
				
			}
		});
		VCH.spJuevesHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spJuevesHI.getValue();
				if(valor <0 ) {
					VCH.spJuevesHI.setValue(0);
				}
				if(valor>24 ) {
					VCH.spJuevesHI.setValue(24);
				}
				
			}
		});
	
		VCH.spJuevesHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spJuevesHF.getValue();
				if(valor <0 ) {
					VCH.spJuevesHF.setValue(0);
				}
				if(valor>24 ) {
					VCH.spJuevesHF.setValue(24);
				}
				
			}
		});
		VCH.spViernesHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spViernesHI.getValue();
				
				if(valor <0 ) {
					VCH.spViernesHI.setValue(0);
				}
				if(valor>24 ) {
					VCH.spViernesHI.setValue(24);
				}
			
			}
		});
		VCH.spViernesHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spViernesHF.getValue();
				if(valor <0 ) {
					VCH.spViernesHF.setValue(0);
				}
				if(valor>24 ) {
					VCH.spViernesHF.setValue(24);
				}
				
			}
		});
		VCH.spSabadoHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spSabadoHI.getValue();
				if(valor <0 ) {
					VCH.spSabadoHI.setValue(0);
				}
				if(valor>24 ) {
					VCH.spSabadoHI.setValue(24);
				}
				
			}
		});
		VCH.spSabadoHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spSabadoHF.getValue();
				if(valor <0 ) {
					VCH.spSabadoHF.setValue(0);
				}
				if(valor>24 ) {
					VCH.spSabadoHF.setValue(24);
				}
			}
		});
		
		VCH.spDomingoHI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spDomingoHI.getValue();
				if(valor <0 ) {
					VCH.spDomingoHI.setValue(0);
				}
				if(valor>24 ) {
					VCH.spDomingoHI.setValue(24);
				}
			
			}
		});
		VCH.spDomingoHF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = (Integer) VCH.spDomingoHF.getValue();
				if(valor <0 ) {
					VCH.spDomingoHF.setValue(0);
				}
				if(valor>24 ) {
					VCH.spDomingoHF.setValue(24);
				}
			}
		});
		
		
	}
		
		private void crearHorario() {
			ArrayList<ModeloHorarioDisplayDTO> horarios = new ArrayList<ModeloHorarioDisplayDTO>();
			if(VCH.getChbLunes().isSelected()) {
				String dia = "Lunes";
			
				String horaIni = VCH.getSpLunesHI().getValue().toString();
				String horaFin = VCH.getSpLunesHF().getValue().toString();
				
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			if(VCH.getChbMartes().isSelected()) {
				String dia = "Martes";
			
				String horaIni = VCH.getSpMartesHI().getValue().toString();
				String horaFin = VCH.getSpMartesHF().getValue().toString();
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			if(VCH.getChbMiercoles().isSelected()) {
				String dia = "Miercoles";
			
				String horaIni = VCH.getSpMiercolesHI().getValue().toString();
				String horaFin = VCH.getSpMiercolesHF().getValue().toString();
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			if(VCH.getChbJueves().isSelected()) {
				String dia = "Jueves";
			
				String horaIni = VCH.getSpJuevesHI().getValue().toString();
				String horaFin = VCH.getSpJuevesHF().getValue().toString();
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			if(VCH.getChbViernes().isSelected()) {
				String dia = "Viernes";
			
				String horaIni = VCH.getSpViernesHI().getValue().toString();
				String horaFin = VCH.getSpViernesHF().getValue().toString();
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			if(VCH.getChbSabado().isSelected()) {
				String dia = "Sabado";
			
				String horaIni = VCH.getSpSabadoHI().getValue().toString();
				String horaFin = VCH.getSpSabadoHF().getValue().toString();
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			if(VCH.getChbDomingo().isSelected()) {
				String dia = "Domingo";
			
				String horaIni = VCH.getSpDomingoHI().getValue().toString();
				String horaFin = VCH.getSpDomingoHF().getValue().toString();
				horarios.add(new ModeloHorarioDisplayDTO(dia, horaIni, horaFin));
			}
			
			//ArrayList<ModeloHorarioDisplayDTO> horarios = new ArrayList<ModeloHorarioDisplayDTO>();
			
			for (ModeloHorarioDisplayDTO horario : horarios) {
				int id=MCH.setHorarios(horario);
				ids.add(id);
				System.out.println(id);
			}
			
			 
		
	}



		public ArrayList<Integer> getIds() {
			return ids;
		}



		public void setIds(ArrayList<Integer> ids) {
			this.ids = ids;
		}
	
	
	
	
	
}
