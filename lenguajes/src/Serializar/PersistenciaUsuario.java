/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.*;

public class PersistenciaUsuario {
    /*
    Primer metodo de tipo accion guardar
    */
    public void guardar(Usuario u) throws Exception{
    File file=new File("Base-usuarios");
    FileOutputStream fos=new FileOutputStream(file); //string de bites
    ObjectOutput oos=new ObjectOutputStream(fos);   
    oos.writeObject(u);//objeto serializado y pasa el file y fos
    
    }
    
}
