package Repaso2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una nota:");
        Notas.notas(sc.nextInt());
        PatataCaliente.jugar();
        System.out.println("Introduce un número");
        Multiplicar.multiplicar(sc.nextInt());
        int[] numeros = Array.introducirNums();
        System.out.println("La media es "+ Array.calcularMedia(numeros));
        ArrayList<String> marcas = new ArrayList<>(List.of("BMW", "Renault", "Scania", "Volvo", "Mazda", "Ford", "Dacia", "Mercedes"));
        MarcasCoches.pares(marcas);
    }
}
