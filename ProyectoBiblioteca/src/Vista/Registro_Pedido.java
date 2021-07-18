package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro_Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodigoUsuario;
	private JTextField tfCodigoMaterial;
	private JTextField tf_Titulo;
	private JTextField tf_tipo;
	private String Codigo_Usuario;
	private String Codigo_Material;
	private String Titulo_Material;
	private String Tipo_Materil;
	private String Fecha_Retiro;
	private String Fecha_Devolucion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro_Pedido frame = new Registro_Pedido();
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
	public Registro_Pedido() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE PEDIDO");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(209, 28, 204, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa Codigo de Usuario");
		lblNewLabel_1.setBounds(112, 99, 189, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo Material");
		lblNewLabel_2.setBounds(112, 127, 189, 14);
		desktopPane.add(lblNewLabel_2);
		
		tfCodigoUsuario = new JTextField();
		tfCodigoUsuario.setBounds(311, 96, 228, 20);
		desktopPane.add(tfCodigoUsuario);
		tfCodigoUsuario.setColumns(10);
		
		tfCodigoMaterial = new JTextField();
		tfCodigoMaterial.setBounds(311, 124, 228, 20);
		desktopPane.add(tfCodigoMaterial);
		tfCodigoMaterial.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de Pedido");
		lblNewLabel_3.setBounds(136, 235, 127, 14);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha de Entrega");
		lblNewLabel_3_1.setBounds(382, 235, 127, 14);
		desktopPane.add(lblNewLabel_3_1);
		
		JCalendar CalendarioPedido = new JCalendar();
		CalendarioPedido.setBounds(98, 260, 205, 153);
		desktopPane.add(CalendarioPedido);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(347, 260, 205, 153);
		desktopPane.add(calendar_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Titulo Material");
		lblNewLabel_2_1.setBounds(112, 155, 189, 14);
		desktopPane.add(lblNewLabel_2_1);
		
		tf_Titulo = new JTextField();
		tf_Titulo.setColumns(10);
		tf_Titulo.setBounds(311, 152, 228, 20);
		desktopPane.add(tf_Titulo);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tipo Material");
		lblNewLabel_2_2.setBounds(112, 183, 189, 14);
		desktopPane.add(lblNewLabel_2_2);
		
		JButton btnRegistro = new JButton("Registrar Pedido");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Codigo_Usuario = tfCodigoUsuario.getText();
				Codigo_Material = tfCodigoMaterial.getText();
				Titulo_Material = tf_Titulo.getText();
			}
		});
		btnRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistro.setForeground(new Color(255, 255, 255));
		btnRegistro.setBackground(new Color(46, 139, 87));
		btnRegistro.setBounds(250, 440, 142, 23);
		desktopPane.add(btnRegistro);
		
		tf_tipo = new JTextField();
		tf_tipo.setColumns(10);
		tf_tipo.setBounds(311, 180, 228, 20);
		desktopPane.add(tf_tipo);
	}
}
