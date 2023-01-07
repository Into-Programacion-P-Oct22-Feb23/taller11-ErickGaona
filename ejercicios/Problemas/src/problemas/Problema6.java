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
public class Problema6 {

    static int media;

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double mediaAritmetica = mediaAritmetica(informacion);
        double estandar = desviacionEstandar(informacion, mediaAritmetica);

        System.out.printf("El valor de media aritmetica es %.2f y el valor de "
                + "La desviación estándar %.2f \n", mediaAritmetica, estandar);

    }

    public static double mediaAritmetica(int[] a) {
        int suma = 0;

        int i;
        for (i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        media = suma / i;
        return media;

    }

    public static double desviacionEstandar(int[] a, double b) {
        double desviacion;
        double suma = 0;
        double suma2=0;
        double desviacion2=0;
        for (int i = 0; i < a.length; i++) {

            desviacion = Math.pow(a[i] - media,2);
            suma = suma + desviacion;
            suma2 = suma / 9;

            desviacion2 = Math.sqrt(suma2);
//            System.out.println(a[i] + " - " + media + "| " + desviacion);
//            System.out.println("--------------------------");
//            System.out.println("aqui:"+suma);
//            System.out.println("-----------------------------");
//            System.out.println("here:"+suma2);

            //System.out.println("xd"+suma);
            
        }
        return desviacion2;

    }

}
