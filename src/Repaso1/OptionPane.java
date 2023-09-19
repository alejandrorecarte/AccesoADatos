package Repaso1;


import javax.swing.*;

public class OptionPane {
    private static JOptionPane pane;

    public static void jOptionPane(){
        String letra = JOptionPane.showInputDialog(null, "Introduzca una letra");
        if (letra.equals(letra.toUpperCase())){
            JOptionPane.showConfirmDialog(null, "Es mayúscula", "UwU", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(null, "Es minúscula", "UwU", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
