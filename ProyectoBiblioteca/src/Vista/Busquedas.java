package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.BoxLayout;

public class Busquedas {

	private JFrame frmBibliotecaUtp;
	private JTextField textoBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Busquedas window = new Busquedas();
					window.frmBibliotecaUtp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Busquedas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBibliotecaUtp = new JFrame();
		frmBibliotecaUtp.setType(Type.UTILITY);
		frmBibliotecaUtp.setAlwaysOnTop(true);
		frmBibliotecaUtp.getContentPane().setBackground(new Color(255, 255, 255));
		frmBibliotecaUtp.getContentPane().setEnabled(false);
		frmBibliotecaUtp.setTitle("Biblioteca UTP");
		frmBibliotecaUtp.setBounds(100, 100, 765, 510);
		frmBibliotecaUtp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBibliotecaUtp.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		frmBibliotecaUtp.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("UTP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JComboBox comboCampo = new JComboBox();
		comboCampo.setModel(new DefaultComboBoxModel(new String[] {"Todos los Campos", "Titulo", "Autor", "Tema", "Serie", "Cod. Clasificacion"}));
		comboCampo.setToolTipText("");
		panel.add(comboCampo);
		
		JComboBox combo_Sedes = new JComboBox();
		combo_Sedes.setModel(new DefaultComboBoxModel(new String[] {"Todas las Biblioteca", "Lima", "Arequipa", "Chiclayo"}));
		panel.add(combo_Sedes);
		
		JComboBox combo_Tipo = new JComboBox();
		combo_Tipo.setModel(new DefaultComboBoxModel(new String[] {"Todos los Tipos", "Libro", "Revista", "Articulo"}));
		panel.add(combo_Tipo);
		
		textoBuscar = new JTextField();
		textoBuscar.setToolTipText("");
		textoBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		textoBuscar.setForeground(Color.GRAY);
		panel.add(textoBuscar);
		textoBuscar.setColumns(25);
		
		JButton btn_Buscar = new JButton("Buscar");
		btn_Buscar.setForeground(new Color(0, 0, 0));
		btn_Buscar.setBackground(new Color(0, 102, 51));
		panel.add(btn_Buscar);
		
		JButton btn_Avanzado = new JButton("Avanzada");
		btn_Avanzado.setForeground(Color.BLACK);
		btn_Avanzado.setBackground(new Color(0, 102, 51));
		panel.add(btn_Avanzado);
	}

}
