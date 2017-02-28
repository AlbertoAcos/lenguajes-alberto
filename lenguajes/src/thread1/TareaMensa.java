/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *primera forma de crear threads heredando la clase Tread
 * 
 */
public class TareaMensa extends Thread{

    @Override
    public void run() {
        
        System.out.println("Soy un thread!!");
    }
  
    
}
