/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

/**
 *
 * @author T-102
 */
public class Cliente {
    private String nombre;
    private float sueldo;
    private int edad;

    @Override
    public String toString() {
       return "Nombre: "+nombre+" sueldo :"+ sueldo+" Edad:"+edad;
    }
    
    
            public Cliente(String nombre, float sueldo, int edad){
                this.nombre=nombre;
                this.sueldo=sueldo;
                this.edad=edad;
            }
    public Cliente(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
