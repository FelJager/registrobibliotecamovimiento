package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton lector;
	private JRadioButton administrador;
	private JFrame login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Ingresa Usuario");
		lblNewLabel.setBounds(154, 33, 81, 14);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(117, 75, 160, 20);
		layeredPane.add(textField);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(82, 106, 109, 23);
		layeredPane.add(btnVerificar);
		
		JRadioButton rbAdministrador = new JRadioButton("Administrador");
		rbAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lector.setSelected(false);
			}
		});
		rbAdministrador.setVerticalAlignment(SwingConstants.TOP);
		rbAdministrador.setHorizontalAlignment(SwingConstants.LEFT);
		rbAdministrador.setBounds(202, 167, 109, 23);
		layeredPane.add(rbAdministrador);
		
		JRadioButton rbLector = new JRadioButton("Lector");
		rbLector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				administrador.setSelected(false);
			}
		});
		rbLector.setVerticalAlignment(SwingConstants.TOP);
		rbLector.setHorizontalAlignment(SwingConstants.LEFT);
		rbLector.setBounds(82, 167, 109, 23);
		layeredPane.add(rbLector);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbLector.isSelected() == true) {
					BusquedaLibro busquedalibro = new BusquedaLibro();
					busquedalibro.setVisible(true);
					login.setVisible(false);
					login.dispose();
				}
				else
					if(rbAdministrador.isSelected() == true)
					{
						BusquedaRegistro busquedaregistro = new BusquedaRegistro();
						busquedaregistro.setVisible(true);
						login.setVisible(false);
						login.dispose();
					}
			}
		});
		btnAcceder.setBounds(146, 219, 89, 23);
		layeredPane.add(btnAcceder);
		
		JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNuevoUsuario)
				{
					CrearUsuario crearusuario = new CrearUsuario();
					crearusuario.setVisible(true);
					login.setVisible(false);
					login.dispose();
				}
			}
		});
		btnNuevoUsuario.setBounds(201, 106, 109, 23);
		layeredPane.add(btnNuevoUsuario);
	}


}
