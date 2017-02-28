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
public class TareaMejor implements Runnable{
    public static void main(String[] args){
        //crear thread
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        //iniciarlo
        t1.start();
        
    }

    @Override
    public void run() {
        System.out.println("Soy un thread mejor");
    }
}
