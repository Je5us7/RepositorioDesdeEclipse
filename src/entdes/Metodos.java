package entdes;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		
		devuelveStringsContatenados();
		
		devuelveCaracterdependiendoDelNumero(1);
	}

	static void devuelveStringsContatenados() {
		
		Scanner scanner =new Scanner(System.in);
	
			
		System.out.println("Introduzca su primera cadena: ");
		String cad1=scanner.nextLine();
		
		
		System.out.println("Introduzca su segunda cadena: ");
		String cad2=scanner.nextLine();
		
		System.out.println("Su texto es: "+cad1+cad2);
		
	}
	
	static void devuelveCaracterdependiendoDelNumero(int numero) {
		
		System.out.println((char)numero);

	}
}
