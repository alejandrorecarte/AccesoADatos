package Excepciones;

public class Ejercicio5 {

    public static void B(){
        try{
            C();
        }catch (StackOverflowError e){
            System.out.println("Alcanzado el límite de llamadas en función B");
        }
    }

    public static void C(){
        try{
            B();
        }catch (StackOverflowError e){
            System.out.println("Alcanzado el límite de llamadas en función C");
        }
    }

}
