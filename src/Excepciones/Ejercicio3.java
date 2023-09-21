package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    private static Scanner sc;

    public static void provocarExcepcion(){
        System.out.println("Introduce un número");
        try{
            String variable = sc.next();
        }catch (InputMismatchException e){
            System.out.println("Has introducido un tipo de variable incorrecto");
        }
    }
}
