/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import java.io.*;

/**
 *
 * @author T-102
 */
public class ValidacionArchivo {

    /**
     *
     * @param file
     * @throws excepciones2.ExtencionNoValidaException
     */
    public  static void validarExtencion(File file) throws/*<-se puede lanzar una excepcion*/ ExtencionNoValidaException {
               String nombre= file.getName();
        //como obtener la extencion
       int indice1= nombre.indexOf(".");
       int indice2= nombre.length();
       String extencion=nombre.substring(1-1, indice2);
                if(extencion.equals("txt")) 
                    throw new ExtencionNoValidaException();
      //  throw new ExtencionNoValidaException();
}
}
