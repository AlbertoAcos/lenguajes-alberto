package elimc;

/**
 * Created by chuch on 15/06/2017.
 */
public class ValidacionUsuario {
    public static void validarNoNegativo(float numero) throws NumeroNoNegativoException{
        //throws se ocupa cuando la excepcion diseñada po nosotros
        //pudiera lanzarse
        if (numero<0)throw new NumeroNoNegativoException();


    }

}
