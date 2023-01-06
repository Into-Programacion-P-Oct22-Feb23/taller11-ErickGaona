/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;



/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        sumaArreglo(informacion);
    }

    public static void sumaArreglo(int[][] datos) {

        //int [][] pares = new int [10][10];
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                suma = suma + datos[i][j];

            }
        }
        System.out.println("La suma es: " + suma);

    }

}
