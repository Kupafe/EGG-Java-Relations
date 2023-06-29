/*
EJERCICIO PERSONA - Relacion Uno a Uno
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase DNI. La clase DNI tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

public class DNI {
    
    private String serie;
    private Integer numero;

    public DNI() {
    }

    public DNI(String serie, Integer numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
}
