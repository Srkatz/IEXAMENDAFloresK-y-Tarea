package visual;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.synth.ColorType;

import org.w3c.dom.css.RGBColor;

import codigo.Calculadora;
import visual.VentanaCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("unused")
public class VentanaGeneral extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton calculadora;
	JButton azul;
	JButton azul_blanco;
	JButton fucsia;
	JButton rojo;
	JButton verde;
	JPanel panel;
	private static VentanaGeneral f;
	
	 VentanaGeneral() {
		calculadora = new JButton("calculadora");
		calculadora.setBounds(80,30,120,30);
		azul = new JButton("azul");
		azul.setBounds(200,30,120,30);
		azul_blanco = new JButton("azul y blanco");
		azul_blanco.setBounds(80,100,120,30);
		fucsia = new JButton("fucsia");
		fucsia.setBounds(200,100,120,30);
		rojo = new JButton("rojo");
		rojo.setBounds(145,150,120,30);
		
		verde = new JButton("verde");
		verde.setBounds(145,200,120,30);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(calculadora);
		panel.add(azul);
		panel.add(azul_blanco);
		panel.add(fucsia);
		panel.add(rojo);
		panel.add(verde);
		
		add(panel);
		
		setSize(400,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		   calculadora.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {

			       VentanaCalculadora ventana = new VentanaCalculadora();
			       ventana.setLocationRelativeTo(null);
			       ventana.setVisible(true);
			      }
			    });
		   
		   azul.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {

			       VentanaVacia ventana = new VentanaVacia();
			       ventana.setLocationRelativeTo(null);
			       ventana.panel.setBackground(Color.blue);
			       ventana.setVisible(true);
			      }
			    });
		   rojo.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {

			       VentanaVacia ventana = new VentanaVacia();
			       ventana.setLocationRelativeTo(null);
			       ventana.panel.setBackground(Color.red);
			       ventana.setVisible(true);
			      }
			    });
		   
		   fucsia.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {

			       VentanaVacia ventana = new VentanaVacia();
			       ventana.setLocationRelativeTo(null);
			       ventana.panel.setBackground(Color.magenta);
			       ventana.setVisible(true);
			      }
			    });
		   
		   azul_blanco.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {

			    	  VentanaGrid ventana = new VentanaGrid();
			       ventana.setLocationRelativeTo(null);
			       ventana.panel.setBackground(Color.blue);
			       ventana.setVisible(true);
			       
			      }
			    });
		   
		   verde.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {

			       VentanaVacia ventana = new VentanaVacia();
			       ventana.setLocationRelativeTo(null);
			       ventana.panel.setBackground(Color.green);
			       ventana.setVisible(true);
			      }
			    });
	}
	 
	 
	
	public  static void main(String [] args) {
		
		f = new VentanaGeneral();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
}
