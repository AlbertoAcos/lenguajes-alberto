/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;


public class Nomina {
    private String tipo;
    private float saldo;
    private int horasLaboradas;

    public Nomina(){
    
    }
    
    public Nomina(String tipo){
        this.tipo=tipo;
    }
    public Nomina(float saldo){
        this.saldo=saldo;
    }
    public Nomina(int horasLaboradas){
        this.horasLaboradas=horasLaboradas;
    }
    public Nomina (String tipo, float saldo, int horasLaboradas){
        this.tipo=tipo;
        this.saldo=saldo;
        this.horasLaboradas=horasLaboradas;
    }
    
    
        
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
    
}
