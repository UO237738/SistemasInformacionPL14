package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import Modelo.ModeloAdministracionContabilidad;
import Modelo.ModeloCrearActividadHorarioDisplayDTO;
import Modelo.ModeloCrearActividades;
import Modelo.ModeloHorarioDisplayDTO;
import Modelo.ModeloReservarTodaUnaActividad;
import Modelo.ModeloSocioVerReservasEntity;
import Vista.VistaAdmin;
import Vista.VistaReservarTodaUnaActividad;

public class ControladorReservarTodaUnaActividad {

	VistaReservarTodaUnaActividad VRTUA;
	ControladorAdmin CA;
	VistaAdmin VA;
	ModeloReservarTodaUnaActividad MRTUA;
	ArrayList<ModeloCrearActividadHorarioDisplayDTO> actividades;
	
	public ControladorReservarTodaUnaActividad() {
		MRTUA=new ModeloReservarTodaUnaActividad();
		VRTUA= new VistaReservarTodaUnaActividad();
		initView();
		addListener();
	}
	private void initView() {
		// TODO Auto-generated method stub
		VRTUA.getFrame().setVisible(true);
		cargaComboBox();
	}

	private void cargaComboBox() {
		// TODO Auto-generated method stub
		actividades= MRTUA.listarActividades();
		for(ModeloCrearActividadHorarioDisplayDTO actividad : actividades) {
			VRTUA.cbActividad.addItem(actividad.getNombre());
		}
		
	
	}
	private void addListener() {
		// TODO Auto-generated method stub
		VRTUA.cbActividad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = (String) VRTUA.cbActividad.getSelectedItem();
			
				if (text.length()!=23) {
					VRTUA.bRealizarReserva.setEnabled(true);
				}
				else {VRTUA.bRealizarReserva.setEnabled(false);}
			}
			
		
		});
		
		VRTUA.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VRTUA.getFrame().dispose();
				//VA.getFrame().setVisible(true);
			}
		});
		
		VRTUA.bRealizarReserva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				if(crearReservaTodaUnaActividad()) {
					VRTUA.getFrame().setVisible(false);
					
				}
			}
		});
		
		
	}
	protected boolean crearReservaTodaUnaActividad() {
		// TODO Auto-generated method stub
		boolean salida;
		String dni=VRTUA.getTfDNI().getText();
		ArrayList<ModeloSocioVerReservasEntity> reservasSocio;
		ModeloCrearActividadHorarioDisplayDTO actividad=actividades.get(VRTUA.getCbActividad().getSelectedIndex());
		actividad=MRTUA.listarHorario(actividad);
		
		/***********************************************/
		ArrayList<ModeloHorarioDisplayDTO> fechasActividad = cambiarFechas(actividad);
		/************************************************/
		salida = MRTUA.compruebaSocio(dni);
		System.out.println(salida);
		System.out.println(fechasActividad);
		
		if (salida==true) {
			System.out.println("Entré en el if");
			reservasSocio=MRTUA.obtenerReservasSocio(dni);
			System.out.println(reservasSocio);
			System.out.println("Avancé un poquito");
			
			for(ModeloSocioVerReservasEntity reserva : reservasSocio) {
				System.out.println("Avancé otro poquito");
				/*****************************/
				for(ModeloHorarioDisplayDTO factividad : fechasActividad) {
					/*************************/
					System.out.println("hola");
					System.out.println(reserva);
					if(reserva.getFechaIni().equals(factividad.getDia())) {
						System.out.println(factividad);
						System.out.println(reserva);
						if(!testOverlap(reserva.getHora_ini(), reserva.getHora_fin(),
								factividad.getHoraInicio(), factividad.getHoraFin())) {
							MRTUA.creaReserva(new ModeloSocioVerReservasEntity(0,
									factividad.getDia(),
									factividad.getDia(),
									actividad.getId_actividad(),
									actividad.getId_instalacion(),
									factividad.getHoraInicio(),
									factividad.getHoraFin(),
									reserva.getId_socio()));
						}
					}else {
						MRTUA.creaReserva(new ModeloSocioVerReservasEntity(0,
								factividad.getDia(),
								factividad.getDia(),
								actividad.getId_actividad(),
								actividad.getId_instalacion(),
								factividad.getHoraInicio(),
								factividad.getHoraFin(),
								reserva.getId_socio()));
					}
				}
			}
		}
		else {
			JOptionPane.showMessageDialog( null, "El DNI no pertenece a ningún socio","Alerta", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		return true;
		
	}

private boolean testOverlap(String hora_ini, String hora_fin, String horaInicio, String horaFin) {
		// TODO Auto-generated method stub
	System.out.println(hora_ini);
	System.out.println(horaInicio);
	System.out.println(hora_ini.compareTo(horaInicio)<0);
	return ((hora_ini.compareTo(horaInicio)<0) && (hora_ini.compareTo(horaFin) < 0) ||
	         (hora_fin.compareTo(horaInicio)<0) && (hora_fin.compareTo(horaFin)<0) ||
	         (horaInicio.compareTo(hora_ini)<0) && (horaInicio.compareTo(hora_fin)<0) ||
	         (hora_fin.compareTo(hora_ini)<0) && (horaFin.compareTo(hora_fin)<0));
	}

	private ArrayList<ModeloHorarioDisplayDTO> cambiarFechas(ModeloCrearActividadHorarioDisplayDTO actividad) {
		// TODO Auto-generated method stub
		String fechaIni=actividad.getFechaInicioActividad();
		String fechaFin=actividad.getFechaFinActividad();
		
		ArrayList<ModeloHorarioDisplayDTO> fechas = new ArrayList<ModeloHorarioDisplayDTO>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaInicio = null;
		Date fechaFinal = null;
		try {
			fechaFinal = (Date) sdf.parse(fechaFin);
			fechaInicio = (Date) sdf.parse(fechaIni);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fechaInicio);
		System.out.println(fechaFinal);
		System.out.println("caracola");
		for (Date i=fechaInicio;i.before(fechaFinal);i=new Date(i.getTime() + (1000 * 60 * 60 * 24))) {
			System.out.println("i"+i);
			for(int j=0;j<actividad.getHorarios().size();j++) {
				System.out.println("j"+j);
				if(diaSemana(i).equals(actividad.getHorarios().get(j).getDia())){
					SimpleDateFormat formateador = new SimpleDateFormat("dd/mm/yyyy");
					System.out.println("aqui?");
					fechas.add(new ModeloHorarioDisplayDTO(formateador.format(i),
							actividad.getHorarios().get(j).getHoraInicio(),
							actividad.getHorarios().get(j).getHoraFin()));
				}
			}	
		}
		return fechas;
	}
	private String diaSemana(Date i) {
		// TODO Auto-generated method stub
		 String letraD="";
		    int nD =-1;
		    Calendar c = Calendar.getInstance();

		    c.set(i.getYear(), i.getMonth(), i.getDay());
		    nD=c.get(Calendar.DAY_OF_WEEK); 
		    switch (nD){
		        case 1: letraD = "Domingo";
		            break;
		        case 2: letraD = "Lunes";
		            break;
		        case 3: letraD = "Martes";
		            break;
		        case 4: letraD = "Miercoles";
		            break;
		        case 5: letraD = "Jueves";
		            break;
		        case 6: letraD = "Viernes";
		            break;
		        case 7: letraD = "Sabado";
		            break;
		    }

		    return letraD;
	}				//Este metodo comprobara que la hora de la izquierda es menor que la de la izquierda
	public boolean Compara_horas(String[] h1 , String[] h2) {
		
		
		int h10,h11,h20,h21;
		
		if(h1[1].contentEquals("00")) h11 =0;
		else {h11 = Integer.parseInt(h1[1]);}
		
		if(h2[1].contentEquals("00")) h21 =0;
		else {h21 = Integer.parseInt(h2[1]);}
		
		h10 = Integer.parseInt(h1[0]);
		h20 = Integer.parseInt(h2[0]);
		
		if(h10< h20) return true;
		else if (h10 == h20) {
			if(h11 < h21) return true;
		}

		return false;
		
	}
}