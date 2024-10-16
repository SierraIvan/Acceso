package ejercicio3;

import java.util.Scanner;



public class main {

	public static void main(String[] args) throws InvalidNumException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		
		int[][] tabla = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9,10,11,12},
			    {13,14,15,16}
			};
		
		for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
		
		System.out.println("Introduce un valor para meterlo en el array: ");
		int valor = sc.nextInt();
		System.out.println("En que fila quieres meterlo (0-4): ");
		int num1 = sc.nextInt();
		System.out.println("En que columna quieres meterlo (0-4): ");
		int num2 = sc.nextInt();
		
		inputrequest(num1,num2);
		
		tabla[num1][num2] = valor;
		
		for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
		
	}
	
	public static void inputrequest(int num1, int num2) throws InvalidNumException {
		if(num1 < 0|| num1 > 3 || num2 < 0 || num2 > 3 ) {
			throw new InvalidNumException("La posicion tiene que estar entre los rangos de 0 y 3");
		}else {
			System.out.println("Matriz actualizada");
		}
		
	}
	

}


