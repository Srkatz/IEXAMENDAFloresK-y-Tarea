package visual;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import codigo.Calculadora;
import visual.VentanaCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class VentanaVacia extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel panel;
	private static VentanaVacia f;
	
	 VentanaVacia() {
		panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		setSize(400,300);
		setVisible(true);

	}
	 
	 
	
	public  static void main(String [] args) {
		
		f = new VentanaVacia();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
}
