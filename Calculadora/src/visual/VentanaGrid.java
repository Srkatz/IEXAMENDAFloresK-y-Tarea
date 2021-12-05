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
public class VentanaGrid extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel panel;
	private static VentanaGrid f;
	
	 VentanaGrid() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel rightPanel = new JPanel();
	    JPanel leftPanel = new JPanel();
	    panel.setLayout(new GridLayout(1,2));
		add(panel);
		panel.add(rightPanel);
		panel.add(leftPanel);
		rightPanel.setBackground(Color.blue);
	    leftPanel.setBackground(Color.white);
		setSize(400,300);
		setVisible(true);

	}
	 
	 
	
	public  static void main(String [] args) {
		
		f = new VentanaGrid();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
}
