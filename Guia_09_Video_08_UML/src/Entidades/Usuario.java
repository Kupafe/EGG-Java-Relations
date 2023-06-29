package Entidades;

import Enumeraciones.SexoHumano;
import java.util.Date;
import java.util.List;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private int dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;

    // Atributo que establecen relaciones
    // Relacion de agregacion, no de composicion
    private List<Mascota> mascotas;
    private Mascota mascotaFavorita; // Para poder mostrar los dos ejemplos y ser coherente
    
    /*
    Relaciones de Uso, es una relacion muy debil.
    Yo hago uso de la Clase Math, entonces es una Relacion de Uso, y es debil
    porque solo aparece en este constructor, y luego no vuelve a aparecer.
    No es un atributo en si, no es algo vital en esta clase usuario, pero hago uso de esta clase
    
    public Usuario() {
        
        double PI = Math.PI;
    }  
    */
    
    public Usuario() {
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Mascota getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", \ndni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ",\n mascotas=" + mascotas + ", \n mascotaFavorita=" + mascotaFavorita + '}';
    }
}