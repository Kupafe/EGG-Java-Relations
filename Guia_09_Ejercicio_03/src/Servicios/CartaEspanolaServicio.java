/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
- barajar(): cambia de posición todas las cartas aleatoriamente.
- siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
  se haya llegado al final, se indica al usuario que no hay más cartas.
- cartasDisponibles(): indica el número de cartas que aún se puede repartir.
- darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
  cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
  debemos indicárselo al usuario.
- cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
  indicárselo al usuario
- mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
  luego se llama al método, este no mostrara esa primera carta.
 */
package Servicios;

import Entidad.CartaEspanola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartaEspanolaServicio {

    ArrayList<CartaEspanola> listaCartas = new ArrayList();
    ArrayList<CartaEspanola> listaCartasDadas = new ArrayList();
    
    public void crearBaraja(){
     
        String cartaPalo = "";
        
        for (int i = 1; i < 13; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                if(i == 8 || i == 9){
                    
                    break;
                    
                }else{
                    
                    switch(j){
                        
                        case 0:
                            
                            cartaPalo = "ESPADA";
                            break;
                            
                        case 1:
                            
                            cartaPalo = "BASTO";
                            break;
                            
                        case 2:
                            
                            cartaPalo = "ORO";
                            break;
                            
                        case 3:
                                
                            cartaPalo = "COPA";
                            break;
                    }
                }
                
                CartaEspanola carta = new CartaEspanola();
                
                carta.setNumero(i);
                carta.setPalo(cartaPalo);
                
                listaCartas.add(carta);
            }
        }
    }
    
    // - barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
    
        Collections.shuffle(listaCartas);
    }
    
    /*
    - siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    se haya llegado al final, se indica al usuario que no hay más cartas.
    */
    public void siguienteCarta(){
        
        for (CartaEspanola lCartas : listaCartas) {
            
            for (int i = 0; i < 1; i++) {
                
                System.out.println("La carta que salio es:");
                System.out.println(lCartas);
                
                listaCartas.remove(lCartas);
                
                listaCartasDadas.add(lCartas);
                
                break;
            }
            
            break;
        }
    }
    
    /*
    - cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    */
    public void cartasDisponibles(){
        
        System.out.println("Las cartas disponibles son: "+ listaCartas.size() +" cartas.");        
    }
    
    /*
    - darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
      cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
      debemos indicárselo al usuario.
    */
    public void darCartas(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        Integer cartasPrecisa;
        
        System.out.print("Cuantas cartas precisa: ");
        cartasPrecisa = leer.nextInt();
        
        if(cartasPrecisa <= listaCartas.size()){
            
            System.out.println("\n---------------------------------------\n"
                    + "Las cartas son:\n");
            
            for (int i = 0; i <= cartasPrecisa; i++) {
                
                for (CartaEspanola cartaEspanola : listaCartas) {
                    
                    for (int j = 0; j < i; j++) {
                        
                        System.out.println(cartaEspanola);
                        listaCartas.remove(cartaEspanola);
                        listaCartasDadas.add(cartaEspanola);
                        break;
                    }
                    
                    break;
                }
            }
            
            System.out.println("---------------------------------------\n");

        }else{
            
            System.out.println("No se entregan cartas, ya que las cartas pedidas no son suficientes para dar.");
        }
    }
    
    /*
    - cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
      indicárselo al usuario
    */
    public void cartasMonton(){
        
        System.out.println("Las cartas del monton son: "+ listaCartasDadas.size() +" cartas.");
        
        for (CartaEspanola cartaEspanola : listaCartasDadas) {
                    
            System.out.println(cartaEspanola);
        }
    }
    
    /*
    - mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
      luego se llama al método, este no mostrara esa primera carta.
    */
    public void mostrarBaraja(){
        
        for (CartaEspanola cartaEspanola : listaCartas) {
                    
            System.out.println(cartaEspanola);
        }
    }
    
    public void menu(){
        
        Scanner leer = new Scanner(System.in);
        
        String opcion;
        
        crearBaraja();
        
        do {
            System.out.print("\nMENU.\n"
                    + "\n\t1 - Mezclar cartas.\n"
                    + "\t2 - Mostrar cartas del mazo.\n"
                    + "\t3 - Devolver la siguiente carta del mazo.\n"
                    + "\t4 - Ver numero de cartas disponibles en el mazo.\n"
                    + "\t5 - Ver las cartas que hay en el monton.\n"
                    + "\t6 - Dar cartas.\n\n"
                    + "\t0 - Salir.\n\n"
                    + "Elija opcion: ");
            opcion = leer.next();
            
            switch (opcion) {
                
                case "1":
                    
                    barajar();
                    break;
                    
                case "2":
                    
                    mostrarBaraja();
                    break;
                    
                case "3":
                    
                    siguienteCarta();
                    break;
                    
                case "4":
                    
                    cartasDisponibles();
                    break;
                    
                case "5":
                    
                    cartasMonton();
                    break;
                    
                case "6":
                    
                    darCartas();
                    break;
                    
                case "0":
                    
                    System.out.println("Saliendo..");
                    break;
                    
                default:
                    
                    System.out.println("Opcion mal ingresada.");
                    break;
            }
        } while (!opcion.equals("0"));        
    }
}
