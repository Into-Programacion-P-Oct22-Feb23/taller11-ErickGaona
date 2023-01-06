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
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        
        double mediaAritmetica = mediaAritmetica(informacion);
        double estandar = desviacionEstandar(informacion, 
                mediaAritmetica);
        
        System.out.printf("El valor de media aritmetica es %.2f y el valor de "
                + "La desviación estándar %.2f", mediaAritmetica,estandar);
    }
    
    public static double mediaAritmetica(int [] a) {
        
    }
    public static double desviacionEstandar(int [] a, double b) {
        
    }
       
}
