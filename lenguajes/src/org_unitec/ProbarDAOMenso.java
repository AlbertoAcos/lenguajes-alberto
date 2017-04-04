/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org_unitec;

/**
 *
 * @author T-102
 */
public class ProbarDAOMenso {
public static void main(String[] args){
    try{
        //paso 1 creamos un objeto de tipo menso
    
    Mesno m=new Mesno(45,"Pedro");
    //paso2 lo guardamos
    //DAOMenso.guardar(m);
      //  System.out.println("Guardado");
    //}catch(Exception ex){
    for(Mesno men:DAOMenso.buscarTodos()){
     System.out.println(men.getID()+" "+men.getNombre());
    }
   }catch(Exception ex){
    }
}    
}
