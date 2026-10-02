package cadena_de_palabras;

import java.util.Scanner;

public class Cadena_de_palabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Introduce una palabra");
	String texto = input.nextLine();
	
	String textosinespacio = texto.replace(" ", " ");
	
	System.out.println("Texto sin espacios : " + textosinespacio);
			
	input.close();
	
	
	
	
	
	}

}
