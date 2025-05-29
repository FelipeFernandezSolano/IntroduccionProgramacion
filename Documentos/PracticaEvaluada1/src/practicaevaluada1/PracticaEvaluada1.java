/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author pipe-
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // obtener valor numerico
        String lectura;
        lectura = JOptionPane.showInputDialog("Digite el salario");
        //pasar de string a double
        double salario = Integer.parseInt(lectura);
        //SEM
        double salariosem = salario * 0.0925;
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + salariosem + "por concepto de SEM ");

        //IVM
        double salarioivm = salario * 0.0508;
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + salarioivm + "por concepto de IVM ");

        //Asociacion
        double asociacion = (salario - (salariosem + salarioivm)) * 0.025;
        JOptionPane.showMessageDialog(null, "Para la asociacion de la empresa    se le asigna " + asociacion + "por concepto de asoaciacion ");

    }

}
