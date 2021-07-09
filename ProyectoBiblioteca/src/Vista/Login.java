package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tf_user;

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
		setTitle("UTP - Biblioteca");
		setResizable(false);
		setType(Type.UTILITY);
		setBounds(100, 100, 370, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(28, 178, 95, 14);
		desktopPane.add(lblNewLabel);
		
		tf_user = new JTextField();
		tf_user.setBounds(133, 175, 195, 20);
		desktopPane.add(tf_user);
		tf_user.setColumns(10);
		
		JRadioButton rb_Lector = new JRadioButton("Lector");
		rb_Lector.setBackground(Color.WHITE);
		rb_Lector.setBounds(83, 291, 70, 23);
		desktopPane.add(rb_Lector);
		
		JRadioButton rd_Administrador = new JRadioButton("Administrador");
		rd_Administrador.setBackground(Color.WHITE);
		rd_Administrador.setBounds(185, 291, 130, 23);
		desktopPane.add(rd_Administrador);
		
		JButton btn_Acceder = new JButton("Acceder");
		btn_Acceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Acceder.setBounds(133, 363, 89, 23);
		desktopPane.add(btn_Acceder);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\Final Biblioteca\\registrobibliotecamovimiento\\ProyectoBiblioteca\\Recursos\\logo_utp_large.png"));
		lblNewLabel_1.setBounds(17, 11, 311, 128);
		desktopPane.add(lblNewLabel_1);
		
		JButton btn_Verificar = new JButton("Verificar");
		btn_Verificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Verificar.setBounds(133, 220, 89, 23);
		desktopPane.add(btn_Verificar);
	}
}
