/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solucion;

/**
 *
 * @author T-102
 */
public class Usuario {
    Libro[] libros;
    String nombre;
    
    public void setLibros(Libro[] libros){
        this.libros=libros;
        
    }
    public Libro[] getLibros(){
        return libros;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Usuario(){}
    public Usuario(Libro[] libros, String nombre){
        this.libros=libros;
        this.nombre=nombre;
    }
}
