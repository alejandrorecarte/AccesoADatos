package Repaso2;

public class Multiplicar {

    public static void multiplicar(int num){
        if(num >= 0 && num <= 10){
            System.out.println("Tabla de multiplicar del " +num);
            for(int i = 1; i <= 20; i++) {
                System.out.println(num + " * " + i + " = " +(num*i));
            }
        }else{
            System.out.println("El numero debe estar entre 0 y 10");
        }
    }
}
