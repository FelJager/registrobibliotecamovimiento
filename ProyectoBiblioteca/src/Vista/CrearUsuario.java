package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdom2.JDOMException;

import Modelo.Modelo_Usuarios;
import Controlador.CreadorUsuario;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CrearUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField tfcodigo;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfCarrera;
	private JTextField tfSucursal;
	private JFrame crear;
	private String codigo_usuario;
	private String tipo_usuario;
	private String nombres_usuario;
	private String apellidos_usuario;
	private String carrera_usuario;
	private String sucursal_usuario;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearUsuario frame = new CrearUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrearUsuario() {
		setType(Type.UTILITY);
		setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elige Opcion Tipo", "Alumno", "Administrador"}));
		comboBox.setBounds(207, 100, 218, 17);
		layeredPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Crear Usuario");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(185, 37, 103, 14);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setBounds(79, 75, 103, 14);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre Usuario");
		lblNewLabel_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(79, 127, 103, 14);
		layeredPane.add(lblNewLabel_1_1);
		
		
		JButton btnRegresar = new JButton("RegresarLogin");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				crear.setVisible(false);
				crear.dispose();
			}
		});
		btnRegresar.setForeground(new Color(255, 0, 0));
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegresar.setBounds(48, 230, 146, 23);
		layeredPane.add(btnRegresar);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos Usuario");
		lblNewLabel_1_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(79, 152, 103, 14);
		layeredPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Carrera del Usuario");
		lblNewLabel_1_1_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(79, 177, 103, 14);
		layeredPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Sucursal Usuario");
		lblNewLabel_1_1_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(79, 202, 103, 14);
		layeredPane.add(lblNewLabel_1_1_2_1);
		
		tfcodigo = new JTextField();
		tfcodigo.setBounds(207, 75, 218, 16);
		layeredPane.add(tfcodigo);
		tfcodigo.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		tfNombre.setBounds(207, 125, 218, 16);
		layeredPane.add(tfNombre);
		
		tfApellidos = new JTextField();
		tfApellidos.setColumns(10);
		tfApellidos.setBounds(207, 150, 218, 16);
		layeredPane.add(tfApellidos);
		
		tfCarrera = new JTextField();
		tfCarrera.setColumns(10);
		tfCarrera.setBounds(207, 175, 218, 16);
		layeredPane.add(tfCarrera);
		
		tfSucursal = new JTextField();
		tfSucursal.setColumns(10);
		tfSucursal.setBounds(207, 200, 218, 16);
		layeredPane.add(tfSucursal);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Nombre Usuario");
		lblNewLabel_1_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(79, 100, 103, 14);
		layeredPane.add(lblNewLabel_1_1_3);
		
		JButton btnCrear = new JButton("CrearUsuario");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				codigo_usuario = tfcodigo.getText();
				tipo_usuario = comboBox.getToolTipText();
				nombres_usuario = tfNombre.getText();
				apellidos_usuario = tfApellidos.getText();
				carrera_usuario = tfCarrera.getText();
				sucursal_usuario = tfSucursal.getText();				
				
				Modelo_Usuarios usuario = new Modelo_Usuarios(codigo_usuario, tipo_usuario, nombres_usuario, apellidos_usuario, carrera_usuario, sucursal_usuario);
				
				CreadorUsuario creador = new CreadorUsuario();
				
				try {
					creador.Llenado(usuario.getCodigo_usuario(),usuario.getTipo_usuario(), usuario.getNombres_usuario(), usuario.getApellidos_usuario(), usuario.getCarrera_usuario(), usuario.getSucursal_usuario());
				} catch (JDOMException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Login login = new Login();
				login.setVisible(true);
				crear.setVisible(false);
				crear.dispose();
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCrear.setForeground(new Color(0, 0, 255));
		btnCrear.setBounds(300, 230, 146, 23);
		layeredPane.add(btnCrear);
		
		
	}
}
