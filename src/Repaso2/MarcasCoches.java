package Repaso2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarcasCoches {

    public static void pares (ArrayList<String> marcas){
        Iterator iterador = marcas.iterator();
        int posicion = 0;
        while (iterador.hasNext()){
            if ((posicion % 2) == 0){
                iterador.next();
            }else{
                System.out.println("La marca de la posicion " + (posicion+1) + " es : " + iterador.next());
            }
            posicion++;
        }
    }


}
