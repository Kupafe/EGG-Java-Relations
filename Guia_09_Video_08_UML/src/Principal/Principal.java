package Principal;

import Entidades.Mascota;
import Entidades.Usuario;
import Enumeraciones.SexoHumano;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        // Dos mascotas creadas
        Mascota m1 = new Mascota("Fer", "Chiquito", "Perro");
        Mascota m2 = new Mascota("Pepa", "Filomena", "Perro");
        
        List<Mascota> mascotas = new ArrayList();
        
        mascotas.add(m1);
        mascotas.add(m2);
        
        /*
        Un Usuario tiene una sola Mascota Favorita, por lo tanto tengo que usar
        el setMascotaFavorita que es el que me setea al atributo MascotaFavorita
        quien yo quierea que sea mi favorita, que en este caso es la variable m1
        que es del tipo Mascota que es Chiquito
        */
        Usuario u = new Usuario();
        
        u.setApellido("Fiorde");
        u.setSexo(SexoHumano.HOMBRE);
        u.setNacimiento(new Date()); 
        
        System.out.println(new Date()); // Me da la Fecha y Hora actual. ART, es el uso horario
        /*
        A mi en estos momentos no me interesa que me muestre a Fecha Actual, lo 
        que quiero es que me muestre la Fecha de Nacimiento, asi que voy al
        constructor de DATE, me voy a los parentesis de
        "u.setNacimiento(new Date())" --> Date(), y dentro de los Parentesis
        presiono las teclas CTRL + SPACE y seleccionamos el String
        */
        u.setNacimiento(new Date("01/11/1991")); // dd/mm/aaaa
        
        
        u.setMascotaFavorita(m1);
        
        /*
        Las Mascotas m1 y m2 tienen que ser parte de mis mascotas, entonces,
        para eso debo utilizar el setter que hace referencia a Mascotas
        */
        u.setMascotas(mascotas);
        /*
        Este setMascotas agarra la Lista de Mascotas que son mias y las atribuye
        al usuario, es decir, las vincula.
        Si yo quiero trabajar, ver, editar hago de la siguiente forma:
        */
        System.out.println(u.toString());
    }
    
}
