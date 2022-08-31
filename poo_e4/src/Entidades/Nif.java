/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Admin
 */
public class Nif {
    private long Dni;
    private String letraNifs;

    public Nif() {
    }

    public Nif(long Dni, String letraNifs) {
        this.Dni = Dni;
        this.letraNifs = letraNifs;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public String getletraNifs() {
        return letraNifs;
    }

    public void setNifs(String letraNifs) {
        this.letraNifs = letraNifs;
    }

    @Override
    public String toString() {
        return "Nif{" + "Dni=" + Dni + ", letraNifs=" + letraNifs + '}';
    }
    
    
}
