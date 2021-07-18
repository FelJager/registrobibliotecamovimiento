package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodigo;

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
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(91, 76, 160, 20);
		layeredPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingresa Usuario");
		lblNewLabel.setBounds(133, 51, 81, 14);
		layeredPane.add(lblNewLabel);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(125, 133, 89, 23);
		layeredPane.add(btnVerificar);
		
		JRadioButton rbLector = new JRadioButton("Lector");
		rbLector.setBounds(61, 225, 109, 23);
		layeredPane.add(rbLector);
		
		JRadioButton rbAdministrador = new JRadioButton("Administrador");
		rbAdministrador.setVerticalAlignment(SwingConstants.TOP);
		rbAdministrador.setHorizontalAlignment(SwingConstants.LEFT);
		rbAdministrador.setBounds(183, 225, 109, 23);
		layeredPane.add(rbAdministrador);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(133, 291, 89, 23);
		layeredPane.add(btnAcceder);
	}
}
