/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author reroes
 */
public class Problema7 {

    static String resul;

    public static void main(String[] args) {
        String cadenas = arreglo();
        System.out.println("Las ciudades de EC son: " + cadenas);

        procedimiento();

    }

    public static String arreglo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Numero de elementos: ");
        int num = entrada.nextInt();
        resul = " ";
        String[] arreglo = new String[num];
        entrada.nextLine();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una Ciudad: ");
            String ciudad = entrada.nextLine();
            arreglo[i] = ciudad;
            resul = String.format("%s%s ", resul, arreglo[i]);

        }
        return resul;

    }

    public static void procedimiento() {
        //System.out.println(resul);
        String resultado = "";
        if (resul.length() >= 9 && resul.length() <= 5) {
            resultado = String.format("%s%s", resultado, resul);
            System.out.println("Los eleomentos con 4 o 5 caracteres son:"
                    + " " + resultado);
        }
    }

}
