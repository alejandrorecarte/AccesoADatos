package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    private static Scanner sc;

    public static void provocarExcepcion() throws InputMismatchException {
        throw new InputMismatchException();
    }
}
