/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Usuario {

    private String nombre;
    private String paterno;
    private String apMaterno;
    private int edad;
    private int matricula;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    

    public Usuario(String paterno, String apMaterno, int edad, int matricula) {
        this.paterno = paterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.matricula = matricula;
    }
    
    
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getMatricula() {
        return matricula;
    }

  
    
    
}
