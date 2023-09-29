package Files;

import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {

        File d = new File ("C:/Users/AlejandroRecarteR/Desktop/Interfaces");

        try{
            System.out.println("El numero de ficheros es: "+ d.list().length);
        }catch (Exception e){
            System.out.println("Error al buscar el directorio");
        }
    }
}
