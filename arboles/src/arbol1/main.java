package arbol1;

public class main {

	public static void main(String[] args) {
		
		ejercicio1 arbol = new ejercicio1();
		ejercicio1 arbol2 = new ejercicio1();
		arbol.addElem(3);
		arbol.addElem(4);
		arbol.addElem(7);
		arbol.addElem(2);
		arbol2.addElem(3);
		arbol2.addElem(4);
		arbol2.addElem(7);
		arbol2.addElem(2);

		
		System.out.println(arbol.shearchElem(9));
		System.out.println(arbol.estricto());
		System.out.println(arbol.altura());
		System.out.println(arbol.maximo());
		System.out.println(arbol.cuenta());
		System.out.println(arbol.cuentaHojas());
		System.out.println(arbol.suma());
		System.out.println(arbol.sumaPar());
		System.out.println(arbol.isIdentical(arbol2));

	}

}
