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
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    PerroServicio perroServicio = new PerroServicio();
    
    ArrayList<Perro> listaPerrosAdoptados = new ArrayList();
    ArrayList<Persona> listaPerrosConDueno = new ArrayList();
    
    String opcion, perroAAdoptar;
    Boolean perroAdoptado;
    
    public void adoptarPerro(ArrayList<Persona> listaPersonas, ArrayList<Perro> listaPerros){
        
        Integer posicionPersona = 0;
        
        do{
            
            perroAdoptado = false;
            
            if(verificarAdopcion(listaPersonas, posicionPersona)){
                
                posicionPersona++;
                continue;
            }
            
             System.out.print("\n"+ listaPersonas.get(posicionPersona).getNombre() +" "+ listaPersonas.get(posicionPersona).getApellido() +" "
                    + "con Numero de DNI "+ listaPersonas.get(posicionPersona) +".\n"
                    + "\t¿Desea adoptar? - S (Si) / No.\n"
                    + "Elija opcion: ");
            opcion = leer.next().toUpperCase();

            if (opcion.equals("S")) {
                
                do{
                    
                    System.out.println("Lista de Perros a Adoptar.\n");
                    perroServicio.mostrarListaPerros(listaPerros);

                    System.out.print("Ingrese el nombre del perro que quiere adoptar: ");
                    perroAAdoptar = leer.next();

                    if(verificarPerro(listaPerros, perroAAdoptar) && verificarAdopcionPerro(listaPerros, perroAAdoptar)){

                        adoptarMascota(listaPerros, listaPersonas, perroAAdoptar, posicionPersona);
                        perroAdoptado = true;
                        
                    }else{
                     
                        System.out.println("El Perro ya fue adoptado o no se encuentra.");
                    }

                }while(perroAdoptado == false);
            }
            
            posicionPersona++;

        }while (posicionPersona != listaPersonas.size());
    }
    
    public Boolean verificarPerro(ArrayList<Perro> listaPerros, String perroAAdoptar){
        
        Boolean perroEncontrado = false;
        
        for (Perro p : listaPerros) {
            
            if(p.getNombre().equalsIgnoreCase(perroAAdoptar)){
                
                perroEncontrado = true;
                break;
            }
        }
        
        return perroEncontrado;
    }
    
    public Boolean verificarAdopcionPerro(ArrayList<Perro> listaPerros, String perroAAdoptar){

        Boolean perroEstaAdoptado = false;
        
        if(listaPerrosAdoptados.isEmpty()){
            
            perroEstaAdoptado = true;
            
        }else{
            
            for (Perro p : listaPerrosAdoptados) {
                
                if(p.getNombre().equalsIgnoreCase(perroAAdoptar)){
                    
                    break;
                    
                }else{
                    
                    perroEstaAdoptado = true;
                }
            }
        }
        
        return perroEstaAdoptado;
    }
    
    public void perroAdoptado(ArrayList<Perro> listaPerros, ArrayList<Persona> listaPersonas, String perroAAdoptar, Integer posicionPersona){
        
        for (Perro p : listaPerros) {
            
            if(p.getNombre().equalsIgnoreCase(perroAAdoptar)){
                
                listaPersonas.get(posicionPersona).setPerro(p);
                listaPerrosAdoptados.add(p);
                listaPerrosConDueno.add(listaPersonas.get(posicionPersona));
            }
        }
        
        System.out.println("Felicitaciones. Usted, "+ listaPersonas.get(posicionPersona).getNombre() +" "+ listaPersonas.get(posicionPersona).getApellido() +" adopto a "+ perroAAdoptar +".");
    }
    
    public void mostrarPerrosConDuenos(ArrayList<Persona> listaPersonas) {

        Integer posicionPersona = 0;
        
        for (Persona p : listaPersonas) {
            
            System.out.println("Nombre del dueño: " + listaPersonas.get(posicionPersona).getNombre() +" "
                    + listaPersonas.get(posicionPersona).getApellido() +" "
                    + " Numero de Documento: " + listaPersonas.get(posicionPersona).getDocumento() +" "
                    + "Edad: " + listaPersonas.get(posicionPersona).getEdad() +" años, adopto a "
                    + p.getPerro() +".");
            
            System.out.println("\n=======================================================================\n");
        }
    }
    
    private Boolean verificarAdopcion(ArrayList<Persona> listaPersonas, Integer posicionPersona){
        
        Boolean adopto = false;
        
        for (Persona p : listaPersonas) {
            
            if(p.getNombre().equalsIgnoreCase(listaPersonas.get(posicionPersona).getNombre())){
                
                adopto = true;
            }
        }
        
        return adopto;
    }
    
    private void adoptarMascota(ArrayList<Perro> listaPerros, ArrayList<Persona> listaPersonas, String perroAAdoptar, Integer posicionPersona){
        
        for (Perro perro : listaPerros) {
            
            if (perro.getNombre().equalsIgnoreCase(perroAAdoptar)){
                
                listaPersonas.get(posicionPersona).setPerro(perro);
                listaPerrosAdoptados.add(perro);
                listaPerrosConDueno.add(listaPersonas.get(posicionPersona));
            }
        }
        
        System.out.println("Felicitaciones!!. Usted "+ listaPersonas.get(posicionPersona).getNombre() +", adopto a "+ perroAAdoptar +".");
    }
}