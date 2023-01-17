package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VPrincipal extends JFrame{

	
	
	public VPrincipal(){
		
		
		panelmenu.setBounds(0, 0, tamPanelMenuAncho, tamPanelMenuAltura);
		panelmenu.setBackground(Color.CYAN);
		panelmenu.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panelmenu.add(btnPacientes);
		panelmenu.add(btnRegistroPacientes);
		panelmenu.add(btnCitas);
		panelmenu.add(btnSalir);
		
		
		
		btnPacientes.setText("Pacientes");
		btnPacientes.setHorizontalAlignment(SwingConstants.LEFT);
		btnPacientes.setBackground(Color.LIGHT_GRAY);
		//btnPacientes.setBounds(10, (20),(int)( tamPanelMenuAncho*0.9), tamPanelMenuAltura/16);
		btnPacientes.setPreferredSize(new Dimension((int) (tamPanelMenuAncho*0.9),tamPanelMenuAltura/16));
		
		btnRegistroPacientes.setText("Registrar Pacientes");
		btnRegistroPacientes.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistroPacientes.setBackground(Color.LIGHT_GRAY);
		//btnRegistroPacientes.setBounds(10, tamPanelMenuAltura/10,(int)( tamPanelMenuAncho*0.9), tamPanelMenuAltura/16);
		btnRegistroPacientes.setPreferredSize(new Dimension((int) (tamPanelMenuAncho*0.9),tamPanelMenuAltura/16));
		
		btnCitas.setText("Citas");
		btnCitas.setHorizontalAlignment(SwingConstants.LEFT);
		btnCitas.setBackground(Color.LIGHT_GRAY);
		//btnCitas.setBounds(10, (int) (tamPanelMenuAltura/5.7),(int)( tamPanelMenuAncho*0.9), tamPanelMenuAltura/16);
		btnCitas.setPreferredSize(new Dimension((int) (tamPanelMenuAncho*0.9),tamPanelMenuAltura/16));
		
		
		btnSalir.setText("Salir");
		btnSalir.setBackground(Color.RED);
		btnSalir.setBounds(tamPanelMenuAncho/20, (int) (tamPanelMenuAltura*0.9), tamPanelMenuAncho/2, tamPanelMenuAltura/15);
		
		setBounds(posicionVentanaX, posicionVentanaY, ancho, altura);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	   // setUndecorated(true);

		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().add(panelmenu);
		getContentPane().setLayout(null);
	}
	
	 public JPanel getPanelmenu() {
		return panelmenu;
	}
	public void setPanelmenu(JPanel panelmenu) {
		this.panelmenu = panelmenu;
	}
	public JButton getBtnPacientes() {
		return btnPacientes;
	}
	public void setBtnPacientes(JButton btnPacientes) {
		this.btnPacientes = btnPacientes;
	}
	public JButton getBtnRegistroPacientes() {
		return btnRegistroPacientes;
	}
	public void setBtnRegistroPacientes(JButton btnRegistroPacientes) {
		this.btnRegistroPacientes = btnRegistroPacientes;
	}
	public JButton getBtnCitas() {
		return btnCitas;
	}
	public void setBtnCitas(JButton btnCitas) {
		this.btnCitas = btnCitas;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	JMenu menu = new JMenu();
     JPanel panelmenu = new JPanel();
     JButton btnPacientes = new JButton();
     JButton btnRegistroPacientes = new JButton();
     JButton btnCitas = new JButton();
     JButton btnSalir = new JButton();
     
	Dimension maxScreen = Toolkit.getDefaultToolkit().getScreenSize();
	
	public int ancho = (int) maxScreen.getWidth();
	public int altura = (int) maxScreen.getHeight();
	public int posicionVentanaX = ancho/2;
	public int posicionVentanaY = altura/2;
    int tamPanelMenuAncho = ancho/6;
    int tamPanelMenuAltura = altura;
    int posbtnClientesAncho = tamPanelMenuAncho/100;
    int posbtnReportes = tamPanelMenuAncho/4;
    int posbtnAltura = tamPanelMenuAltura/4;
	int tam = 50;
}