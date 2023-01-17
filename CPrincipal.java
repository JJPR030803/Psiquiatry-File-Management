package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Vista.VPrincipal;

public class CPrincipal implements ActionListener {
	VPrincipal p;
	
	
	CPrincipal(){
		this.p = new VPrincipal();
	}
	
	public void iniciar(){
		p.getBtnSalir().addActionListener(this);
		p.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(p.getBtnSalir())) {
		System.exit(0);
	}
		
	}
	

}
