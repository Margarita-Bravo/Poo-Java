package ejercicioext2;

import Entidades.Puntos;
import Servicios.PuntosServicios;

/**
 *
 * @author Margarita
 */
public class EjercicioExt2 {

   
    public static void main(String[] args) {
        PuntosServicios ps = new PuntosServicios();
        Puntos objetoPunto = new Puntos();
        ps.crearPuntos();
        ps.calcularDistancia(objetoPunto);
    }
    
}
