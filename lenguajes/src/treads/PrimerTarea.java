/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treads;

/**
 * Esta es la primera forma de crea un Thread que es la mas facil y c
 * consiste en heredar la clase thread
 * 
 * @author T-
 */
//Paso1 heredamos la clase Thread
public class PrimerTarea extends Thread {
   //Paso2 sobre escribimos el metodo run
    @Override
    public void run(){
        System.out.println("Soy un thread que no hace nada");
    }
    
}
