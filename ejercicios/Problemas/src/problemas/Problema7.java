/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Problema7 {

    static String resul;
    static String[] arreglo;

    public static void main(String[] args) {
        String cadenas = arreglo();
        System.out.println("Las ciudades de EC son: " + cadenas);

        procedimiento();

    }

    public static String arreglo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Numero de elementos: ");
        int num = entrada.nextInt();
        resul = "";
        arreglo = new String[num];
        entrada.nextLine();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una Ciudad: ");
            String ciudad = entrada.nextLine();
            arreglo[i] = ciudad;
            resul = String.format("%s- %s ", resul, arreglo[i]);

        }
        return resul;

    }

    public static void procedimiento() {
        //System.out.println(resul);
        String resultado = "";
        int i = 0;
//        resul.split("\\|");
//        System.out.println(resul);
        //System.out.println(arreglo[i]);
        System.out.println("Los elementos con 4 o 5 caracteres son:");
        for (i = 0; i < arreglo.length; i++) {

            if (arreglo[i].length() >= 4 && arreglo[i].length() <= 5) {
                //resultado = String.format("%s%s", resultado, arreglo[i]);

                System.out.println(arreglo[i]);
            }
        }
    }

}
