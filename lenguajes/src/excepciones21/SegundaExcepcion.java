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
public class SegundaExcepcion {
    public static void main(String[] args) {
        //Otra exceocion muy conocida de tipo unchecked es la NumberFormatException
        String falsoNumero="cuatro";
        int numeroVerdadero=5;
        
        //Convertimos el falso numero
        int corregido=Integer.parseInt(falsoNumero);
        int suma=corregido+numeroVerdadero;
        System.out.println(suma);
        
    }
}
