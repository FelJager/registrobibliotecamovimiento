package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class CreadorUsuario {

	Document document = null;
    Element root = null;
	
	public void Llenado(String codigo_usuario, String tipo_usuario, String nombres_usuario, String apellidos_usuario, String carrera_usuario, String sucursal_usuario) throws JDOMException, IOException
	{
		File xmlFile = new File("XML/Usuarios.xml");
	    FileInputStream fis = new FileInputStream(xmlFile);
	    SAXBuilder sb = new SAXBuilder();
	    document = sb.build(fis);
	    root = document.getRootElement();
	    fis.close();
	    
		Element child = new Element("Usuario");
		Document doc = new Document(child);
		
		Element Usuario = new Element("Usuario_Biblioteca") ;
		Usuario.setAttribute(new Attribute("codigo_usuario", codigo_usuario));
		
		Element tipo = new Element("tipo_usuario");
		tipo.setText(tipo_usuario);
		
		Element nombre = new Element("nombres_usuario");
		nombre.setText(nombres_usuario);
		
		Element apellido = new Element("apellidos_usuario");
		apellido.setText(apellidos_usuario);
		
		Element carrera = new Element("carrera_usuario");
		carrera.setText(carrera_usuario);
		
		Element sucursal = new Element("sucursal_usuario");
		sucursal.setText(sucursal_usuario);
		
		root.addContent(child);
		document.setContent(root);
		
		try {
	        FileWriter writer = new FileWriter("XML/Usuarios.xml");
	        XMLOutputter outputter = new XMLOutputter();
	        outputter.setFormat(Format.getPrettyFormat());
	        outputter.output(document, writer);
	        outputter.output(document, System.out);
	        writer.close(); // close writer
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
