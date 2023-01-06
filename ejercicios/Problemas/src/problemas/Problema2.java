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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese\n"
                + "1. área del cuadrado\n"
                + "2. área del triángulo\n"
                + "3. área del rectángulo");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerCuadrado();

            if (opcion == 2) {
                obtenerTriangulo();
            }
            if (opcion == 3) {
                obtenerRectangulo();
            }
        } else {
            System.out.println("Error");
        }

    }

    public static void obtenerCuadrado() {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        int a = entrada.nextInt();

        int resp = a * 4;
        System.out.println("El área del cuadrado es " + resp);
    }

    public static void obtenerTriangulo() {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el altura del triángulo ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el base del triángulo ");
        int b = entrada.nextInt();

        int resp = (a * b) / 2;
        System.out.println("El área del triángulo es " + resp);
    }

    public static void obtenerRectangulo() {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el altura del rectángulo");
        int a = entrada.nextInt();
        System.out.println("Ingrese el base del rectángulo");
        int b = entrada.nextInt();

        int resp = a * b;
        System.out.println("El área del rectángulo  es " + resp);
    }

}
