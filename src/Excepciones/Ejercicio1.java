package Excepciones;

import java.util.Arrays;

public class Ejercicio1 {

    private static int[][] matriz;

    public static void rellenarMatriz(){
        matriz = new int[2][3];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < (matriz[i].length-1); j++){
                matriz[i][j] = i+j;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            System.out.println(Arrays.toString(matriz[i]));
        }

        //Pasaría esto
        try{
            System.out.println(matriz[2][3]);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Habría que poner
        System.out.println(matriz[1][2]);
    }
}
