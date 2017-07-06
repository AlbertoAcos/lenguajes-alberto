package elimc;

/**
 * Created by chuch on 15/06/2017.
 */
public class ProbarValidaciones {
    public  static void  main (String[] args){
        float x=6;
                try {
                    ValidacionUsuario.validarNoNegativo(x);
                    System.out.println("Primero que lanza excepcion");
                    Usuario u = new Usuario();
                    u.setAltura(-2);
                    System.out.println("Excepcion del ajuste de altura");

                    u.setPeso(80);
                    System.out.println("Excepcies del ajuste de peso");

                }catch (NumeroNoNegativoException e){
                    System.out.println(e.getMessage());
                }
    }
}
