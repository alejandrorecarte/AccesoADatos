package Repaso2;

import  java.util.Scanner;
public class PatataCaliente {

    private static int num;
    private static int intentos;
    private static Scanner sc;

    public static void jugar(){
        sc = new Scanner(System.in);
        num = (int) (Math.random()*100);
        intentos = 0;
        boolean adivinado = false;

        while(adivinado == false){
            System.out.println("Número de intentos: "+intentos);
            System.out.println("Indique un número:");

            int adiv = sc.nextInt();

            if(adiv > num){
                System.out.println("El número a adivinar es menor que "+adiv);
                intentos++;
            } else if (adiv < num){
                System.out.println("El número a adivinar es mayor que "+adiv);
                intentos++;
            }else{
                System.out.println("¡Has acertado el número!");
                adivinado = true;
            }
        }
    }
}
