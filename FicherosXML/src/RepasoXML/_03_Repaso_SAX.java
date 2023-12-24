package RepasoXML;

import java.io.IOException;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

//Definir la clase _03_Repaso_SAX que extiende DefaultHandler, 
//DefaultHandler es una clase proporcionada por la API SAX que define 
//métodos para manejar eventos específicos durante el análisis de un documento XML
public class _03_Repaso_SAX extends DefaultHandler {

	// Método que se llama al inicio del documento XML
	public void startDocument() throws SAXException {
		super.startDocument(); // Llamar al método startDocument de la clase base
		System.out.println("Inicio del documento XML");
	}

	// Método que se llama al encontrar un elemento de apertura
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes); // Llamar al método startElement de la clase base
		System.out.println("<" + localName + ">"); // Imprimir la etiqueta de apertura
	}

	// Método que se llama cuando se encuentran caracteres dentro de un elemento
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length); // Llamar al método characters de la clase base
		String texto = new String(ch, start, length); // Convertir los caracteres a una cadena
		texto = texto.replace("\n", "").trim(); // Eliminar espacios y saltos de línea
		if (texto.length() > 0) {
			System.out.println("\t" + texto); // Imprimir el texto si contiene algo
		}
	}

	// Método que se llama al encontrar un elemento de cierre
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName); // Llamar al método endElement de la clase base
		System.out.println("<" + localName + "/>"); // Imprimir la etiqueta de cierre
	}

	// Método que se llama al final del documento XML
	public void endDocument() throws SAXException {
		super.endDocument(); // Llamar al método endDocument de la clase base
		System.out.println("Fin del documento");
	}

	// Método principal
	public static void main(String[] args) throws SAXException, IOException {
		// Crear un lector XML (XMLReader) usando la fábrica
		XMLReader procXML = XMLReaderFactory.createXMLReader();

		// Crear una instancia del gestor (handler) que implementa DefaultHandler
		_03_Repaso_SAX gestor = new _03_Repaso_SAX();

		// Establecer el gestor como el manejador de contenido del lector XML
		procXML.setContentHandler(gestor);

		// Especificar el archivo XML de entrada mediante un InputSource
		InputSource fileXML = new InputSource("Ejercicio_01.xml");

		// Parsear el documento XML
		procXML.parse(fileXML);
	}
}
