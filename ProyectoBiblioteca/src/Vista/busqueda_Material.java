package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;


public class busqueda_Material extends JFrame {

	private JPanel contentPane;
	private JTextField txtIndicaUnaPalabra;
	private JTable table;
	private Object Imagen;
	
	private String  columnNames[];
	private String  dataValues[][];

	private static NodeList nList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					busqueda_Material frame = new busqueda_Material();
					frame.setVisible(true);
					File inputFile = new File("Material.XML");
			         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			         Document doc = dBuilder.parse(inputFile);
			         doc.getDocumentElement().normalize();
			         nList = doc.getElementsByTagName("material");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public busqueda_Material() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		
		CreateColumnas();
		CreateData();
		
		table = new JTable(dataValues, columnNames);
		
		table.setShowHorizontalLines( false );
		table.setRowSelectionAllowed( true );
		table.setColumnSelectionAllowed( true );
		
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
				.addGroup(gl_desktopPane.createSequentialGroup()
					.addGap(142)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(636, Short.MAX_VALUE))
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_desktopPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(496, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_1_1 = new JLabel("BIBLIOTECA");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		panel.add(comboBox_1_1);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Elige Biblioteca", "LIMA", "AREQUIPA"}));
		
		JLabel lblNewLabel_1 = new JLabel("TIPO DE RECURSO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Elige el tipo de material", "LIBRO", "REVISTA", "INFORME"}));
		
		txtIndicaUnaPalabra = new JTextField();
		txtIndicaUnaPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		txtIndicaUnaPalabra.setText("Indica una Palabra Clave");
		panel.add(txtIndicaUnaPalabra);
		txtIndicaUnaPalabra.setColumns(20);
		
		JButton btn_BuscarParametros = new JButton("BUSCAR");
		panel.add(btn_BuscarParametros);
		btn_BuscarParametros.setHorizontalAlignment(SwingConstants.LEADING);
		desktopPane.setLayout(gl_desktopPane);
	}
	
	private void CreateColumnas() {
		columnNames = new String[10];
		
		columnNames[0] = "Imagen";
		columnNames[1] = "Titulo Material";
		columnNames[2] = "Autores";
		columnNames[3] = "Tipo Recurso";
		columnNames[4] = "Editorial";
		columnNames[5] = "Anio Publicacion";
		columnNames[6] = "Numero Paginas";
		columnNames[7] = "Detalle de Material";
		columnNames[8] = "Biblioteca";
	}

	private void CreateData() {
		dataValues = new String [nList.getLength()][10];
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            Element eElement = (Element) nNode;
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            	dataValues[temp][0] = eElement.getElementsByTagName("imagen").item(0).getTextContent();
            	dataValues[temp][1] = eElement.getElementsByTagName("titulo").item(0).getTextContent();
            	dataValues[temp][2] = eElement.getElementsByTagName("autores").item(0).getTextContent();
            	dataValues[temp][3] = eElement.getElementsByTagName("tipo_recurso").item(0).getTextContent();
            	dataValues[temp][4] = eElement.getElementsByTagName("editorial").item(0).getTextContent();
            	dataValues[temp][5] = eElement.getElementsByTagName("anio_publicacion").item(0).getTextContent();
            	dataValues[temp][6] = eElement.getElementsByTagName("numero_paginas").item(0).getTextContent();
            	dataValues[temp][7] = eElement.getElementsByTagName("detalle_publicacion").item(0).getTextContent();
            	dataValues[temp][8] = eElement.getElementsByTagName("biblioteca").item(0).getTextContent();
            	dataValues[temp][9] = "hola";
            }
		}
	}

	
}
