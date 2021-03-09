package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Vista.VistaAdmin;
import Vista.VistaCrearHorario;
import Modelo.ModeloHorarioDisplayDTO;


public class ControladorCrearHorario {

	private VistaCrearHorario VCH;
	private ModeloHorarioDisplayDTO MHDD;
	private VistaAdmin VA;
	ControladorCrearHorario CCH;
	
	
	public ControladorCrearHorario() {
		VCH = new VistaCrearHorario();
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
					VA.getFrame().setVisible(true);
			}
		});
		
		VCH.bAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Horario creado con éxito!","Correcto",JOptionPane.INFORMATION_MESSAGE);
					VCH.getFrame().setVisible(false);
					VA.getFrame().setVisible(true);
			}
		});
		
		
		
		
		VCH.chbLunes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VCH.chbLunes.isSelected()) {
					VCH.lLunes1.setEnabled(true);
					VCH.lLunes2.setEnabled(true);
					VCH.spLunesHI.setEnabled(true);
					VCH.spLunesHF.setEnabled(true);
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
				}
			}
		});
		
		crearHorario(MHDD.getId_horario());
		
		
	}
		
		private void crearHorario(int id_horario) {
			ArrayList<ModeloHorarioDisplayDTO> horario = new ArrayList<ModeloHorarioDisplayDTO>();
			if(VCH.getChbLunes().isSelected()) {
				String dia = "Lunes";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpLunesHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpLunesHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			if(VCH.getChbMartes().isSelected()) {
				String dia = "Martes";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpMartesHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpMartesHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			if(VCH.getChbMiercoles().isSelected()) {
				String dia = "Miercoles";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpMiercolesHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpMiercolesHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			if(VCH.getChbJueves().isSelected()) {
				String dia = "Jueves";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpJuevesHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpJuevesHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			if(VCH.getChbViernes().isSelected()) {
				String dia = "Viernes";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpViernesHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpViernesHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			if(VCH.getChbSabado().isSelected()) {
				String dia = "Sabado";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpSabadoHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpSabadoHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			if(VCH.getChbDomingo().isSelected()) {
				String dia = "Domingo";
			
				String horaIni = (new SimpleDateFormat("HH").format(VCH.getSpDomingoHI().getValue()));
				String horaFin = (new SimpleDateFormat("HH").format(VCH.getSpDomingoHF().getValue()));
				horario.add(new ModeloHorarioDisplayDTO(id_horario,dia, horaIni, horaFin));
			}
			
		
		
	}
	
	
	
	
	
}
