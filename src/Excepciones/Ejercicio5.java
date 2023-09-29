package Excepciones;

public class Ejercicio5 {

    public static void B() throws StackOverflowError{
        C();
    }

    public static void C() throws StackOverflowError{
        B();
    }

}
