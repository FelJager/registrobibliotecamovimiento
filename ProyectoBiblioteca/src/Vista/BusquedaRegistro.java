package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Controlador.LlenadoTablaMaterial;
import Controlador.LlenadoTablaRegistro;

import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JTable;

public class BusquedaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField tfClave;
	private JTable datosRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusquedaRegistro frame = new BusquedaRegistro();
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
	public BusquedaRegistro() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 681, 41);
		layeredPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("BIBLIOTECA");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1_1);
		
		JComboBox cbLocacion = new JComboBox();
		cbLocacion.setModel(new DefaultComboBoxModel(new String[] {"Elegir Locacion", "Lima", "Arequipa"}));
		panel.add(cbLocacion);
		
		JLabel lblNewLabel_1 = new JLabel("TIPO DE RECURSO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Elegir Tipo", "Libro", "Revista", "Informe"}));
		panel.add(cbTipo);
		
		tfClave = new JTextField();
		tfClave.setText("Indica una Palabra Clave");
		tfClave.setHorizontalAlignment(SwingConstants.CENTER);
		tfClave.setColumns(20);
		panel.add(tfClave);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(42, 102, 480, 298);
		layeredPane.add(scrollPane);
		
		datosRegistro = new JTable();
		datosRegistro.setBounds(619, 380, -547, -238);
		layeredPane.add(datosRegistro);
		
		JButton btn_BuscarParametros = new JButton("BUSCAR");
		btn_BuscarParametros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( cbTipo.getToolTipText() == "Elegir Tipo" && cbLocacion.getToolTipText() == "Elegir Locacion" &&  tfClave.getText() == "")
				{
					LlenadoTablaRegistro tbregistro = new LlenadoTablaRegistro();
					datosRegistro tbmat = new datosRegistro();
					tbmat.setModel(tbregistro);
					JScrollPane scrollpane = new JScrollPane(tbmat);
				}
			}
		});
		btn_BuscarParametros.setHorizontalAlignment(SwingConstants.LEADING);
		panel.add(btn_BuscarParametros);
		
		JButton btn_Imprimir = new JButton("Imprimir \r\nReporte");
		btn_Imprimir.setBounds(528, 237, 153, 61);
		layeredPane.add(btn_Imprimir);
		

	}
}
