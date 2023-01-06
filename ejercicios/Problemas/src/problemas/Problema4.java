/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import static problemas.Problema2.obtenerCuadrado;
import static problemas.Problema2.obtenerRectangulo;
import static problemas.Problema2.obtenerTriangulo;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String cedula;
        boolean bandera = true;
        int opcion;
        System.out.println("Ingres su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingres su cédula");
        cedula = entrada.nextLine();

        System.out.println("Ingrese\n"
                + "1. Calcular el valor de la planilla de luz\n"
                + "2. calcular el valor del predio de un bien inmueble");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        }
        if (opcion == 2) {
            calcularPredio(nombre, cedula);
        } else {
            System.out.println("Error");
        }

    }

    public static void calcularValorLuz(String a, String b) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del kilowatio \n");
        double valork = entrada.nextDouble();
        System.out.println("Ingrese el número de kilowatios del mes\n");
        double numerok = entrada.nextDouble();

        double resp = valork * numerok;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor"
                + " de $%.2f",
                a,
                b,
                resp);
    }

    public static void calcularPredio(String a, String b) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de inmueble");
        double valorI = entrada.nextDouble();

        double resp = (valorI * 20)/100;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $ %.2f.\n",
                a,
                b,
                valorI,
                resp);
    }

}
