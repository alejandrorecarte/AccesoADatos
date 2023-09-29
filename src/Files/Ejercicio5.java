package Files;

import java.io.File;

public class Ejercicio5 {

    public static void main(String[] args) {
        File d = new File(".");
        for (int i = 0; i < d.listFiles().length; i++){
            System.out.println("Nombre: " + d.listFiles()[i].getName() + ", es fichero? " + d.listFiles()[i].isFile() + ", es directorio? " + d.listFiles()[i].isDirectory());
        }
    }
}
