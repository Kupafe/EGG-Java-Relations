/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.

Ejercicio Anterior
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuServicio {
    
    public void menu(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        PerroServicio perroServicio = new PerroServicio();
        PersonaServicio personaServicio = new PersonaServicio();
        AdopcionServicio adopcionServicio = new AdopcionServicio();
        
        ArrayList<Persona> listaPersonas = new ArrayList();
        ArrayList<Perro> listaPerros = new ArrayList();
        
        String opcion;
        
        do{
            
            System.out.print("\n----- MENU. -----\n"
                + "\n\t1 - Cargar Perros.\n"
                + "\t2 - Cargar Personas.\n"
                + "\t3 - Mostrar Perros a ser Adoptados.\n"
                + "\t4 - Mostrar Personas que quieren adoptar perros.\n"
                + "\t5 - Proceso de Adopcion.\n"
                + "\t6 - Mostrar los Perros que ya tienen Dueños.\n"
                + "\n\t0 - Salir.\n"
                + "\nElija opcion: ");
            opcion = leer.next().toUpperCase();
         
            switch (opcion) {
                
                case "1":
                    
                    perroServicio.crearPerro(listaPerros);
                    break;
                    
                case "2":
                    
                    personaServicio.crearPersona(listaPersonas);
                    break;
                    
                case "3":
                    
                    perroServicio.mostrarListaPerros(listaPerros);
                    break;
                    
                case "4":
                    
                    personaServicio.mostrarListaPersonas(listaPersonas);
                    break;
                 
                case "5":
                    
                    adopcionServicio.adoptarPerro(listaPersonas, listaPerros);
                    break;
                
                case "6":
                    
                    adopcionServicio.mostrarPerrosConDuenos(listaPersonas);
                    break;
                    
                case "0":
                    
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    
                    System.out.println("Opción inválida");
                    break;
            }
            
        }while(!opcion.equals("0"));
    }
}
