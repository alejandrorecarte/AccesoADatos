package Excepciones;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio6 {

    private static File f;
    private static FileReader fr;
    private static BufferedReader br;

    private static ArrayList<String> palabras;

    public static void lectorTXT(String ruta) throws Exception{
        palabras = new ArrayList<>();
        f = new File(ruta);
        fr = new FileReader(f);
        br = new BufferedReader(fr);

        String linea;

        while ((linea = br.readLine()) != null ){
            if(linea != null){
                String[] palabrasLinea = linea.split(" ");
                for (int i = 0; i < palabrasLinea.length ; i++){
                    palabras.add(palabrasLinea[i]);
                }
            }
        }

        Iterator i = palabras.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }
}
