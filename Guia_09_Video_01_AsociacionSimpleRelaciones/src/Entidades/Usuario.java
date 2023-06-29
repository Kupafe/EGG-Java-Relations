package Entidades;

import java.util.Date;
import java.util.List;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private int dni;
    private Date nacimiento;
    private String pais;
    
    /*
    Ahora se va a establecer la relacion vinculando al usuario con la Mascota
    Lo ponemos como un atributo de la Clase con la que queremos que se vincule
    o contenga a la otra.
    */
    //private Mascota mascota;
    // private Mascota mascota; --> Un Usuario se vincula a una Mascota
    /*
    private Mascota mascota; --> De esta simple manera ya estamos vinculando al
                                 Usuario con la Mascota
    */
    
    private List<Mascota> mascotas;
    /*
    private List<Mascota> mascotas; --> Un Usuario se vincula a ninguna, una o muchas Mascotas
    */

    /*
    Como se nos va a ser mas grafico y visible, es utilizando el easyUML
    Álgo para destacar del easyUML es que todos aquellos simbolos que tengan un
    signo menos (-) adelante, quiere decir que el metodo, funcion o atributo
    significa que este es privado, fijarse que el Metodo Constructor tiene un
    signo mas (+), quiere decir que este es Publico
    */
    public Usuario() {
    }
}