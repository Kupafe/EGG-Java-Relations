/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la 
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío. 
8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X 
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X 
6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F    
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X 
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X 
3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X 
2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F    
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X  
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento). 
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre. 
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.  
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    List<Pelicula> listaPeliculas = new ArrayList();
    
    Boolean peliculasArchivoAgregadas = false;
    Integer contador;
    
    public void menuPelicula(){
    
        String opcion;

        System.out.print("MENU PELICULAS.\n\n"
                + "\t1 - Ingresar Peliculas Disponibles en Archivo.\n"
                + "\t2 - Ingresar Nuevas Peliculas.\n"
                + "\t3 - Mostrar el Listado de Peliculas.\n"
                + "\t4 - Mostrar Peliculas ATP.\n"
                + "\t5 - Mostrar Peliculas Adultos.\n\n"
                + "\t6 - Continuar con la creacion de las Salas.\n"
                
                + "Elija opcion: ");
        opcion = leer.next();
        
        switch (opcion){
            
            case "1":
                
                if(peliculasArchivoAgregadas == false){
                    
                    peliculaArchivo();
                    
                }else{
                    
                    System.out.println("La peliculas de archivo fueron cargadas anteriormente, no es posible cargarlas nuevaente a la lista.");
                    menuPelicula();
                }
                
                break;
                
            case "2":
                
                peliculaNueva();
                break;
                
            case "3":
                
                listadoPeliculas();
                break;
                
            case "4":
                
                peliculasATP();
                break;
                
            case "5":
                
                peliculasAdultos();
                break;
                
            case "6":
                
                //Continuar con la creacion de las Salas
                break;
            
                
            default:
                
                System.out.println("Error. Opcion Incorrecta.");
                break;
        }
    }
    
    public void peliculaArchivo(){
        
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setTitulo("Granizo");
        pelicula1.setDirector("Marcos Carnevale");
        pelicula1.setDuracionEnMinutos(118);
        pelicula1.setEdadMinima(14);
        
        listaPeliculas.add(pelicula1);
        
        Pelicula pelicula2 = new Pelicula();
        pelicula2.setTitulo("Ready Player One: Comienza el juego");
        pelicula2.setDirector("Steven Spielberg");
        pelicula2.setDuracionEnMinutos(140);
        pelicula2.setEdadMinima(13);
        
        listaPeliculas.add(pelicula2);
        
        Pelicula pelicula3 = new Pelicula();
        pelicula3.setTitulo("Hasta que nos volvamos a encontrar");
        pelicula3.setDirector("Bruno Ascenzo");
        pelicula3.setDuracionEnMinutos(96);
        pelicula3.setEdadMinima(13);
        
        listaPeliculas.add(pelicula3);
        
        Pelicula pelicula4 = new Pelicula();
        pelicula4.setTitulo("Evil Dead: El Despertar");
        pelicula4.setDirector("Lee Cronnin");
        pelicula4.setDuracionEnMinutos(97);
        pelicula4.setEdadMinima(16);
        
        listaPeliculas.add(pelicula4);
        
        Pelicula pelicula5 = new Pelicula();
        pelicula5.setTitulo("Culpa mia");
        pelicula5.setDirector("Domingo Gonzalez");
        pelicula5.setDuracionEnMinutos(117);
        pelicula5.setEdadMinima(10);
        
        listaPeliculas.add(pelicula5);
        
        Pelicula pelicula6 = new Pelicula();
        pelicula6.setTitulo("Indiana Jones 5");
        pelicula6.setDirector("James Mangold");
        pelicula6.setDuracionEnMinutos(154);
        pelicula6.setEdadMinima(13);
        
        listaPeliculas.add(pelicula6);
        
        Pelicula pelicula7 = new Pelicula();
        pelicula7.setTitulo("Krakens y Sirenas");
        pelicula7.setDirector("Faryn Pearl, Kirk DeMicco");
        pelicula7.setDuracionEnMinutos(90);
        pelicula7.setEdadMinima(0);
        
        listaPeliculas.add(pelicula7);
        
        Pelicula pelicula8 = new Pelicula();
        pelicula8.setTitulo("Flash");
        pelicula8.setDirector("Sandy Muschietti");
        pelicula8.setDuracionEnMinutos(144);
        pelicula8.setEdadMinima(13);
        
        listaPeliculas.add(pelicula8);
        
        peliculasArchivoAgregadas = true;
        
        menuPelicula();
    }
    
    public void peliculaNueva(){
        
        String opcion;
        
        Pelicula pelicula = new Pelicula();
        
        System.out.print("Ingrese el titulo de la Pelicula: ");
        pelicula.setTitulo(leer.next());
        
        System.out.print("Ingrese el nombre del Director de la Pelicula "+ pelicula.getTitulo() +": ");
        pelicula.setDirector(leer.next());
        
        do{
            
            System.out.print("Ingrese la duraccion en minutos de la Pelicula "+ pelicula.getTitulo() +": ");
            pelicula.setDuracionEnMinutos(leer.nextInt());
            
        }while(pelicula.getDuracionEnMinutos() < 1);
        
        do{
        
            System.out.print("Ingrese la Edad Minima para poder ver la Pelicula "+ pelicula.getTitulo() +": ");
            pelicula.setEdadMinima(leer.nextInt());
        
        }while(pelicula.getEdadMinima()< 0);
        
        listaPeliculas.add(pelicula);
        
        System.out.print("Desea agregar una nueva pelicula - S (SI)/ N (NO): ");
        opcion = leer.next().toUpperCase();

        switch (opcion){

            case "S":

                peliculaNueva();
                break;

            case "N":

                System.out.println("Volviendo al Menu...");
                menuPelicula();
                break;

            default:

                System.out.println("Error. Opcion Incorrecta.");
                break;
        }
    }
    
    public void listadoPeliculas(){
        
        contador = 0;
        
        System.out.println("\nLISTADO DE PELICULAS.\n");

        for (Pelicula pelicula : listaPeliculas) {
            
            contador ++;
            System.out.println("Pelicula: "+ contador +", Titulo: "+ pelicula.getTitulo() +", Director: "+ pelicula.getDirector() +", Duracion: "+ pelicula.getDuracionEnMinutos() +" y Edad Minima: "+ pelicula.getEdadMinima() +".");
        }

        menuPelicula();
    }
    
    public void peliculasATP(){
        
        contador = 0;
        
        System.out.println("LISTADO DE PELICULAS ATP.");
        
        for (Pelicula pelicula : listaPeliculas) {
            
            if (pelicula.getEdadMinima() == 0){
                
                contador ++;
                System.out.println("Pelicula: "+ contador +", Titulo: "+ pelicula.getTitulo() +", Director: "+ pelicula.getDirector() +", Duracion: "+ pelicula.getDuracionEnMinutos() +" y Edad Minima: "+ pelicula.getEdadMinima() +".");
            }
        }
    }
    
    public void peliculasAdultos(){
        
        contador = 0;
        
        System.out.println("LISTADO DE PELICULAS ADULTOS.");
        
        for (Pelicula pelicula : listaPeliculas) {
            
            if (pelicula.getEdadMinima() >= 18){
                
                contador ++;
                System.out.println("Pelicula: "+ contador +", Titulo: "+ pelicula.getTitulo() +", Director: "+ pelicula.getDirector() +", Duracion: "+ pelicula.getDuracionEnMinutos() +" y Edad Minima: "+ pelicula.getEdadMinima() +".");
            }
        }
        
        if (contador == 0){
            
            System.out.println("No hay Peliculas para Adultos en estos momentos.");
        }
    }
}
