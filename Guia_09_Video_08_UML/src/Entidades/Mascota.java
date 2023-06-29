package Entidades;

import Enumeraciones.Raza;
import Enumeraciones.SexoAnimal;

/*
Otra cosa interesante que podemos llegar a saber  ademas de equals y hashCode
es utilizar el implements en la clase, o sea escribir la siguiente linea de
codigo public class Mascota implements Comparable<Object>.
Seguramente queda Mascota subrayado con rojo, ahi voy al foco con una marca
roja que esta en los numeros que me marcan el renglon, lo selecciono con el
puntero del mouse, aprieto boton izquierdo y selecciono "implement all abstract
methods" y nos asigna el Metodo compareTo que se encuntra antes  del metodo
ToString
*/
public class Mascota {
    
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho.
    private String tipo;
    private String color;
    private Integer edad;
    private Boolean cola;
    private Raza raza;
    private SexoAnimal sexo;
    
    private int energia;

    public Mascota() {
        
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", sexo=" + sexo + ", energia=" + energia + '}';
    }
}