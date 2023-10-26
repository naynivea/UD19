package saluda;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Saluda  extends JFrame {
	
	
	/*
	 * Panel
	 */
	
	private JPanel contentPanel;
	
	public Saluda() {
		
		//Es para cuando cerrar la ventana, se finaliza la ejecución de la app
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Definir título de la app
		setTitle("Mi aplicación Swing: Saluda");
		
		//Definir tamaño de la ventana con
		setBounds(400,350,450,400);
		
		//Crear panel
		contentPanel = new JPanel();
		
		//Diseño
		contentPanel.setLayout(null);
		
		//Insertar panel a la ventana
		setContentPane(contentPanel);
		
		//Crear etiqueta con texto
		JLabel etiqueta = new JLabel("Cuál es tu nombre?");
		
		//definir tamaño de etiqueta
		etiqueta.setBounds(100,20,250,40);
		
		//agregar etiqueta al panel
		contentPanel.add(etiqueta);
		
		//crear input texto
		JTextField textField= new JTextField();
		
		//definir tamaño
		textField.setBounds(65,60,200,30);
				
		//adicionar al panel
		contentPanel.add(textField);
		
		textField.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		//crear botón con texto saludar
		JButton btn = new JButton("\u00A1Saludar!");
		
		//definir tamaño
		btn.setBounds(156, 180, 97, 25);
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "¡Hola " + textField.getText() + "!");
			}
		};
		
		//adicionar evento al boton
		btn.addActionListener(al);
		
		//agregar boton al panel	
		contentPanel.add(btn);
		
		
		
		


		
		
	}
}
