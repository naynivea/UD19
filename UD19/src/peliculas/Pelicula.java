
package peliculas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Pelicula extends JFrame {
	
	
	/*
	 * Panel
	 */
	private JPanel contentPanel;
	
	public Pelicula() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		contentPanel = new JPanel();
		
		setBounds(100, 100, 568, 300);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPanel);
		
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(39, 78, 225, 16);
		contentPanel.add(lblNewLabel);
		
		JTextField textField = new JTextField();
		textField.setBounds(49, 119, 186, 22);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("peliculas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(374, 79, 105, 16);
		contentPanel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(323, 119, 156, 22);
		contentPanel.add(comboBox);
		
		JButton btnNewButton = new JButton("Adicionar película");
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().trim().isEmpty()) {
					comboBox.addItem(textField.getText());
					textField.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null,"El campo está vacio!");
					
				}
			}
		};
		
		btnNewButton.setBounds(86, 164, 97, 25);
		contentPanel.add(btnNewButton);
		btnNewButton.addActionListener(al);
	}
	
}