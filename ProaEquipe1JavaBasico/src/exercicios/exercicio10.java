package exercicios;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo: ");
		
		int base=scan.nextInt();
		
		System.out.println("Digite a altura do triângulo: ");
		
		int alt=scan.nextInt();
		
		System.out.println("A Área do triângulo é igual a: "+((base*alt)/2));
		
	}
}
