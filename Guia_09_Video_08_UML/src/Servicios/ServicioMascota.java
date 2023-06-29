package Servicios;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {
    
    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las Ã± y los tilde
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota(){
        
        System.out.print("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
    }
    
    public void agregarMascota(Mascota m){
        
        mascotas.add(m);
    }
    
    public void mostrarMascotas(){
        
        System.out.println("\nLas mascotas actuales de la lista mascotas son:\n");
        
        for (Mascota aux : mascotas) {
            
            System.out.println("\t"+ aux.toString());
        }
        
        System.out.println("\nLa cantidad de mascotas de la lista son: "+ mascotas.size() +".\n");
    }
    
    /**
     * Crea mascotas TODOS chiquitos
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir
     * a la lista
     */
    public void fabricaChiquitos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));
        }
    }
    
    /**
     * Crea mascotas pidiendo datos por teclado
     * 
     * @param cantidad 
     */
    public void fabricaMascota(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
                    
            System.out.println(mascotaCreada.toString());
        }
    }
    
    /*
    // TODO Añadir Try and Catch
    public void actualizarMascota(int index){
        
        Mascota m = mascotas.get(index);
        
        m.setApodo("Roberto");
    }
    */
    
    public void actualizarMascota(int index){
        
        if(index <= (mascotas.size() - 1)){
            
            Mascota m = crearMascota();

            mascotas.set(index, m);
            
        }else{
            
            System.out.println("Fallo al modificar. El indice es erroneo.");
        }
    }
    
    public void eliminarMascota(int index){
        
        if(index <= (mascotas.size() - 1)){
            
            mascotas.remove(index);

        }else{
            
            System.out.println("Fallo al eliminar. El indice es erroneo.");
        }
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            
            if(m.getNombre().equals(nombre)){
                
                mascotas.remove(i);
            }
            
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            
            if(m.getNombre().equals("nombreViejo")){
                
                m.setNombre(nombreNuevo);
            }
            
        }
    }
}
