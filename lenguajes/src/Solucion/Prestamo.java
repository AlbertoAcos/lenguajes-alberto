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
public class Prestamo {
    public static void prestarAlumno(Alumno alumno) throws Exception{
    if(alumno.getLibros().lenght>=3) thow new Exception();
        }
    
    public static void prestarProfesor(Profesor profesor) throws Exception{
    if(profesor.getLibros().lenght>=2) thow new Exception();
        }
}