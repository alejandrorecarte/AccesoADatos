package DOMSAX;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.swing.text.html.parser.Parser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Escritura {

    public static void main(String[] args) {
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element root = doc.createElement("Libros");
            doc.appendChild(root);

            Element libro1 = doc.createElement("Libro");
            root.appendChild(libro1);

            Element titulo1 = doc.createElement("Titulo");
            libro1. appendChild(titulo1);

            Text tituloText1 = doc.createTextNode("El Gran Gatsby");
            titulo1.appendChild(tituloText1);

            Element autor1 = doc.createElement("Autor");
            libro1.appendChild(autor1);

            Text autorText1 = doc.createTextNode("F. Scott Fitzgerald");
            autor1.appendChild(autorText1);

            Element libro2 = doc.createElement("Libro");
            root.appendChild(libro2);

            Element titulo2 = doc.createElement("Titulo");
            libro2.appendChild(titulo2);

            Text tituloText2 = doc.createTextNode("Drácula");
            titulo2.appendChild(tituloText2);

            Element autor2 = doc.createElement("Autor");
            libro2.appendChild(autor2);

            Text autorText2 = doc.createTextNode("Bram Stocker");
            autor2.appendChild(autorText2);

            javax.xml.transform.TransformerFactory.newInstance().newTransformer()
                    .transform(new javax.xml.transform.dom.DOMSource(doc), new javax.xml.transform.stream.StreamResult(new java.io.File("biblioteca.xml")));
        } catch (ParserConfigurationException | javax.xml.transform.TransformerException e){
            e.printStackTrace();
        }
    }
}
