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
package Entidades;

public class Perro {
    
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamano; // Chico, Mediano, Grande

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + '}';
    }
}
