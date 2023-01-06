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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Nota 1");
        int nota1 = entrada.nextInt();
        System.out.println("Ingrese Nota 2");
        int nota2 = entrada.nextInt();
        System.out.println("Ingrese Nota 3");
        int nota3 = entrada.nextInt();
        notasCualitativas(nota1, nota2, nota3);

    }

    public static void notasCualitativas(int nota1, int b, int c) {
        // TODO code application logic here
        
        int a= (nota1+b+c)/3;
        
        if (a >= 0 && a <= 5) {
            System.out.println("REGULAR");

        }
        if (a > 5 && a <= 8) {
            System.out.println("BUENO");

        }
        if (a > 8 && a <= 9) {
            System.out.println("MUY BUENA");

        }
        if (a > 9 && a <= 10) {
            System.out.println("SOBRESALIENTE");

        }

    }

}
