package Files;

import java.io.File;

public class Ejercicio4 {

    public static void main(String[] args) {
        File d = new File(".");

        System.out.println("INFORMACION SOBRE EL FICHERO:");
        System.out.println("Nombre del fichero: " + d.getName());
        System.out.println("Ruta:" + d.getPath());
        System.out.println("Ruta absoluta: " + d.getAbsolutePath());
        System.out.println("Se puede leer: " + d.canRead());
        System.out.println("Tamaño: " + d.length());
        System.out.println("Es un fichero: " + d.isFile());
        System.out.println("Nombre del directorio padre: " + d.getParent());
    }
}
