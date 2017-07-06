package repaso;

/**
 * Created by chuch on 22/06/2017.
 */
public class Opcion {

        private String titulo;
        private boolean estatus;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //a
        public Opcion(){}

        //b
        public Opcion(String titulo, boolean estatus){
            this.titulo=titulo;
            this.estatus=estatus;
        }
        //b
        public void setEstatus(boolean estatus){
            this.estatus=estatus;

        }
        public boolean isEstatus(){
            return estatus;

        }


    }

