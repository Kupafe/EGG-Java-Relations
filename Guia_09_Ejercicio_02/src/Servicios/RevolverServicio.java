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
jugador), nombre (Empezara con Jugador m�s su ID, ?Jugador 1? por ejemplo) y mojado (indica
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

import Entidades.Revolver;

public class RevolverServicio {
    
    public void llenarRevolver(Revolver revolver){
       
        revolver.setPosicionActual((int) (Math.random() * 6 + 1));
        revolver.setPosicionAgua((int) (Math.random() * 6 + 1));
    }
    
    public Boolean mojar(Revolver revolver){
    //public Boolean mojar(Revolver revolver){
        
        Boolean estaMojado;
        
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()){
            
            estaMojado = true;
            
        }else{
            
            estaMojado = false;
        }
        
        return estaMojado;
    }
    
    public void siguienteChorro(Revolver revolver){ // siguienteBala
        
        revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        
        if(revolver.getPosicionActual() > 6){
            
            revolver.setPosicionActual(1);
        }
    }
    
    public void mostrarPosicionesRevolver(Revolver revolver){
        
        System.out.println(revolver.toString());

        System.out.println("Posicion Actual: "+ revolver.getPosicionActual() +"\n"
                + "Posicion Agua: "+ revolver.getPosicionActual() +".");
     
    }

    public String toString(Revolver revolver){
        
        return "Posicion Actual: "+ revolver.getPosicionActual() +" Posicion Agua: "+ revolver.getPosicionAgua() +".";
    }

}