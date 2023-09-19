package Repaso2;

public class Notas {

    public static void notas (int nota){
        switch((0 <= nota && nota <= 5 ) ? 0 : (5 == nota) ? 1 : (6 == nota) ? 2 : ( 7 <= nota && 8 >= nota) ? 3 : (nota <= 9 && nota >= 10) ? 4 : 5){
            case 0:
                System.out.println("Insuficiente"); break;
            case 1:
                System.out.println("Suficiente"); break;
            case 2:
                System.out.println("Bien"); break;
            case 3:
                System.out.println("Notable"); break;
            case 5:
                System.out.println("Sobresaliente"); break;
            default:
                System.out.println("Nota inválida"); break;
        }
    }
}
