/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treads;

/**
 *
 * @author T-
 */
public class TareaReloj extends Thread {

    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("me trabo"+i++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                
            }
        }}
    
    
}
