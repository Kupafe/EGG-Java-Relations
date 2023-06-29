package Utilidades;

import Entidades.Mascota;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() { // Recorre de la Z a la A
        @Override
        public int compare(Mascota o1, Mascota o2) {
            
            return o2.getNombre().compareTo(o1.getNombre()); // Comparo
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() { // Recorre de la 99 a 0
        @Override
        public int compare(Mascota o1, Mascota o2) {
            
            return o2.getEdad().compareTo(o1.getEdad()); // Comparo
        }
    }; 
    
    
}
