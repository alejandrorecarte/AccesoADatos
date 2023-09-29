package Files;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {
        File d = new File ("C:\\Users\\AlejandroRecarteR\\IdeaProjects\\Acceso a Datos\\src");

        for (int i = 0; i < d.listFiles().length; i++){
            if (d.listFiles()[i].getName().equals(args[0])){
                if(d.listFiles()[i].isFile()){
                    System.out.println(args[0] +  " es un archivo.");
                } else if (d.listFiles()[i].isDirectory()){
                    System.out.println(args[0] + " es un directorio.");
                }
            }
        }
    }
}
