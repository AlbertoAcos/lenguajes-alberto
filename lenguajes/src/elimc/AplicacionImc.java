/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elimc;

public class AplicacionImc {
    public static void main(String[] args) {
        Usuario yo=new Usuario();
        yo.setPeso(60);
        yo.setAltura(1.68f);
        
            Imc imc=new Imc();
            imc.setUser(yo);
            
            System.out.println(imc.calcular());
            
    }
    
}
