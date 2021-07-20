package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class CreadorRegistro {

	Document document = null;
    Element root = null;


	public void Llenado(int codigo_registro, String codigo_material, String codigo_usuario, String fecha_prestamo, String fecha_devolucion) {
		
		String codigo_registrO = (String) codigo_registro;
		File xmlFile = new File("XML/Registro_Movimientos.xml");
	    FileInputStream fis = new FileInputStream(xmlFile);
	    SAXBuilder sb = new SAXBuilder();
	    document = sb.build(fis);
	    root = document.getRootElement();
	    fis.close();
		
	    Element child = new Element("Registro_Movimientos");
		Document doc = new Document(child);
		
		Element Usuario = new Element("Movimiento_Biblioteca") ;
		Usuario.setAttribute(new Attribute("codigo_registro", codigo_registrO));
		
		Element tipo = new Element("codigo_material");
		tipo.setText(codigo_material);
		
		Element nombre = new Element("codigo_usuario");
		nombre.setText(codigo_usuario);
		
		Element apellido = new Element("fecha_prestamo");
		apellido.setText(fecha_prestamo);
		
		Element carrera = new Element("fecha_devolucion");
		carrera.setText(fecha_devolucion);
		
		root.addContent(child);
		document.setContent(root);
		
		try {
	        FileWriter writer = new FileWriter("XML/Registro_Movimientos.xml");
	        XMLOutputter outputter = new XMLOutputter();
	        outputter.setFormat(Format.getPrettyFormat());
	        outputter.output(document, writer);
	        outputter.output(document, System.out);
	        writer.close(); 
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
