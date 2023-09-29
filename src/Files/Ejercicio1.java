package Files;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {

        File d = new File ("Directorio");
        File f1 = new File (d,"Fechero1.txt");
        File f2 = new File (d,"Fichero2.txt");

        if(!d.mkdir()){
            if(!d.exists()){
                System.out.println("No se ha podido crear el directorio");
                System.exit(-1);
            }
        }

        try{
            if(f1.createNewFile()){
                f1.createNewFile();
            }else{
                throw new IOException("No se ha podido crear el fichero 1");
            }

            if(f2.createNewFile()){
                f2.createNewFile();
            }else{
                throw new IOException("No se ha podido crear el fichero 2");
            }

            if(f1.renameTo(new File(d,"Fichero1Copia.txt"))){
                f1.renameTo(new File(d,"Fichero1Copia.txt"));
            }else{
                throw new IOException("No se ha podido modificar el nombre del fichero");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(-2);
        }
    }
}
