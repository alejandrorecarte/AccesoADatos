package ManejoDeFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    public static void main(String[] args) {
        FileWriter fw;
        try {
            //Creamos el recurso FileWriter pasando como argumento del constructor la
            //dirección del fichero que deseamos leer.
            fw = new FileWriter("FichTexto.txt");

            //Usamos el método write para escribir el texto que deseemos en el archivo.
            fw.write("Esto es un texto escrito en un fichero de texto");

            //Cerramos el recurso FileWriter
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}