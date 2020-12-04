package interfaz;

/**
    *
    * @author berenamoralesojeda
    * 
**/

public class Practica73 {
    public static void main(String[] args){
        System.out.println("****************************4*****************************");
        
        //InstrumentoMusical = new InstrumentoMusical;
        InstrumentoMusical instrumento;
        instrumento= new InstrumentoViento();
        instrumento.afinar();
        System.out.println(instrumento);
        
        instrumento= new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
        
    }
    
}