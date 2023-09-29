package Excepciones;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1:
        Ejercicio1.rellenarMatriz();

        //EJERCICIO 2:
        Ejercicio2.provocarExcepcion();

        //EJERCICIO 3:
        try{
            Ejercicio3.provocarExcepcion();
        }catch (Exception e){
            System.out.println("Excepción generada");
        }

        //EJERCICIO 4:
        try {
            Ejercicio4.notas(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //EJERCICIO 5:
        try{
            Ejercicio5.B();
        }catch (StackOverflowError e){
            System.out.println("InputMistmatchException alcanzado");
        }

        //EJERCICIO &:
        try{
            Ejercicio6.lectorTXT("C:/Users/AlejandroRecarteR/Desktop");
        }catch (Exception e){
            System.out.println("No se ha podido encontrar la ruta del archivo");
        }
    }
}
