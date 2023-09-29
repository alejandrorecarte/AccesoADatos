package Files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio7 {

    public static void main(String[] args) {
        File dest = new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos\\src");
        try {
            FileUtils.copyFileToDirectory(new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos\\src\\Excepciones\\Ejercicio7.java"), dest);
            FileUtils.copyFileToDirectory(new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos\\src\\Excepciones\\Ejercicio6.java"), dest);
        } catch (IOException e) {
            System.out.println("No se han podido copiar los archivos");
        }
    }
}
