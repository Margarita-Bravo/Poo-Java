/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextr4;

import Entidades.Nif;
import Servicios.NifServicios;

/**
 *
 * @author Admin
 */
public class EjercicioExtr4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NifServicios ns = new NifServicios();
        Nif ciudadano=new Nif();
        ns.crearNif(ciudadano);
        ns.mostrar(ns, ciudadano);
    }
    
}
