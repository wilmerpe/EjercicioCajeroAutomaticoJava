import javax.swing.*;

public class Ejercicio13Cajero {
    public static void main(String[] args) {
        final int saldo_incial = 1000;
        int opcion;
        float ingreso, saldo_actual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero automáticamente\n"
        + "1.- Ingresar dinero a la cuenta\n"
        + "2.-Retirar dinero de la cuenta corriente\n"
        + "3.-Salir"));

        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidad a ingresar"));
                    saldo_actual = saldo_incial + ingreso;
                    JOptionPane.showMessageDialog(null, "Su saldo en la cuenta es el total de:" + saldo_actual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidad que desea retirar"));

            if(retiro > saldo_incial){
                JOptionPane.showMessageDialog(null, "Lamentamos decirle que no dispone de esta cantidad que desea retirar");
            }else{
                saldo_actual = saldo_incial - retiro;
                JOptionPane.showMessageDialog(null, "El saldo en su cuenta es de: " + saldo_actual);
            }
            break;
            case 3 : break;
            default: JOptionPane.showMessageDialog(null, "La opción marcada no existe, pruebe de nuevo");
            break;
            
        }
    }
}
