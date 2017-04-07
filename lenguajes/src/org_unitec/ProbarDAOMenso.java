/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org_unitec;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class ProbarDAOMenso {
    public static void main(String[] args) {
        
        try {
            //Paso 1 creamos un Objeto de tipo Menso
            Menso m=new Menso(45,"Alberto");
            //Paso 2 lo guardamos

          //  DAOMenso.guardar(m);
            //System.out.println("Guardado");
            //actualizamos
            DAOMenso.actualizar(m);
            //Buscamos todos
            for(Menso men: DAOMenso.buscarTodos()){
                System.out.println(men.getId()+" "+men.getNombre());
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());  
        }
    }
}