package Controlador;

import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class LlenadoTablaRegistro extends AbstractTableModel {

	Vector data;
	Vector columns;
	
	public LlenadoTablaRegistro()
	{
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse("Registro_Movimientos.xml");
			
			NodeList n1 = doc.getElementsByTagName("codigo_material");
			NodeList n2 = doc.getElementsByTagName("codigo_usuario");
			NodeList n3 = doc.getElementsByTagName("fecha_prestamo");
			NodeList n4 = doc.getElementsByTagName("fecha_devolucion");
			
			NodeList listOfRegistros = doc.getElementsByTagName("Movimiento_Biblioteca");
			
			String data1 = "", data2 = "", data3 = "", data4 = "";
			
			data = new Vector();
			
			for ( int i = 0; i < listOfRegistros.getLength(); i++)
			{
				data1 = n1.item(i).getFirstChild().getNodeValue();
				data2 = n2.item(i).getFirstChild().getNodeValue();
				data3 = n3.item(i).getFirstChild().getNodeValue();
				data4 = n4.item(i).getFirstChild().getNodeValue();
				
				String line = data1 + " " + data2 + " " + data3 + " " + data4;
				StringTokenizer st2 = new StringTokenizer(line, " ");
				while (st2.hasMoreTokens())
					data.addElement(st2.nextToken());
			}
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {
		return data.size();
	}
	
	@Override
	public int getColumnCount() {
		return columns.size();
		
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return (String) data.elementAt((rowIndex * getColumnCount()) + columnIndex);
	}
	
	
	
	
}
