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
package Principal;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.MenuServicio;

public class Principal {

    public static void main(String[] args) {
        
        MenuServicio menuServicio = new MenuServicio();
        
        System.out.println("\nBIENVENIDOS A LA EJECUCION DEL PROGRAMA.\n\n"
                + "SISTEMA DE ADOPCION DE PERROS.");
        
        menuServicio.menu();
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
        
        
        /*
        Persona persona1 = new Persona();
        
        persona1.setNombre("Jazmin");
        persona1.setApellido("Kugler Mendoza");
        persona1.setEdad(16);
        persona1.setDocumento(47375699);
        
        Persona persona2 = new Persona();
        
        persona2.setNombre("Jaquelin");
        persona2.setApellido("Mendoza");
        persona2.setEdad(45);
        persona2.setDocumento(33100432);
        
        Perro perro1 = new Perro();
        
        perro1.setNombre("Luna");
        perro1.setRaza("Caniche");
        perro1.setEdad(6);
        perro1.setTamano("Chico");
        
        Perro perro2 = new Perro();
        
        perro2.setNombre("Nina");
        perro2.setRaza("Callejero");
        perro2.setEdad(7);
        perro2.setTamano("Mediano");
        
        persona1.setPerro(perro2); // Seteo el Perro a la Persona
        persona2.setPerro(perro1); // Seteo el Perro a la Persona
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
*/
    }
}