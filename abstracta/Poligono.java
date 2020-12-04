package abstracta;

/**
	*
	* @author berenamoralesojeda
	* 
**/

public abstract class Poligono {
    
    public abstract float area();
    public abstract float perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
    
    
}
