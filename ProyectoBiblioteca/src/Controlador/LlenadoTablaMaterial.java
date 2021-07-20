package Controlador;

import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class LlenadoTablaMaterial extends AbstractTableModel {

	Vector data;
	Vector columns;
	
	public LlenadoTablaMaterial()
	{
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse("Material.xml");
			
			NodeList n1 = doc.getElementsByTagName("imagen");
			NodeList n2 = doc.getElementsByTagName("titulo");
			NodeList n3 = doc.getElementsByTagName("autores");
			NodeList n4 = doc.getElementsByTagName("tipo_recurso");
			NodeList n5 = doc.getElementsByTagName("editorial");
			NodeList n6 = doc.getElementsByTagName("anio_recurso");
			NodeList n7 = doc.getElementsByTagName("numero_paginas");
			NodeList n8 = doc.getElementsByTagName("detalle_publicacion");
			NodeList n9 = doc.getElementsByTagName("biblioteca");
			NodeList n10 = doc.getElementsByTagName("estado");
			
			NodeList listOfMateriales = doc.getElementsByTagName("material_detalle");
			
			String data1 = "", data2 = "", data3 = "", data4 = "", data5 = "", data6 = "", data7 = "", data8 = "", data9 = "", data10 = "";
			
			data = new Vector();
			for ( int i = 0; i < listOfMateriales.getLength(); i++)
			{
				data1 = n1.item(i).getFirstChild().getNodeValue();
				data2 = n2.item(i).getFirstChild().getNodeValue();
				data3 = n3.item(i).getFirstChild().getNodeValue();
				data4 = n4.item(i).getFirstChild().getNodeValue();
				data5 = n5.item(i).getFirstChild().getNodeValue();
				data6 = n6.item(i).getFirstChild().getNodeValue();
				data7 = n7.item(i).getFirstChild().getNodeValue();
				data8 = n8.item(i).getFirstChild().getNodeValue();
				data9 = n9.item(i).getFirstChild().getNodeValue();
				data10 = n10.item(i).getFirstChild().getNodeValue();
				
				String line = data1 + " " + data2 + " " + data3 + " " + data4 + " " + data5 + " " + data6 + " " + data7 + " " + data8 + " " + data9 + " " + data10;
				StringTokenizer st2 = new StringTokenizer(line, " ");
				while (st2.hasMoreTokens())
					data.addElement(st2.nextToken());
			}
			
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			columns.add("");
			
		} catch (Exception e) {
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
