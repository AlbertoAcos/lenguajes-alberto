package repaso;

import java.util.ArrayList;

/**
 * Created by chuch on 22/06/2017.
 */
public class Aplicacion {

    private ArrayList<Pregunta> pregunta;

    public static void main(String[] args) {
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        //primera opcion
        Opcion op1=new Opcion("Lituania",false);
        Opcion op2=new Opcion("Estonia", false);
        Opcion op3=new Opcion("Kiev",true);
        Opcion op4=new Opcion("Leninakan", false);

        Pregunta p1=new Pregunta();
        p1.setTitulo("Cual es la capital de Ucrania?");
        //construimos el arraylist de opciones
        ArrayList<Opcion> opcions=new ArrayList<>();
        opcions.add(op1);
        opcions.add(op2);
        opcions.add(op3);
        opcions.add(op4);
        //La agregamos al set Opciones
        p1.setOpciones(opcions);
        preguntas.add(p1);

        for(Pregunta x:preguntas){
            System.out.println(x.getTitulo());
            for(Opcion y:x.getOpciones()){
                System.out.println(y.getTitulo());
            }
        }

    }


    }

