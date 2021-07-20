package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdom2.JDOMException;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import Controlador.CreadorRegistro;
import Modelo.Modelo_Registro_Moviminentos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class RegistroPedido extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodigoMaterial;
	private JTextField tfUsuario;
	private JTextField tfLibro;
	private JTextField tfDescripcion;
	private JFrame pedido;
	
	private int codigo_registro;
	private String codig_material;
	private String codigo_usuario;
	private String fecha_prestamo;
	private String fecha_devolucion;
	private String dia;
	private String mes;
	private String anio;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroPedido frame = new RegistroPedido();
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
	public RegistroPedido() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("REGISTRO PEDIDO");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(226, 37, 180, 14);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Material");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(75, 88, 88, 14);
		layeredPane.add(lblNewLabel_1);
		
		tfCodigoMaterial = new JTextField();
		tfCodigoMaterial.setBounds(226, 85, 286, 17);
		layeredPane.add(tfCodigoMaterial);
		tfCodigoMaterial.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Codigo Usuario");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(75, 113, 88, 14);
		layeredPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Titulo Libro");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(75, 138, 88, 14);
		layeredPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Descripcion");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(75, 163, 88, 14);
		layeredPane.add(lblNewLabel_1_1_1_1);
		
		tfUsuario = new JTextField();
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(226, 110, 286, 17);
		layeredPane.add(tfUsuario);
		
		tfLibro = new JTextField();
		tfLibro.setColumns(10);
		tfLibro.setBounds(226, 135, 286, 17);
		layeredPane.add(tfLibro);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setColumns(10);
		tfDescripcion.setBounds(226, 160, 286, 61);
		layeredPane.add(tfDescripcion);
		
		JDateChooser dateRetiro = new JDateChooser();
		dateRetiro.setBounds(104, 285, 144, 20);
		layeredPane.add(dateRetiro);
		
		JDateChooser dateDevolucion = new JDateChooser();
		dateDevolucion.setBounds(345, 285, 144, 20);
		layeredPane.add(dateDevolucion);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Retiro");
		lblNewLabel_2.setBounds(142, 260, 88, 14);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Fecha de Devolucion");
		lblNewLabel_2_1.setBounds(366, 260, 104, 14);
		layeredPane.add(lblNewLabel_2_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusquedaLibro busquedalibro = new BusquedaLibro();
				busquedalibro.setVisible(true);
				pedido.setVisible(false);
				pedido.dispose();
			}
		});
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.setBounds(126, 382, 104, 23);
		layeredPane.add(btnCancelar);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo_registro = (int)(Math.random()*1000000);
				codig_material = tfCodigoMaterial.getText();
				codigo_usuario = tfUsuario.getText();
				fecha_prestamo = dateRetiro.toString();
				fecha_devolucion = dateDevolucion.toString();
				
				Modelo_Registro_Moviminentos movimientos = new Modelo_Registro_Moviminentos(codigo_registro, 
						codig_material, codigo_usuario, fecha_prestamo, fecha_devolucion, null);
				
				CreadorRegistro creador = new CreadorRegistro();
				
				creador.Llenado(movimientos.getCodigo_registro(),movimientos.getCodigo_material(), movimientos.getCodigo_usuario(), movimientos.getFecha_prestamo(), movimientos.getFecha_devolucion());
			}
		});
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrar.setBackground(new Color(0, 0, 255));
		btnRegistrar.setBounds(366, 382, 123, 23);
		layeredPane.add(btnRegistrar);
	}
}
