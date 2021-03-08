package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.ModeloInicio;
import Vista.VistaAdmin;
import Vista.VistaInicio;
import giis.demo.util.Database;

public class ControladorInicio {
	
	
	//private VistaSocios VS;
	//private VistaNoSocios VnS;
	private VistaAdmin VA;
	private VistaInicio VI;
	private ModeloInicio MI;

	public ControladorInicio() {
		
		this.VI=new VistaInicio();
		MI = new ModeloInicio();
		this.initView();
		this.addListener();
	
	}
	
	public void initView() {
		VI.contentPane.setVisible(true);
	}

	private void addListener() {
		// TODO Auto-generated method stub
		VI.bAdministracion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.contentPane.setVisible(false);
				VA.contentPane.setVisible(true);
			}
		});
		
		VI.bInicializarBbdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Database db=new Database();
				db.createDatabase(false);
				
			}
		});
		
		VI.bCargarBbdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Database db=new Database();
				db.createDatabase(false);
				db.loadDatabase();
				
			}
		});
		/*VI.bNoSocios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.contentPane.setVisible(false);
				VnS.contentPane.setVisible(true);
			}
		});
		VI.bSocios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.contentPane.setVisible(false);
				VS.contentPane.setVisible(true);
			}
		});*/
		
		VI.bCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				VI.contentPane.setVisible(false);
				
			}
		});
	}

	public VistaInicio getVI() {
		return VI;
	}

	public void setVI(VistaInicio vI) {
		VI = vI;
	}
	
	
	
}
