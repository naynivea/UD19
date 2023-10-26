package encuesta;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Encuesta extends JFrame {

	private JPanel contentPanel;

	/**
	 * Crear panel.
	 */
	public Encuesta() {

		// Hacer que al cerrar se finalize la ejecución de la app
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// crear panel
		contentPanel = new JPanel();

		// definir tamaño panel
		setBounds(100, 100, 685, 793);

		// contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		// crear etiqueta del título
		JLabel lblTitol = new JLabel("Miniencuesta");

		// configurar color de la etiqueta a rojo
		lblTitol.setForeground(Color.RED);

		// configurar fuente
		lblTitol.setFont(new Font("Tahoma", Font.BOLD, 20));

		// configurar tamaño
		lblTitol.setBounds(268, 13, 146, 16);

		// agregar al panel
		contentPanel.add(lblTitol);

		// etiqueta Sistema Operativo
		JLabel lblSistema = new JLabel("Elije un sistema operativo");

		// configurar fuente de etiqueta
		lblSistema.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// configurar tamaño etiqueta
		lblSistema.setBounds(12, 59, 189, 16);

		// agregar etiqueta
		contentPanel.add(lblSistema);

		// crear JRadioButton Windows
		JRadioButton rdbtn1 = new JRadioButton("Windows");
		rdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtn1.setBounds(22, 92, 127, 25);
		rdbtn1.setActionCommand("Windows");
		//rdbtn1.setSelected(true);
		contentPanel.add(rdbtn1);

		// crear JRadioButton Linux
		JRadioButton rdbtn2 = new JRadioButton("Linux");
		rdbtn2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtn2.setBounds(22, 122, 127, 25);
		rdbtn2.setActionCommand("Linux");
		contentPanel.add(rdbtn2);

		// crear JRadioButton Mac
		JRadioButton rdbtn3 = new JRadioButton("Mac");
		rdbtn3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtn3.setBounds(22, 152, 127, 25);
		rdbtn3.setActionCommand("Mac");
		contentPanel.add(rdbtn3);

		// crear grupo y agregar los botones
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtn1);
		bgroup.add(rdbtn2);
		bgroup.add(rdbtn3);

		// etiqueta de Especialidad
		JLabel lblEspecialidad = new JLabel("Elije tu especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEspecialidad.setBounds(12, 207, 146, 16);
		contentPanel.add(lblEspecialidad);

		/*
		 * creacion de los JCheckBoxs de Especialidad: configuración de fuente tamaño
		 * agregar al panel
		 */
		JCheckBox checkBox1 = new JCheckBox("Programaci\u00F3n");// Programación
		checkBox1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox1.setBounds(22, 232, 127, 25);
		contentPanel.add(checkBox1);

		JCheckBox checkBox2 = new JCheckBox("Dise\u00F1o gr\u00E1fico");// Diseño gráfico
		checkBox2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox2.setBounds(22, 261, 127, 25);
		contentPanel.add(checkBox2);

		JCheckBox checkBox3 = new JCheckBox("Administraci\u00F3n");// Administracion
		checkBox3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox3.setBounds(22, 291, 127, 25);
		contentPanel.add(checkBox3);

		/*
		 * creación del Slider de las horas configuracion del valor y max. valor
		 * definicion tamaño adicionar al panel
		 */
		JSlider slider = new JSlider();
		slider.setValue(10);
		slider.setMaximum(10);
		slider.setBounds(10, 369, 200, 26);
		contentPanel.add(slider);

		// etiqueta de Horas
		JLabel lblHoras = new JLabel("Horas dedicadas en el ordenador");
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHoras.setBounds(12, 340, 240, 16);
		contentPanel.add(lblHoras);
		
		// JLabel para exibir o valor do slider
		JLabel lblValorSlider = new JLabel("" + slider.getValue());
		lblValorSlider.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorSlider.setBounds(80, 400, 200, 16);
		contentPanel.add(lblValorSlider);

		// changelistener para atualizar valor del JLabel de horas
		slider.addChangeListener(new ChangeListener() {
		    public void stateChanged(ChangeEvent e) {
		        int valorSlider = slider.getValue();
		        lblValorSlider.setText("" + valorSlider);
		    }
		});
		
		// Etiquetas títulos de las opciones escogidas

		JLabel lblResultadoS = new JLabel("Sistema operativo: "); // Sistema
		lblResultadoS.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultadoS.setBounds(12, 528, 181, 16);
		contentPanel.add(lblResultadoS);

		JLabel lblResultadoE = new JLabel("Especialidad:");// Especialidad
		lblResultadoE.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultadoE.setBounds(12, 557, 114, 16);
		contentPanel.add(lblResultadoE);

		JLabel lblResultadoH = new JLabel("Horas dedicadas:"); // Horas
		lblResultadoH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultadoH.setBounds(12, 586, 146, 16);
		contentPanel.add(lblResultadoH);

		JButton btnEnviar = new JButton("Enviar"); // Botón de enviar los resultados
		btnEnviar.setBounds(30, 460, 97, 25);
		contentPanel.add(btnEnviar);

		// Etiquetas que guardarán los resultados de las opciones escogidas
		JLabel lblResultadoSistema = new JLabel("");
		lblResultadoSistema.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultadoSistema.setBounds(182, 529, 142, 16);
		contentPanel.add(lblResultadoSistema);

		JLabel lblResultadoEspecialidad = new JLabel("");
		lblResultadoEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultadoEspecialidad.setBounds(182, 557, 473, 16);
		contentPanel.add(lblResultadoEspecialidad);

		JLabel lblResultadoHoras = new JLabel("");
		lblResultadoHoras.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultadoHoras.setBounds(182, 586, 142, 16);
		contentPanel.add(lblResultadoHoras);

		// ArrayList que guarda uma lista de los checkboxs
		ArrayList<JCheckBox> checkBoxList = new ArrayList<>();
		checkBoxList.add(checkBox1);
		checkBoxList.add(checkBox2);
		checkBoxList.add(checkBox3);
		
		/*Evento que es accionado al clicar
		 *en el botón de enviar y envia los resultados
		 *de la encuesta a las etiquetas
		 */
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String especialidad = "";
		        
		        /*itera en el ArrayList de checkbox, y cada valor
		        * seleccionado se va agregando a la variable especialidad 
		        */
		        for (JCheckBox checkBox : checkBoxList) {
		            if (checkBox.isSelected()) {
		                especialidad += checkBox.getText() + " ";
		            }
		        }
		        
		        lblResultadoEspecialidad.setText(especialidad);
		        
		        //Si no hay hay un valor seleccionado, salta un alerta
		        if (bgroup.getSelection() == null) {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione un sistema.");
		        } else {
		            lblResultadoSistema.setText(bgroup.getSelection().getActionCommand());
		        }

		        lblResultadoHoras.setText(String.valueOf(slider.getValue()));
		    }
		};

		btnEnviar.addActionListener(al);

	}
}