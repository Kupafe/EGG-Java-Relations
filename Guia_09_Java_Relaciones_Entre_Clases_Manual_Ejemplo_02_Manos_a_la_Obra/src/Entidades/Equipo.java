/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posici�n
y n�mero. Luego otra clase Equipo que contenga una colecci�n de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la informaci�n de cada jugador.
 */
package Entidades;

import java.util.List;

public class Equipo {
    
     private List<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
}
