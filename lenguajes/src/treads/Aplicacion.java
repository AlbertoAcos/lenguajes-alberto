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
public class Aplicacion {
    public static void main(String[] args) {
        //Ciclo de vida de un Thread
        //nace
        PrimerTarea t1=new PrimerTarea();
        OtraTarea t2=new OtraTarea();
        TareaReloj t3=new TareaReloj();
        //lo ponemos en estado de inicado: estado runnable
        t1.start();
        t2.start();
        t3.start();
        //El siguiente paso es metero a la CPU
                
    }
}
