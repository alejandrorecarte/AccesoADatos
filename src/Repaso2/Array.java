package Repaso2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private static Scanner sc;

    public static int[] introducirNums(){
        sc = new Scanner(System.in);
        int[] numeros =  new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el "+(i+1) + "º número:");
            numeros[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        return numeros;
    }

    public static int calcularMedia(int[] numeros){
        int media = 0;
        for (int i = 0; i < numeros.length; i++){
            media+= numeros[i];
        }
        return (media/numeros.length);
    }
}
