package ManejoDeFicheros;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static void main(String[] args) {
        try{
            //Creamos el recurso FileReader pasando como argumento del constructor la
            //dirección del fichero que deseamos leer.
            FileReader fr = new FileReader("FichTexto.txt");

            //Creamos un bucle for para leer el contenido del reader hasta que devuelva -1
            //que nos indica el final del fichero.
            for(int content = fr.read(); content != -1; content = fr.read()){
                System.out.print((char) content);
            }

            //Cerramos el recurso FileReader
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
