package practica7;
//CLASE HERENCIA = CLASE PRACTICA7

/**
	*
	* @author berenamoralesojeda
	* 
**/

public class Practica7{


	public static void main(String[] args){
		System.out.println("****************************1*****************************");
		//Las clases base pueden comportarse como sus subclases

		Poligono poligono = new Poligono();
		System.out.println(poligono);

		Object objeto = new Object();
		System.out.println("Objeto " + objeto);

		objeto = poligono;
		System.out.println("Objeto como poligono" + objeto);

				//constructor de un poligono
		objeto = new Poligono();
		System.out.println("Objeto como Poligono "+ objeto);


		//Actividad 2, uso de instanceof
		System.out.println("****************************2*****************************");

		poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
	}



	public static void selectorPoligonos(Poligono poligono){

		if(poligono instanceof Triangulo){
			System.out.println("El objeto es un Triangulo");
		}else if(poligono instanceof Cuadrilatero){
			System.out.println("El objeto es un Cuadrilatero");
		}else if(poligono instanceof Poligono){
			System.out.println("El objeto es un Poligono");
		}else{
			System.out.println("El objeto es otra figura");
		}
	}


}




