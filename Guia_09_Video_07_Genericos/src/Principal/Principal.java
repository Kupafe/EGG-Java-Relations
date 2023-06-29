package Principal;

import Entidades.Mascota;
import Enumeraciones.RazaGatuna;
import Enumeraciones.RazaPerruna;

public class Principal {

    public static void main(String[] args) {
       
        Mascota m1 = new Mascota<RazaPerruna>("Fer", "Chiquito", "Perro"); // Generico --> <RazaPerruna>
        
        /*
        Vamos a especificar la variable m1 que nacio como Perro, pero ahora hay
        que especificarle la Raza.
        */
        m1.setRaza(RazaPerruna.BEAGLE);
        
        System.out.println(m1.toString());
        
        Mascota m2 = new Mascota<RazaGatuna>("Pepa", "Lola", "Gato"); // Generico --> <RazaGatuna>
        m2.setRaza(RazaGatuna.NARANJOSO);
        
        System.out.println(m2.toString());
    }
    
}
