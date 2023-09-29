package Files;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Ejercicio9 {

    public static void main(String[] args) {
        File d = new File("C:\\Users\\AlejandroRecarteR\\Ficheros");

        int tam = d.listFiles().length;
        File[] ficheros = d.listFiles();

        for(int i = 0; i < tam; i++){
            if (ficheros[i].length() > 362000 && ficheros[i].isFile()) {
                try{
                    FileUtils.moveFileToDirectory(ficheros[i], new File("C:\\Users\\AlejandroRecarteR\\Ficheros\\DirPDFMayores"), true);
                    System.out.println("El fichero " + ficheros[i].getName() + "se ha movido a DirPDFMayores");
                }catch (Exception e){
                    System.out.println("No se ha podido mover el archivo " + ficheros[i].getName() + " a DirPDFMayores");
                }
            }else if (ficheros[i].isFile()){
                try{
                    FileUtils.moveFileToDirectory(ficheros[i], new File("C:\\Users\\AlejandroRecarteR\\Ficheros\\DirPDFMenores"), true);
                    System.out.println("El fichero " + ficheros[i].getName() + "se ha movido a DirPDFMenores");
                }catch (Exception e){
                    System.out.println("No se ha podido mover el archivo " + ficheros[i].getName() + " a DirPDFMenores");
                }
            }
        }

        File dp = new File("C:\\Users\\AlejandroRecarteR\\Ficheros\\DirPDFMenores");
        tam = dp.listFiles().length;
        ficheros = dp.listFiles();

        for(int i = 0; i < tam; i++){
            if(ficheros[i].isFile()) {
                switch (dp.listFiles()[i].getName().split("")[0]) {
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                    case "e":
                    case "f":
                    case "g":
                    case "h":
                    case "i":
                    case "j":
                    case "l":
                    case "m":
                    case "n":
                    case "A":
                    case "B":
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "H":
                    case "I":
                    case "J":
                    case "K":
                    case "L":
                    case "M":
                    case "N":
                        try {
                            FileUtils.moveFileToDirectory(ficheros[i], new File("C:\\Users\\AlejandroRecarteR\\Ficheros\\DirPDFMenores\\DirPDFpequesAZ"), true);
                        } catch (Exception e) {
                            System.out.println("No se ha podido mover el fichero " + ficheros[i].getName() + "al directorio DirPDFpequesAZ");
                        }
                }
            }
        }

    }
}
