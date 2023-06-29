package Principal;

import Entidades.Usuario;
import Enumeraciones.Raza;
import Enumeraciones.SexoHumano;

public class Principal {

    public static void main(String[] args) {
        
        // Crear un nuevo usuario trabajando con enumeraciones
        Usuario u = new Usuario();
        
        //Le quiero añadir el sexo al usuario
        u.setSexo(SexoHumano.MUJER);
        
        // Como hago para ver el sexo
        System.out.println(u.getSexo());
        
        System.out.println("\n------------------------------------------------\n");
        
        System.out.println("\nTrabajar con Caracteristicas (Codigo y valor) en las EnumeracionesLISTA DE RAZAS DE PERROS.\n");
        
        System.out.print("Mostrar el Codigo de que es un Beagle: ");
        
        System.out.println(Raza.BEAGLE.getCodigo());
        
        System.out.print("Mostrar el Valor de que es un Beagle: ");
        
        System.out.println(Raza.BEAGLE.getValor());
        
        System.out.print("Mostrar el Enum de un Beagle: ");
        
        System.out.println(Raza.BEAGLE);
        
        System.out.print("Mostrar el ToString de un Beagle: ");
        
        System.out.println(Raza.BEAGLE);
        
        System.out.println("En este ultimo caso me mostro Beagle, pero convertido a un Tipo de Dato String.");
        
        
                
        System.out.println("\n------------------------------------------------\n");
        // COMO SE TRABAJA CON LAS ENUMERACIONES
        
        //Recorrer
        
        System.out.println("\nLISTA DE RAZAS DE PERROS.\n");
        
        for (Raza aux : Raza.values()) {
            /*
            values() Raza[] --> Nos trae todos los valores de la Enumeracion en un
            Array, en este caso seria la de Raza.

            valueOf(String name) Raza --> Nos permite poner un nombre a
            buscar, escrito de manera correcta y precisa tal cual esta en el Enum y
            nos vaa decir que existe,y si no existe esta enumeracion, nos v a dar
            un error.
            */
            
            System.out.println(aux);
        }
        
        System.out.println("\n------------------------------------------------\n");
        
        String razaInput = "BEAGLE";
        
        for (Raza aux : Raza.values()) {
            
            //if(aux.equals(razaInput)){
                
                //System.out.println("Raza input es igual al enum "+ aux);
                /*
                if(aux.equals(razaInput)){
                
                Esta estructura del if, nos va a tirar un error, ya que no hay 
                coincidencia, ya que la variable aux, que es la que yo agarro
                para comparar con razaInput, hay que saber que no son el mismo
                tipo de dato, tanto aux que es un Tipo de Dato Raza, y razaInput
                es de Tipo de Dato String.
                Entonces se soluciona de la siguiente manera:
                if(aux.toString().equals(razaInput)){
                */
            if(aux.toString().equals(razaInput)){
                
                System.out.println("Raza input es igual al enum "+ aux);
            }
        }
        
        System.out.println("\n------------------------------------------------\n");
        
        System.out.println("OTROS METODOS CON LOS QUE PODEMOS TRABAJAR.");
        
        // compareTo() --> Sirve para comparar con otro enum del mismo tipo
        
        System.out.println("\n------------------------------------------------\n");
        
        // ordinal() --> Nos muestra la posicion que ocupa dentro del enum
        
        System.out.println("ORDINAL.\n");
        
        for (Raza aux : Raza.values()) {
        
            System.out.println(aux.ordinal());
        }
        
        System.out.println("\n------------------------------------------------\n");
        
        // name() --> Nos muestra los valores que hay dentro del enum
        
        System.out.println("NAME.\n");
        
        for (Raza aux : Raza.values()) {
        
            System.out.println(aux.name());
        }
        
        System.out.println("\n------------------------------------------------\n");
        
        // toString() --> Convertimos de enum a String
        
        System.out.println("TO STRING.\n");
        
        for (Raza aux : Raza.values()) {
        
            if(aux.toString().equals(razaInput)){
                
                System.out.println("Raza input es igual al enum "+ aux);
            }
        }
    }
    
    //continuar a los 10:42 minutos
}
