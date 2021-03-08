package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class VistaCrearHorario extends JFrame {

	public JPanel contentPane;
	public JCheckBox chbLunes;
	public JCheckBox chbMartes;
	public JCheckBox chbMiercoles;
	public JCheckBox chbJueves;
	public JCheckBox chbViernes;
	public JCheckBox chbSabado;
	public JCheckBox chbDomingo;
	public JSpinner spLunesHI;
	public JSpinner spMartesHI;
	public JSpinner spMiercolesHI;
	public JSpinner spJuevesHI;
	public JSpinner spViernesHI;
	public JSpinner spSabadoHI;
	public JSpinner spDomingoHI;
	public JSpinner spLunesHF;
	public JSpinner spMartesHF;
	public JSpinner spMiercolesHF;
	public JSpinner spJuevesHF;
	public JSpinner spViernesHF;
	public JSpinner spSabadoHF;
	public JSpinner spDomingoHF;
	public JLabel lLunes1;
	public JLabel lLunes2;
	
	public JLabel lMartes1;
	public JLabel lMartes2;
	
	public JLabel lMiercoles1;
	public JLabel lMiercoles2;
	
	public JLabel lJueves1;
	public JLabel lJueves2;
	
	public JLabel lViernes1;
	public JLabel lViernes2;
	
	public JLabel lSabado1;
	public JLabel lSabado2;
	
	public JLabel lDomingo1;
	public JLabel lDomingo2;
	
	public JButton bAceptar;
	public JButton bCancelar;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCrearHorario frame = new VistaCrearHorario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaCrearHorario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chbLunes = new JCheckBox("Lunes");
		chbLunes.setBounds(6, 6, 69, 21);
		contentPane.add(chbLunes);
		
		JCheckBox chbMartes = new JCheckBox("Martes");
		chbMartes.setBounds(6, 42, 95, 21);
		contentPane.add(chbMartes);
		
		JCheckBox chbMircoles = new JCheckBox("Miércoles");
		chbMircoles.setBounds(6, 79, 95, 21);
		contentPane.add(chbMircoles);
		
		JCheckBox chbJueves = new JCheckBox("Jueves");
		chbJueves.setBounds(6, 118, 95, 21);
		contentPane.add(chbJueves);
		
		JCheckBox chbViernes = new JCheckBox("Viernes");
		chbViernes.setBounds(6, 155, 95, 21);
		contentPane.add(chbViernes);
		
		JCheckBox chbSabado = new JCheckBox("Sábado");
		chbSabado.setBounds(6, 193, 95, 21);
		contentPane.add(chbSabado);
		
		JCheckBox chbDomingo = new JCheckBox("Domingo");
		chbDomingo.setBounds(6, 236, 95, 21);
		contentPane.add(chbDomingo);
		
		JLabel lLunes1 = new JLabel("Hora inicio:");
		lLunes1.setEnabled(false);
		lLunes1.setBounds(107, 10, 79, 13);
		contentPane.add(lLunes1);
		
		JSpinner spLunesHI = new JSpinner();
		spLunesHI.setEnabled(false);
		spLunesHI.setBounds(200, 7, 30, 20);
		contentPane.add(spLunesHI);
		
		JLabel lMartes1 = new JLabel("Hora inicio:");
		lMartes1.setEnabled(false);
		lMartes1.setBounds(107, 46, 79, 13);
		contentPane.add(lMartes1);
		
		JLabel lMiercoles1 = new JLabel("Hora inicio:");
		lMiercoles1.setEnabled(false);
		lMiercoles1.setBounds(107, 83, 79, 13);
		contentPane.add(lMiercoles1);
		
		JLabel lJueves1 = new JLabel("Hora inicio:");
		lJueves1.setEnabled(false);
		lJueves1.setBounds(107, 122, 79, 13);
		contentPane.add(lJueves1);
		
		JLabel lViernes1 = new JLabel("Hora inicio:");
		lViernes1.setEnabled(false);
		lViernes1.setBounds(107, 159, 79, 13);
		contentPane.add(lViernes1);
		
		JLabel lSabado1 = new JLabel("Hora inicio:");
		lSabado1.setEnabled(false);
		lSabado1.setBounds(107, 197, 79, 13);
		contentPane.add(lSabado1);
		
		JLabel lDomingo1 = new JLabel("Hora inicio:");
		lDomingo1.setEnabled(false);
		lDomingo1.setBounds(107, 240, 79, 13);
		contentPane.add(lDomingo1);
		
		JSpinner spMartesHI = new JSpinner();
		spMartesHI.setEnabled(false);
		spMartesHI.setBounds(200, 43, 30, 20);
		contentPane.add(spMartesHI);
		
		JSpinner spMiercolesHI = new JSpinner();
		spMiercolesHI.setEnabled(false);
		spMiercolesHI.setBounds(200, 80, 30, 20);
		contentPane.add(spMiercolesHI);
		
		JSpinner spJuevesHI = new JSpinner();
		spJuevesHI.setEnabled(false);
		spJuevesHI.setBounds(200, 119, 30, 20);
		contentPane.add(spJuevesHI);
		
		JSpinner spViernesHI = new JSpinner();
		spViernesHI.setEnabled(false);
		spViernesHI.setBounds(200, 156, 30, 20);
		contentPane.add(spViernesHI);
		
		JSpinner spSabadoHI = new JSpinner();
		spSabadoHI.setEnabled(false);
		spSabadoHI.setBounds(200, 194, 30, 20);
		contentPane.add(spSabadoHI);
		
		JSpinner spDomingoHI = new JSpinner();
		spDomingoHI.setEnabled(false);
		spDomingoHI.setBounds(200, 237, 30, 20);
		contentPane.add(spDomingoHI);
		
		JLabel lblH = new JLabel("h");
		lblH.setBounds(240, 10, 22, 13);
		contentPane.add(lblH);
		
		JLabel label_6 = new JLabel("h");
		label_6.setBounds(240, 46, 22, 13);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("h");
		label_7.setBounds(240, 83, 22, 13);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("h");
		label_8.setBounds(240, 122, 22, 13);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("h");
		label_9.setBounds(240, 159, 22, 13);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("h");
		label_10.setBounds(240, 197, 22, 13);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("h");
		label_11.setBounds(240, 240, 22, 13);
		contentPane.add(label_11);
		
		JLabel lLunes2 = new JLabel("Hora fin:");
		lLunes2.setEnabled(false);
		lLunes2.setBounds(288, 10, 46, 13);
		contentPane.add(lLunes2);
		
		JSpinner spLunesHF = new JSpinner();
		spLunesHF.setEnabled(false);
		spLunesHF.setBounds(344, 7, 30, 20);
		contentPane.add(spLunesHF);
		
		JLabel lMartes2 = new JLabel("Hora fin:");
		lMartes2.setEnabled(false);
		lMartes2.setBounds(288, 46, 46, 13);
		contentPane.add(lMartes2);
		
		JLabel lMiercoles2 = new JLabel("Hora fin:");
		lMiercoles2.setEnabled(false);
		lMiercoles2.setBounds(288, 83, 46, 13);
		contentPane.add(lMiercoles2);
		
		JLabel lJueves2 = new JLabel("Hora fin:");
		lJueves2.setEnabled(false);
		lJueves2.setBounds(288, 122, 46, 13);
		contentPane.add(lJueves2);
		
		JLabel lViernes2 = new JLabel("Hora fin:");
		lViernes2.setEnabled(false);
		lViernes2.setBounds(288, 159, 46, 13);
		contentPane.add(lViernes2);
		
		JLabel lSabado2 = new JLabel("Hora fin:");
		lSabado2.setEnabled(false);
		lSabado2.setBounds(288, 197, 46, 13);
		contentPane.add(lSabado2);
		
		JLabel lDomingo2 = new JLabel("Hora fin:");
		lDomingo2.setEnabled(false);
		lDomingo2.setBounds(288, 240, 46, 13);
		contentPane.add(lDomingo2);
		
		JSpinner spMartesHF = new JSpinner();
		spMartesHF.setEnabled(false);
		spMartesHF.setBounds(344, 43, 30, 20);
		contentPane.add(spMartesHF);
		
		JSpinner spMiercolesHF = new JSpinner();
		spMiercolesHF.setEnabled(false);
		spMiercolesHF.setBounds(344, 80, 30, 20);
		contentPane.add(spMiercolesHF);
		
		JSpinner spJuevesHF = new JSpinner();
		spJuevesHF.setEnabled(false);
		spJuevesHF.setBounds(344, 119, 30, 20);
		contentPane.add(spJuevesHF);
		
		JSpinner spViernesHF = new JSpinner();
		spViernesHF.setEnabled(false);
		spViernesHF.setBounds(344, 156, 30, 20);
		contentPane.add(spViernesHF);
		
		JSpinner spSabadoHF = new JSpinner();
		spSabadoHF.setEnabled(false);
		spSabadoHF.setBounds(344, 194, 30, 20);
		contentPane.add(spSabadoHF);
		
		JSpinner spDomingoHF = new JSpinner();
		spDomingoHF.setEnabled(false);
		spDomingoHF.setBounds(344, 237, 30, 20);
		contentPane.add(spDomingoHF);
		
		JLabel label_18 = new JLabel("h");
		label_18.setBounds(381, 10, 22, 13);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("h");
		label_19.setBounds(381, 46, 22, 13);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("h");
		label_20.setBounds(381, 83, 22, 13);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("h");
		label_21.setBounds(381, 122, 22, 13);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("h");
		label_22.setBounds(384, 159, 22, 13);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("h");
		label_23.setBounds(384, 197, 22, 13);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("h");
		label_24.setBounds(381, 240, 22, 13);
		contentPane.add(label_24);
		
		JButton bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(6, 282, 85, 21);
		contentPane.add(bCancelar);
		
		JButton bAceptar = new JButton("Aceptar");
		bAceptar.setBounds(330, 282, 85, 21);
		contentPane.add(bAceptar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JCheckBox getChbLunes() {
		return chbLunes;
	}

	public void setChbLunes(JCheckBox chbLunes) {
		this.chbLunes = chbLunes;
	}

	public JCheckBox getChbMartes() {
		return chbMartes;
	}

	public void setChbMartes(JCheckBox chbMartes) {
		this.chbMartes = chbMartes;
	}

	public JCheckBox getChbMiercoles() {
		return chbMiercoles;
	}

	public void setChbMiercoles(JCheckBox chbMiercoles) {
		this.chbMiercoles = chbMiercoles;
	}

	public JCheckBox getChbJueves() {
		return chbJueves;
	}

	public void setChbJueves(JCheckBox chbJueves) {
		this.chbJueves = chbJueves;
	}

	public JCheckBox getChbViernes() {
		return chbViernes;
	}

	public void setChbViernes(JCheckBox chbViernes) {
		this.chbViernes = chbViernes;
	}

	public JCheckBox getChbSabado() {
		return chbSabado;
	}

	public void setChbSabado(JCheckBox chbSabado) {
		this.chbSabado = chbSabado;
	}

	public JCheckBox getChbDomingo() {
		return chbDomingo;
	}

	public void setChbDomingo(JCheckBox chbDomingo) {
		this.chbDomingo = chbDomingo;
	}

	public JSpinner getSpLunesHI() {
		return spLunesHI;
	}

	public void setSpLunesHI(JSpinner spLunesHI) {
		this.spLunesHI = spLunesHI;
	}

	public JSpinner getSpMartesHI() {
		return spMartesHI;
	}

	public void setSpMartesHI(JSpinner spMartesHI) {
		this.spMartesHI = spMartesHI;
	}

	public JSpinner getSpMiercolesHI() {
		return spMiercolesHI;
	}

	public void setSpMiercolesHI(JSpinner spMiercolesHI) {
		this.spMiercolesHI = spMiercolesHI;
	}

	public JSpinner getSpJuevesHI() {
		return spJuevesHI;
	}

	public void setSpJuevesHI(JSpinner spJuevesHI) {
		this.spJuevesHI = spJuevesHI;
	}

	public JSpinner getSpViernesHI() {
		return spViernesHI;
	}

	public void setSpViernesHI(JSpinner spViernesHI) {
		this.spViernesHI = spViernesHI;
	}

	public JSpinner getSpSabadoHI() {
		return spSabadoHI;
	}

	public void setSpSabadoHI(JSpinner spSabadoHI) {
		this.spSabadoHI = spSabadoHI;
	}

	public JSpinner getSpDomingoHI() {
		return spDomingoHI;
	}

	public void setSpDomingoHI(JSpinner spDomingoHI) {
		this.spDomingoHI = spDomingoHI;
	}

	public JSpinner getSpLunesHF() {
		return spLunesHF;
	}

	public void setSpLunesHF(JSpinner spLunesHF) {
		this.spLunesHF = spLunesHF;
	}

	public JSpinner getSpMartesHF() {
		return spMartesHF;
	}

	public void setSpMartesHF(JSpinner spMartesHF) {
		this.spMartesHF = spMartesHF;
	}

	public JSpinner getSpMiercolesHF() {
		return spMiercolesHF;
	}

	public void setSpMiercolesHF(JSpinner spMiercolesHF) {
		this.spMiercolesHF = spMiercolesHF;
	}

	public JSpinner getSpJuevesHF() {
		return spJuevesHF;
	}

	public void setSpJuevesHF(JSpinner spJuevesHF) {
		this.spJuevesHF = spJuevesHF;
	}

	public JSpinner getSpViernesHF() {
		return spViernesHF;
	}

	public void setSpViernesHF(JSpinner spViernesHF) {
		this.spViernesHF = spViernesHF;
	}

	public JSpinner getSpSabadoHF() {
		return spSabadoHF;
	}

	public void setSpSabadoHF(JSpinner spSabadoHF) {
		this.spSabadoHF = spSabadoHF;
	}

	public JSpinner getSpDomingoHF() {
		return spDomingoHF;
	}

	public void setSpDomingoHF(JSpinner spDomingoHF) {
		this.spDomingoHF = spDomingoHF;
	}

	public JLabel getlLunes1() {
		return lLunes1;
	}

	public void setlLunes1(JLabel lLunes1) {
		this.lLunes1 = lLunes1;
	}

	public JLabel getlLunes2() {
		return lLunes2;
	}

	public void setlLunes2(JLabel lLunes2) {
		this.lLunes2 = lLunes2;
	}

	public JLabel getlMartes1() {
		return lMartes1;
	}

	public void setlMartes1(JLabel lMartes1) {
		this.lMartes1 = lMartes1;
	}

	public JLabel getlMartes2() {
		return lMartes2;
	}

	public void setlMartes2(JLabel lMartes2) {
		this.lMartes2 = lMartes2;
	}

	public JLabel getlMiercoles1() {
		return lMiercoles1;
	}

	public void setlMiercoles1(JLabel lMiercoles1) {
		this.lMiercoles1 = lMiercoles1;
	}

	public JLabel getlMiercoles2() {
		return lMiercoles2;
	}

	public void setlMiercoles2(JLabel lMiercoles2) {
		this.lMiercoles2 = lMiercoles2;
	}

	public JLabel getlJueves1() {
		return lJueves1;
	}

	public void setlJueves1(JLabel lJueves1) {
		this.lJueves1 = lJueves1;
	}

	public JLabel getlJueves2() {
		return lJueves2;
	}

	public void setlJueves2(JLabel lJueves2) {
		this.lJueves2 = lJueves2;
	}

	public JLabel getlViernes1() {
		return lViernes1;
	}

	public void setlViernes1(JLabel lViernes1) {
		this.lViernes1 = lViernes1;
	}

	public JLabel getlViernes2() {
		return lViernes2;
	}

	public void setlViernes2(JLabel lViernes2) {
		this.lViernes2 = lViernes2;
	}

	public JLabel getlSabado1() {
		return lSabado1;
	}

	public void setlSabado1(JLabel lSabado1) {
		this.lSabado1 = lSabado1;
	}

	public JLabel getlSabado2() {
		return lSabado2;
	}

	public void setlSabado2(JLabel lSabado2) {
		this.lSabado2 = lSabado2;
	}

	public JLabel getlDomingo1() {
		return lDomingo1;
	}

	public void setlDomingo1(JLabel lDomingo1) {
		this.lDomingo1 = lDomingo1;
	}

	public JLabel getlDomingo2() {
		return lDomingo2;
	}

	public void setlDomingo2(JLabel lDomingo2) {
		this.lDomingo2 = lDomingo2;
	}

	public JButton getbAceptar() {
		return bAceptar;
	}

	public void setbAceptar(JButton bAceptar) {
		this.bAceptar = bAceptar;
	}

	public JButton getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(JButton bCancelar) {
		this.bCancelar = bCancelar;
	}
	
	
}
