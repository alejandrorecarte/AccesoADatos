package Files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {

    public static void main(String[] args) {
        try {
            FileUtils.moveFileToDirectory(new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos\\Directorio\\Fichero1Copia.txt"), new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos"), true);
            FileUtils.moveFileToDirectory(new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos\\Directorio\\Fichero2.txt"), new File("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos"), true);

        } catch (IOException e) {
            System.out.println("No se han podido mover los archivos.");
        }
    }
}
