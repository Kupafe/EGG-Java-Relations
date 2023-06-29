package Utilidades;

import Entidades.Jugador;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Jugador> ordenarPorId = new Comparator<Jugador>() { // Recorre de la Z a la A
        @Override
        public int compare(Jugador o1, Jugador o2) {
            
            return o1.getId().compareTo(o2.getId()); // Comparo
        }
    };
}
