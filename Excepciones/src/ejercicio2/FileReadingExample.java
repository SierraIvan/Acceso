package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingExample {
	public static void main(String[] args) {
		BufferedReader reader = null; //Crea un reader como null
		try {
			System.out.print("Enter the file name: ");
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			String fileName = inputReader.readLine();//se pide al usuario un String, el String se guarda en la variable fileName
			reader = new BufferedReader(new FileReader(fileName));//mete en reader el String fileName
			String line;
			while ((line = reader.readLine()) != null) {//este while dice que mientras que la linea del reader no sea null, se imprime
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {//Esta excepcion dice lo siguiente: si el no se encuentra el archivo, se ejecuta la excepción
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {//Esta excepcion dice lo siguiente: si salta algun tipo de error se ejecuta la excepción
			System.out.println("An I/O error occurred: " + e.getMessage());
		} finally {
			try {
				if (reader != null) {//entra en el if si reader es distinto a null
					reader.close();//Cierra el reader
				}
			} catch (IOException e) {//Si da error al cerrar el archivo se ejecuta la excepción
				System.out.println("Error closing the file: " + e.getMessage());
			}
		}
	}
}
