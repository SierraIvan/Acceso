package ejercicio1;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad = sc.nextInt();
		checkAge(edad);
		sc.close();
	}
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age < 18|| age > 100) {
			throw new InvalidAgeException("La edad debe estar entre 18 y 100 años.");
		}else {
			System.out.println("esta en el rango de edad");
		}
		
	}
	
}
