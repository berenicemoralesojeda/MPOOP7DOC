package interfaz;

/**
    *
    * @author berenamoralesojeda
    * 
**/

public class InstrumentoViento implements InstrumentoMusical{

    public InstrumentoViento() {
    }
    
    @Override
    public void tocar(){
    System.out.println("Estoy tocando un instrumento de viento");
}
    @Override
    public void afinar(){
    System.out.println("Estoy afinando mi instrumento");
}

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
        }