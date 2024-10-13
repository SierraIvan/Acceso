package arbol1;

public class main {

	public static void main(String[] args) {
		
		ejercicio1 arbol = new ejercicio1();
		
		arbol.addElem(4);
		arbol.addElem(1);
		arbol.addElem(2);
		arbol.addElem(7);
		arbol.addElem(9);

		
		System.out.println(arbol.shearchElem(9));
		System.out.println(arbol.estricto());
		System.out.println(arbol.altura());
		System.out.println(arbol.maximo());
		System.out.println(arbol.cuenta());

	}

}
