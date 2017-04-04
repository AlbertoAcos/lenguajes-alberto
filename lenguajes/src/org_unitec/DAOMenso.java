/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org_unitec;

import java.sql.*;
import java.util.ArrayList;
public class DAOMenso {
    public static void guardar(Mesno m) throws Exception{
        Connection con=Conexion.conectarse("root","root");
        //Generamos un Preoared Statment
        PreparedStatement ps= con.prepareStatement("inster into menso values(?,?)");
        ps.setInt(1,m.getId());
        ps.setString(2,m.getNombre());
        ps.execute();
    }
    public static ArrayList<Mesno> buscarTodos() throws Exception{
        Connection con= Conexion.conectarse("root","root");
        Statement st=con.createStatement();
        ArrayList<Mesno> mensos = new ArrayList<>();
        ResultStet res= st.executeQuery("select * from mens");
        
        //vamos a iterar
        while(res.next()){
            mensos.add(new Mesno(res.getInt(1),res.getString(2)));
            
        }
        return mensos;
    }
}
