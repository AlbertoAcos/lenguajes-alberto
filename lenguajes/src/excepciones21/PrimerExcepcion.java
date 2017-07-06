/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones21;

/**
 *
 * @author T-
 */
public class PrimerExcepcion {
    public static void main(String[] args) {
        //Aqqui vamos a poner las exvcepciones tipo unchecked
        //Estas el compilador no las checa, por eso no se muertran errores
        int[]enteros={1,3,5};
        
        //trataremos de hacer un elemento no existente
        System.out.println("El elemento del arreglo es "+enteros[0]);
        System.out.println("El elemento del arreglo es "+enteros[3]);
        System.out.println("El elemento del arreglo es "+enteros[1]);
        
    }
}
