package ejercicio3;

import java.util.Scanner;



public class main {

	public static void main(String[] args){
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
		
		try {
			tabla[num1][num2] = valor;
			System.out.println("Matriz actualizada");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("No esta dentro del rango (0-3)");
			
		}
		
		for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
		
	}
	

}


