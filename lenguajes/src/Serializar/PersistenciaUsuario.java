/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuario {
    ArrayList <Usuario> usuarios=new ArrayList<>();
    
   public void guardar(Usuario u)throws Exception{
        File file=new File("tabla-usuario");
       if(file.exists()) usuarios=buscarTodos();
     
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
         oos.writeObject(usuarios);
    }
    //Buscar todos
   public ArrayList<Usuario> buscarTodos()throws Exception{
       File file=new File("tabla-usuario");
       FileInputStream fis=new FileInputStream(file);
       ObjectInputStream ois=new ObjectInputStream(fis);
      usuarios= (ArrayList<Usuario>) ois.readObject(); 
       return usuarios;
   }
    /*
    primero obtenemos la busqueda
    */
    public Usuario buscarPorNombre(String nombre)throws Exception{
        File file=new File("basesita-usuarios");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario encontrado=null;
   Usuario u=     (Usuario) ois.readObject();
       //Comparamos
       if(u.getNombre().equals(nombre))encontrado=u;
       return encontrado;
    }
    //buscar por id
    public Usuario buscarPorID(int id)throws Exception{
        Usuario buscado=null;
        usuarios=buscarTodos();
        //Comienxa la busqueda
        buscado= usuarios.get(id);
            return buscado;
        }
    }   
