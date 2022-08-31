package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Margarita
 */
public class PuntosServicios {
    
    public void crearPuntos(){
        Scanner leer=new Scanner(System.in);
        Puntos objetoPunto = new Puntos();
        System.out.println("Ingrese el valor de x1");
        objetoPunto.setX1(leer.nextInt());
        System.out.println("Ingrese el valor de y1");
        objetoPunto.setY1(leer.nextInt());
        System.out.println("Ingrese el valor de x2");
        objetoPunto.setX2(leer.nextInt());
        System.out.println("Ingrese el valor de y2");
        objetoPunto.setY2(leer.nextInt());
        
    }
    
    public void calcularDistancia(Puntos objetoPunto){
        double restaDeX=0;
        restaDeX=objetoPunto.getX1()-objetoPunto.getX2();
        double restaDeY=0;
        restaDeY=objetoPunto.getY1()-objetoPunto.getY2();
        System.out.println("rest " + restaDeX + " " + restaDeY);
        double elevadoDex=Math.pow(restaDeX, 2);
        double elevadoDey=Math.pow(restaDeY, 2);
        
        double distancia=Math.sqrt(elevadoDex+elevadoDey);
        
        System.out.println("La distancia que hay entre los dos puntos es " + distancia);
    }
}
