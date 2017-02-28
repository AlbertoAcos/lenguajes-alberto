/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author T-102
 */
//Tercer forma de crear thread, es la mejor y es la que va a venir en el examen 
public class LaMejor {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("soy el mejor");
            }
            
        });
        t1.start();
    }
    
}
