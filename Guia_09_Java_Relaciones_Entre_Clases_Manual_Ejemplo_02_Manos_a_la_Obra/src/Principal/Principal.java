/*
EJERCICIO JUGADOR - Relacion Uno a Muchos
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Principal;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        
       Jugador jugador1 = new Jugador();
       jugador1.setNombre("Jazmin");
       jugador1.setApellido("Kugler Mendoza");
       jugador1.setNumero(1);
       jugador1.setPosicion("Arquera");
       
       ArrayList<Jugador> jugadores = new ArrayList();
       
       jugadores.add(jugador1); // Agrego al jugador a llsta
       
       Equipo equipo = new Equipo();

       equipo.setJugadores(jugadores); // Seteamos la lista de jugadores en el equipo
       
 
       System.out.println("\nLos Jugadores actuales de la lista Equipo son:\n");
        
       System.out.println(equipo.toString());
    }
}
