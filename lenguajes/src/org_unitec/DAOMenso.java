/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org_unitec;

import java.sql.*;
import java.util.ArrayList;
public class DAOMenso {
    
    //Primera  operación insert
    
    public  static  void guardar(Menso m)throws Exception{
        Connection con=Conexion.conectarse("root", "root");
        //Generamos un PreparedStatement
    PreparedStatement ps= con.prepareStatement("insert into menso"
            + " values(?,?)");
    ps.setInt(1, m.getId());
    ps.setString(2, m.getNombre());
    ps.execute();
        
    }
    
    public static ArrayList<Menso> buscarTodos()throws Exception{
    Connection con=    Conexion.conectarse("root", "root");
     Statement st=con.createStatement();
  ResultSet res=   st.executeQuery("select * from menso");
  ArrayList<Menso> mensos=new ArrayList<>();
  //vamos a iterrarlo
  while(res.next()){
      
      mensos.add(new Menso(res.getInt(1), res.getString(2)));
  }
  
  return mensos;
    }
    public static void actualizar(Menso men) throws Exception{
        Connection con= Conexion.conectarse("root","root");
        PreparedStatement ps= con.prepareStatement("update menso set nombre=? where id=?");
     ps.setString(1,men.getNombre());
     ps.setInt(2,men.getId());
     ps.executeUpdate();
    }
    
     public static void borrar(Menso men) throws Exception{
        Connection con= Conexion.conectarse("root","root");
        PreparedStatement ps= con.prepareStatement("delete drom menso where id=?");
     ps.setString(1,men.getNombre());
     
     ps.executeUpdate();
    }
}


