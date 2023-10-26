package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldValor1;
	private JTextField textFieldValor2;
	private JTextField textFieldResultado;
	
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitol = new JLabel("MiniCalculadora");
		lblTitol.setForeground(Color.RED);
		lblTitol.setBackground(Color.WHITE);
		lblTitol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitol.setBounds(142, 23, 146, 16);
		contentPane.add(lblTitol);
		
		textFieldValor1 = new JTextField();
		textFieldValor1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldValor1.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldValor1.setBounds(12, 83, 96, 22);
		contentPane.add(textFieldValor1);
		textFieldValor1.setColumns(10);
		
		textFieldValor2 = new JTextField();
		textFieldValor2.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldValor2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldValor2.setColumns(10);
		textFieldValor2.setBounds(120, 83, 96, 22);
		contentPane.add(textFieldValor2);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldResultado.setBounds(304, 83, 116, 22);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		
		JLabel lblIgual = new JLabel("=");
		lblIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIgual.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgual.setBounds(228, 86, 56, 16);
		contentPane.add(lblIgual);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setBounds(12, 162, 56, 46);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setBounds(86, 162, 56, 46);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.setBounds(12, 215, 56, 46);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("\u00F7");
		btnDividir.setBounds(86, 215, 56, 46);
		contentPane.add(btnDividir);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(11, 321, 85, 25);
		contentPane.add(btnAbout);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(104, 321, 85, 25);
		contentPane.add(btnSalir);
		
		JLabel lblAbout1 = new JLabel("");
		lblAbout1.setBounds(213, 162, 85, 25);
		contentPane.add(lblAbout1);
		
		JLabel lblAbout2 = new JLabel("");
		lblAbout2.setBounds(299, 162, 85, 25);
		contentPane.add(lblAbout2);
		
		JLabel lblAbout3 = new JLabel("");
		lblAbout3.setBounds(213, 200, 85, 25);
		contentPane.add(lblAbout3);
		
		JLabel lblAbout4 = new JLabel("");
		lblAbout4.setBounds(299, 200, 85, 25);
		contentPane.add(lblAbout4);
		
		ActionListener alSumar = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(textFieldValor1.getText());
				int valor2 = Integer.parseInt(textFieldValor2.getText());
				int resultado = valor1 + valor2;
				textFieldResultado.setText(String.valueOf(resultado));
			}
		};
		btnSumar.addActionListener(alSumar);
		
		ActionListener alRestar = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(textFieldValor1.getText());
				int valor2 = Integer.parseInt(textFieldValor2.getText());
				int resultado = valor1 - valor2;
				textFieldResultado.setText(String.valueOf(resultado));
			}
		};
		btnRestar.addActionListener(alRestar);
		
		ActionListener alMultiplicar = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(textFieldValor1.getText());
				int valor2 = Integer.parseInt(textFieldValor2.getText());
				int resultado = valor1 * valor2;
				textFieldResultado.setText(String.valueOf(resultado));
			}
		};
		btnMultiplicar.addActionListener(alMultiplicar);
		
		ActionListener alDividir = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(textFieldValor1.getText());
				int valor2 = Integer.parseInt(textFieldValor2.getText());
				int resultado = valor1 / valor2;
				textFieldResultado.setText(String.valueOf(resultado));
			}
		};
		btnDividir.addActionListener(alDividir);
		
		ActionListener alAbout = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAbout1.setText("Lorem ipsum");
				lblAbout2.setText("dolor sit amet");
				lblAbout3.setText("consectetur adipiscing");
				lblAbout4.setText("elit.");
			}
		};
		
		btnAbout.addActionListener(alAbout);
		
		ActionListener alSalir = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		};
		btnSalir.addActionListener(alSalir);
	}
}