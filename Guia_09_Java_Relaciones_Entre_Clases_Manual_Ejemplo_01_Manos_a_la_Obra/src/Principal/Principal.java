/*
EJERCICIO PERSONA - Relacion Uno a Uno
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Principal;

import Entidades.DNI;
import Entidades.Persona;

public class Principal {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        persona.setNombre("Federico Pablo");
        persona.setApellido("Kugler");
        
        DNI dni = new DNI();
        dni.setSerie("Y");
        dni.setNumero(24413770);
        
        persona.setDni(dni); // Seteo al dni en la persona
        
        System.out.println(persona.toString());
    }
}

