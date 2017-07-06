package repaso2;

/**
 * Created by chuch on 26/06/2017.
 */
public class Alumno {
    private int cuenta;
    private String nombre;
    private int edad;

    //Constructor de defecto
    public Alumno(){}

    //Encapsulamiento
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        try{
            if(edad<=18)
                throw new EdadAlumnoException();

        }catch(){

        }

    }


}
