/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.*;

public class ProbarAlumno {
  public static void main (String[] args)
  {
      Alumnos a=new Alumnos();
      
      Alumnos a2=new Alumnos("Juan");
      
      System.out.println("Tu nombre es "+a2.getNombre());
      JFrame ventana=new JFrame("Hola");
        ventana.setSize(200,120);
        ventana.setVisible(true);
  }  
}
