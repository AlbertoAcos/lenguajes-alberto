/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

/**
 *
 * @author T-102
 */
public class AplicacionNomina {
    public static void main(String[] args) {
        int x=2;
        Trabajador worker=new Trabajador ();
        worker.setNombre("Pedro");
        worker.setPaterno("Lopez");
        worker.setNumeroSeguro(90);
        if(worker.getNumeroSeguro()<=100)worker.setNumeroSeguro(100);
        
    System.out.print("El nombre es "+worker.getNombre());           
    System.out.print("El no. seguro es "+worker.getNumeroSeguro());                           
            }
    
}
