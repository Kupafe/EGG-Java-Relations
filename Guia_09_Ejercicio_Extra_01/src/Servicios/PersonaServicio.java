/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deber� preguntarle a
cada persona, que perro seg�n su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligi� un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.

Ejercicio Anterior
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendr� como atributos: nombre, raza, edad y tama�o; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Despu�s, vamos a tener que
pensar la l�gica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la informaci�n del Perro y de la Persona.
 */
package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde;
        
    Persona persona = new Persona();
    
    public void crearPersona(ArrayList<Persona> listaPersonas){
        
        String opcion, nombrePersona, apellidoPersona;
        Integer edadPersona, dniPersona;
        
        do{

            System.out.print("Ingrese el nombre de la Persona: ");
            nombrePersona = leer.next();
            
            System.out.print("Ingrese el apellido de "+ nombrePersona +": ");
            apellidoPersona = leer.next();
            
            do{
            
                System.out.print("Ingrese la edad de "+ nombrePersona +": ");
                edadPersona = leer.nextInt();
                
            }while(edadPersona < 1);
            
            do{
            
                System.out.print("Ingrese el Numero de DNI de "+ nombrePersona +": ");
                dniPersona = leer.nextInt();
                
            }while(dniPersona < 1);
        
            listaPersonas.add(new Persona(nombrePersona, apellidoPersona, edadPersona, dniPersona));

            System.out.print("�Desea ingresar otra Persona?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
        }while(!opcion.equalsIgnoreCase("N"));    
    }
    
    public void mostrarListaPersonas(ArrayList<Persona> listaPersonas) {
        
        System.out.println("\nLISTA DE PERSONAS.\n");
    
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      

        for (Persona aux : listaPersonas) {

            System.out.println(aux.toString());
        }
    }
}