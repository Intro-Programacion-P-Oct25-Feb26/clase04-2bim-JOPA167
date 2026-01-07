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
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int [] valores1 = {10,100,1000,20,200,2000};
        int [] valores2 = {1000,1001,1002,1003,1004,1005};
        obtenerSuma(10, 30); // se invoca al método (procedimiento) obtenerSuma
        for (int i = 0; i>valores1.length;i++){
            int v1 = valores1[i];
            int v2 = valores2[i];
            obtenerSuma(v1,v2);
        }
        
/*Creamos 2 arreglos con varias datos de tipo entero, luego creamos un for, para iterar
        en cada arreglo y a su vez creamos 2 variables para que reciban estos valonres
        y poder enviarlos como argumentos a la funcion obtenerSuma
        */
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
