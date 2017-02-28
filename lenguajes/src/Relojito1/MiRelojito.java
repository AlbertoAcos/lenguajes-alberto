/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relojito1;

import java.util.Calendar;

/**
 *
 * @author T-102
 */
public class MiRelojito {
     public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                    try{
                        Thread.sleep(1000);
                Calendar cal=Calendar.getInstance();
                int hora=cal.get(Calendar.HOUR_OF_DAY);
                int minutos=cal.get(Calendar.MINUTE);
                int segundos=cal.get(Calendar.SECOND);
                System.out.println(hora+":"+minutos+":"+segundos);
                    }catch(Exception e){}
                    }
            }
            
        });
        t1.start();
    }
}
