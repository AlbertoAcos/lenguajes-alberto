/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org_unitec;

import java.sql.*;

public class OperacionesSQL {
    
    //Metodo para crear una tabla de prueba
   public static void crearTablaPrueba()throws Exception{
       
       //Primero nos conectamos
      Connection con= Conexion.conectarse("root", "root");
      
      //Segundo generamos un Statement
       Statement st= con.createStatement();
       
     //Ejecutamos una consulta
st.execute
        ("CREATE TABLE menso(id integer, nombre varchar(20))");
st.close();
con.close();
      
   }
    
}