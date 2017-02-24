/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author T-102
 */
public class MayusculasException extends Exception{
    public MayusculasException(){
        super("No se permiten mayuscylas en el nombre");
}
}
