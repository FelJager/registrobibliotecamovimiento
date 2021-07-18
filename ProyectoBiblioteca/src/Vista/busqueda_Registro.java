package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class busqueda_Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					busqueda_Registro frame = new busqueda_Registro();
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
	public busqueda_Registro() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 717, 41);
		desktopPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("BIBLIOTECA");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Elige Biblioteca", "LIMA", "AREQUIPA"}));
		panel.add(comboBox_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("TIPO DE RECURSO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Elige el tipo de material", "LIBRO", "REVISTA", "INFORME"}));
		panel.add(comboBox_1);
		
		textField = new JTextField();
		textField.setText("Indica una Palabra Clave");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(20);
		panel.add(textField);
		
		JButton btn_BuscarParametros = new JButton("BUSCAR");
		btn_BuscarParametros.setHorizontalAlignment(SwingConstants.LEADING);
		panel.add(btn_BuscarParametros);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo_Material", "Codigo_Usuario", "Fecha_Prestamo", "Fecha_Devolucion"
			}
		));
		table.setBounds(88, 108, 1, 1);
		desktopPane.add(table);
	}

}
