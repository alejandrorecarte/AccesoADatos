package Repaso1;

import java.util.*;

public class Ordenar {
    private static Scanner sc;
    private static int[] nums;

    public static void ordenar(){
        nums = new int[3];
        sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Introduzca el " + (i+1) +"º número:");
            nums[i] = (sc.nextInt());
        }
        boolean ordenado = false;
        while (ordenado == false){
            ordenado = true;
            for (int i = 0; i < nums.length-1; i++){
                if(nums[i] > nums[i+1]){
                    ordenado = false;
                    int aux = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
