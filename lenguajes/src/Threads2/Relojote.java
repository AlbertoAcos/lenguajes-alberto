package Threads2;

/**
 * Created by chuch on 06/07/2017.
 * aqui vamos a usar el polimorfismo, esta clase es polimorfica
 */
public class Relojote implements  Runnable,ComportamientoComer{
    public static void main(String[] args) {
        //Probemoos que no podemos crear objetos de las interfaces
      //  ComportamientoComer cp=new ComportamientoComer();
        //Aqui se crea ek thread POLIMORFICAMENTE
        Runnable r=new Relojote();
        Thread t1=new Thread(r);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("pronto seras un relog");

    }
}
