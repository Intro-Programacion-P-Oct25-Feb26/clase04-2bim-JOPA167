/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo045 {

    public static void main(String[] args) {
        // 

        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = llamarMatriz(arreglo1,arreglo2);
        int [][] arreglo4 = llamarMatrizDos(arreglo1,arreglo2);
        
        

        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
        obtenerReporte(arreglo4);
    }
    public static int potencia(int a,int b){
        double potencia;
        potencia= Math.pow(a,b);
        return (int)potencia;
    }
    
    public static int[][] llamarMatrizDos(int [][]a1,int[][] a2){
        int[][] a4= new int[3][3];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a4[i][j] = potencia(a1[i][j],
                        a2[i][j]);
            }
        }
        return a4;
    }
    

    public static int[][] llamarMatriz(int [][]a1,int[][] a2){
        int[][] a3= new int[3][3];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a3[i][j] = obtenerMultiplicacion(a1[i][j],
                        a2[i][j]);
            }
        }
        return a3;
    }

    public static void obtenerReporte(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

}
