package Enumeraciones;

public enum Raza {
    
    //BEAGLE, COCKER, PITBULL, BORDER_COLLIE, CANICHE, SALCHICHA, CALLEJERO, LABRADOR;
    
    /*
    Algo nuevo para aprender, aunque siendo novato todavia no esta permitido
    utilizar es la de añadir caracteristicas a cada enumeracion:
    */
    BEAGLE(32131, "Beagle"), COCKER(2323, "Cocker"), PITBULL(5689, "Pitbull"), BORDER_COLLIE(489214, "Border_Collie"), CANICHE(358962, "Caniche"), SALCHICHA(652341, "Salchicha"), CALLEJERO(7412, "Callejero"), LABRADOR(3589, "Labrador");
    /*
    Poner un Codigo acompañado de un valor
    */
    
    //Se puede utilizar public o private
    private Integer codigo;
    private String valor;
    
    //Constructor para los detalles de las enumeracion Raza
    private Raza(Integer codigo, String valor){
        
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
    
}
