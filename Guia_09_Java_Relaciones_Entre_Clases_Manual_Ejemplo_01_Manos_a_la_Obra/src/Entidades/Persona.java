/*
EJERCICIO PERSONAEJERCICIO PERSONA - Relacion Uno a Uno
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase DNI. La clase DNI tendr� como atributos la serie (car�cter) y n�mero. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

// Realiza un programa en donde una clase Persona
public class Persona {
 
    // Atributo nombre, apellido y un objeto de clase DNI
    
    private String nombre;
    private String apellido;
    
    private DNI dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, DNI dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }


    
    
}
