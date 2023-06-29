/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un n�mero de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Clase Revolver de agua: esta clase posee los siguientes atributos: posici�n actual (posici�n
del tambor que se dispara, puede que est� el agua o no) y posici�n agua (la posici�n del
tambor donde se encuentra el agua). Estas dos posiciones, se generar�n aleatoriamente.
M�todos:
    - llenarRevolver(): le pone los valores de posici�n actual y de posici�n del agua. Los valores
      deben ser aleatorios.
    - mojar(): devuelve true si la posici�n del agua coincide con la posici�n actual
    - siguienteChorro(): cambia a la siguiente posici�n del tambor
    - toString(): muestra informaci�n del revolver (posici�n actual y donde est� el agua)

Clase Jugador: esta clase posee los siguientes atributos: id (representa el n�mero del
jugador), nombre (Empezara con Jugador m�s su ID, "Jugador 1" por ejemplo) y mojado (indica
si est� mojado o no el jugador). El n�mero de jugadores ser� decidido por el usuario, pero
debe ser entre 1 y 6. Si no est� en este rango, por defecto ser� 6.
M�todos:
    - disparo(Revolver r): el m�todo, recibe el revolver de agua y llama a los m�todos de
      mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
      revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el m�todo
      devuelve true, sino false.

Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
M�todos:
    - llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este m�todo recibe los jugadores
      y el revolver para guardarlos en los atributos del juego.
    - ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
      aprieta el gatillo. S� el revolver tira el agua el jugador se moja y se termina el juego, sino se
      moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
      mojar. Al final del juego, se debe mostrar que jugador se moj�.

Pensar la l�gica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JuegoServicio {
    
    Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
    
    Jugador jugador = new Jugador();
    Revolver revolver = new Revolver();
    Juego juego = new Juego();
    
    JugadorServicio jugadorServicio = new JugadorServicio();
    RevolverServicio revolverServicio = new RevolverServicio();
    
    /*
    - llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este m�todo recibe los jugadores
      y el revolver para guardarlos en los atributos del juego.
    */
    public ArrayList llenarJuego(ArrayList<Jugador> jugadores){
        
        Integer cantidadJugadores;
        
        do{
        
            System.out.print("Ingrese la cantidad de jugadores (2, 3, 6).\n"
                    + "Como minimo para arrancar el Juego debe de haber dos jugadores y como maximo 6 jugadores.\n"
                    + "Ingrese la cantidad de jugadores: ");
            cantidadJugadores = leer.nextInt();
        
        }while (cantidadJugadores == 4 || cantidadJugadores == 5);
        
        if (cantidadJugadores > 6){
            
            System.out.println("Al haber seleccionado "+ cantidadJugadores +" Jugadores, por defecto el juego queda en SEIS Jugadores.");
            cantidadJugadores = 6;
        }

        for (int i = 0; i < cantidadJugadores; i++) {
            
            jugador.setId(i + 1);
           
            System.out.print("\nIngrese el nombre del jugador "+ (i + 1) +": ");
            String nombre = leer.next();

            jugadores.add(new Jugador((i+ 1), nombre, false));
        }
        
        System.out.println("Lista de Jugadores.");
        
        mostrarJugadores(jugadores);
        
        // Mesclo la lista de jugadores
        Collections.shuffle(jugadores);
        
        return jugadores;
    }
    
    // Mostrar la Lista de Jugadores
    public void mostrarJugadores(ArrayList<Jugador> jugadores){
        
        System.out.println("\nLos Jugadores actuales de la lista son:\n");
        
        for (Jugador aux : jugadores) {
            
            System.out.println("\t"+ aux.toString());
        }
        
        System.out.println("\nLa cantidad de Jugadores de la lista son: "+ jugadores.size() +".\n");
    }
    
     /*
    - ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
      aprieta el gatillo. S� el revolver tira el agua el jugador se moja y se termina el juego, sino se
      moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
      mojar. Al final del juego, se debe mostrar que jugador se moj�.
    */
    public void ronda(){

        ArrayList<Jugador> jugadores = new ArrayList();
        
        String opcion;
        
        Integer posicion = 1, totalJugadores;
        
        Boolean estaMojado;
        
        do{
            
            System.out.println("CARGAR LOS JUGADORES.\n");

            jugadores = llenarJuego(jugadores);

            mostrarJugadores(jugadores);
            
            totalJugadores = jugadores.size();
            

            //Cargar revolver
            
            revolverServicio.llenarRevolver(revolver);
            
            System.out.println(revolverServicio.toString(revolver)); // Borrar al terminar de programar el juego

            System.out.println("ARRANCA EL JUEGO.");
            
            
            for (int i = 0; i < 6; i++) {
               
                System.out.println("Comienza el jugador o la jugadora "+ jugadores.get(posicion).getNombre() +""
                        + ", esta, se apunta con el revolver a la cabeza, toma su tiempo y efectua el disparo.");
                
                estaMojado = jugadorServicio.disparo(revolver, jugadores, posicion);
                
                System.out.println("Esta mojado: "+ estaMojado);
                
                if (estaMojado == true){
                    
                    break;
                }
                
                posicion++;
                
                if (posicion == jugadores.size()){
                    
                    posicion = 0;
                }
            }
            
            System.out.println("FINALIZO EL JUEGO.\n\n"
                    + "El juego finalizo de la siguiente forma:\n");
            
            //------------------------------------------------------------------
            Collections.sort(jugadores, Comparadores.ordenarPorId);
           
            mostrarJugadores(jugadores);
            //------------------------------------------------------------------

            System.out.print("�Desea jugar nuevamente?.\n"
                    + "S (SI) / N (NO).\n"
                    + "Elija opcion: ");
            opcion = leer.next().toUpperCase();

            // Eliminar todos los elementos de un ArrayList
            jugadores.clear();
            
        } while(!opcion.equals("N"));
        
    }
   
}