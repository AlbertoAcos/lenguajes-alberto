package repaso;

import java.util.ArrayList;

/**
 * Created by chuch on 22/06/2017.
 */
import java.util.*;
public class Pregunta {
    private String titulo;
    private ArrayList<Opcion> opciones;

    //c
    public Pregunta(){}
    //d
    public Pregunta(String titulo, ArrayList<Opcion> opciones){
        this.titulo=titulo;
        this.opciones=opciones;

    }

    public ArrayList<Opcion> getOpciones()
    {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {

        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
