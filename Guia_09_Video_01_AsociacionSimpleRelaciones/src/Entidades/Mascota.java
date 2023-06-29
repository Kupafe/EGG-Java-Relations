package Entidades;

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

En este ejercicio se va a mostrar como vincular la Clase Mascota a la Clase
Usuario o al reves
*/
public class Mascota{

//public class Mascota {
    
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho.
    private String tipo;
    private String color;
    private Integer edad;
    private Boolean cola;
    
    /*
    String e Integer son Clases, en cambio Raza y SexoAnimal son
    enumeraciones
    */
        
    private int energia;

    public Mascota() {
        
        this.energia = 1000;
    }
}
