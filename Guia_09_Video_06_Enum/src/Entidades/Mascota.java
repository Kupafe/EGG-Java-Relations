package Entidades;

import Enumeraciones.Raza;
import Enumeraciones.SexoAnimal;
import java.util.Objects;

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
public class Mascota implements Comparable<Mascota>{

//public class Mascota {
    
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
        
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")){
            
            this.tipo = tipo;
        }
        
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, Boolean cola, Raza raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        
        if(nombre.length() > 0){
            
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public Boolean isCola() {
        return cola;
    }

    public Raza getRaza() {
        return raza;
    }
    
    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    /**
     * Funcion destinada a pasear
     * 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        
        // energia = energia - energiaRestar;
        energia -= energiaRestar;
        
        return energia;
    }

    /**
     * Sobrecarga del metodo
     * 
     * Funcion destinada a pasear por vueltas
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        
        for (int i = 0; i < vueltas; i++) {
            
            energia -= energiaRestar;
        }
        
        return energia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apodo);
        hash = 23 * hash + Objects.hashCode(this.tipo);
        hash = 23 * hash + Objects.hashCode(this.color);
        hash = 23 * hash + Objects.hashCode(this.edad);
        hash = 23 * hash + Objects.hashCode(this.cola);
        hash = 23 * hash + Objects.hashCode(this.raza);
        hash = 23 * hash + this.energia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.energia != other.energia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return Objects.equals(this.cola, other.cola);
    }
    
    /* 
    Antes del metodo ToString apretamos las Teclas ALT + INSERT y Selecciono
    equals() and hashCode()..., marco todos los atributos, tanto del lado de
    equals y de hashCode.
    equals, sirve para comparar un objeto con otro.
    hashCode: genera un numero de tipo entero en base a los atributos.
    Ahora se genera (Generate)
    */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    /*
    // Listado de la A a la Z
    @Override
    public int compareTo(Mascota o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.nombre.compareTo(o.getNombre());
    }
    */
    
    // Listado de la Z a la A
    @Override
    public int compareTo(Mascota o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return o.getNombre().compareTo(this.nombre);
    }
}