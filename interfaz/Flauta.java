package interfaz;

/**
    *
    * @author berenamoralesojeda
    * 
**/

public class Flauta extends InstrumentoViento {

    public Flauta() {
    }
    
    @Override
    public String tipoInstrumento(){
    return "flauta";
}
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
}