package Repaso;

import java.util.Scanner;

public class Registrar {
    private static String nombre;
    private static int edad;
    private static Scanner sc;


    public static void registrar() {
        sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        nombre = sc.next();
        System.out.println("Introduzca su edad:");
        edad = sc.nextInt();
        System.out.println("Buenos días " + nombre + " " + edad);
    }
}
