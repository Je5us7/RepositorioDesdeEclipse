package entdes;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		
		devuelveStringsContatenados();
	}

	static void devuelveStringsContatenados() {
		
		Scanner scanner =new Scanner(System.in);
	
			
		System.out.println("Introduzca su primera cadena: ");
		String cad1=scanner.nextLine();
		
		
		System.out.println("Introduzca su primera cadena: ");
		String cad2=scanner.nextLine();
		
		System.out.println("Su texto es: "+cad1+cad2);
		
	}
}
