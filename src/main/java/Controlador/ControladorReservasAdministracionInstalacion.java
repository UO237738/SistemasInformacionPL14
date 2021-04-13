package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


import Modelo.ModeloReservaAdministracioninstalación;
import Vista.VistaReservaadministracionAplicacion;
import giis.demo.util.Util;

public class ControladorReservasAdministracionInstalacion {

	private VistaReservaadministracionAplicacion VRA;
	private ModeloReservaAdministracioninstalación MRA;
	
	public ControladorReservasAdministracionInstalacion() {
		VRA = new VistaReservaadministracionAplicacion();
		this.addListenerCRA();
		this.initView();
	}


	public static String getFechaActual() {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(ahora);
	}

	public void addListenerCRA() {

		

		VRA.JDFechaIni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((!VRA.JDFechaIni.getJFormattedTextField().getText().isEmpty())&&(VRA.CBInstalaciones.getSelectedIndex()>0)&&(!VRA.TFieldDni.getText().isEmpty())) {
					VRA.JButtonReservar.setEnabled(true);
				}
				else {
					VRA.JButtonReservar.setEnabled(false);
				}
			}
		});

		

		

		VRA.TFieldDni.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char charecter = e.getKeyChar();
				if (Character.isLowerCase(charecter)) {
					e.setKeyChar(Character.toUpperCase(charecter));
				}
			}
		});

		VRA.TFieldDni.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {

				if ((!VRA.JDFechaIni.getJFormattedTextField().getText().isEmpty())&&(VRA.CBInstalaciones.getSelectedIndex()>0)&&(!VRA.TFieldDni.getText().isEmpty())) {
					VRA.JButtonReservar.setEnabled(true);
				}
				else {
					VRA.JButtonReservar.setEnabled(false);
				}

			}
		});



		VRA.JButtonReservar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date fechaActual= Util.isoStringToDate(getFechaActual());
				Date fechaInicioS= Util.isoStringToDate(VRA.JDFechaIni.getJFormattedTextField().getText());

				if(fechaInicioS.equals(fechaActual)||(fechaInicioS.after(fechaActual))) {
					if(fechaInicioS.equals(fechaActual)||(fechaInicioS.after(fechaActual))) {
						if(ModeloReservaAdministracioninstalación.comprobarPlazoMaximo((String)VRA.CBInstalaciones.getSelectedItem(),VRA.JDFechaIni.getJFormattedTextField().getText())) {
							int conflicto=ModeloReservaAdministracioninstalación.comprobarConflictoReservas(ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRA.CBInstalaciones.getSelectedItem()),VRA.JDFechaIni.getJFormattedTextField().getText(),VRA.JDFechaIni.getJFormattedTextField().getText(),(String)VRA.CBDesde.getSelectedItem(),(String)VRA.CBHasta.getSelectedItem());
							if(conflicto>=1) {
								JOptionPane.showMessageDialog(null, "La instalacion esta ocupada para esa fecha", "Error",JOptionPane.ERROR_MESSAGE);
							}
							else {
								int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRA.CBInstalaciones.getSelectedItem());
								String nombreSocio=ModeloReservaAdministracioninstalación.obtenerNombreSocio(VRA.TFieldDni.getText());
								String apellidosSocio=ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VRA.TFieldDni.getText());
								ModeloReservaAdministracioninstalación.CrearReservaM(idInstalacion,VRA.JDFechaIni.getJFormattedTextField().getText(),(String)VRA.CBDesde.getSelectedItem(),(String)VRA.CBHasta.getSelectedItem());
								ModeloReservaAdministracioninstalación.CrearResguardo(VRA.TFieldDni.getText(),(String)VRA.CBInstalaciones.getSelectedItem(),VRA.JDFechaIni.getJFormattedTextField().getText(),(String)VRA.CBDesde.getSelectedItem(), (String)VRA.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);
								JOptionPane.showMessageDialog(null, "Reserva creada con exito","Correcto",JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null,"No se puede reservar con tanta antelacion (Maximo 30 dias)","Error",JOptionPane.ERROR_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Por favor, selecione una fecha posterior a la actual","Error",JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}

		});

		
	}

	public void CreaReserva() {
		int idInstalacion=ModeloReservaAdministracioninstalación.ObtenerIdInstalacion((String)VRA.CBInstalaciones.getSelectedItem());
		String nombreSocio=ModeloReservaAdministracioninstalación.obtenerNombreSocio(VRA.TFieldDni.getText());
		String apellidosSocio=ModeloReservaAdministracioninstalación.obtenerApellidosSocio(VRA.TFieldDni.getText());
		ModeloReservaAdministracioninstalación.CrearReservaM(idInstalacion,VRA.JDFechaIni.getJFormattedTextField().getText(),(String)VRA.CBDesde.getSelectedItem(),(String)VRA.CBHasta.getSelectedItem());
		ModeloReservaAdministracioninstalación.CrearResguardo(VRA.TFieldDni.getText(),(String)VRA.CBInstalaciones.getSelectedItem(),VRA.JDFechaIni.getJFormattedTextField().getText(),(String)VRA.CBDesde.getSelectedItem(), (String)VRA.CBHasta.getSelectedItem(), nombreSocio, apellidosSocio);
		JOptionPane.showMessageDialog(null, "Reserva creada con exito","Correcto",JOptionPane.INFORMATION_MESSAGE);
	}



	public void initView() {
		//VRA.setFInicio(ModeloNuevaReserva.getFechaActual());
		ModeloReservaAdministracioninstalación.ObtenerInstalaciones(VRA.CBInstalaciones);

		VRA.getFrameR().setVisible(true);
	}
	
	
	
	
	
}

