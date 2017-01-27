/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

import java.util.Date;

/**
 *
 * @author T-102
 */
public class Nomina {
    private Trabajador worker;
    private Date fechaPago;
    private float saldo; 
    private Departamento depa;

    public Trabajador getWorker() {
        return worker;
    }

    public void setWorker(Trabajador worker) {
        this.worker = worker;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Departamento getDepa() {
        return depa;
    }

    public void setDepa(Departamento depa) {
        this.depa = depa;
    }

  
            
}
