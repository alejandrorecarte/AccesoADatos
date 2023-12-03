package DOMSAX;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LeerXMLConDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            File file = new File("biblioteca.xml");
            Document doc = builder.parse(file);

            NodeList nodeList = doc.getElementsByTagName("Libros");

            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element elemento = (Element) node;

                    //String atributo = elemento.getAttribute("atributo");
                    String titulo = elemento.getElementsByTagName("Titulo").item(0).getTextContent();
                    String autor = elemento.getElementsByTagName("Autor").item(0).getTextContent();

                    //System.out.println("Atributo: " + atributo);
                    System.out.println("Titulo: " + titulo);
                    System.out.println("Autor: " + autor);

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
