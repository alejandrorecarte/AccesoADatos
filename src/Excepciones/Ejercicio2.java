package Excepciones;

public class Ejercicio2 {

    public static void provocarExcepcion(){
        try{
            System.out.println(0/0);
        }catch (ArithmeticException E){
            System.out.println("No es posible dividir 0/0");
        }
    }
}
