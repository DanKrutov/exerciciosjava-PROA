package exercicios;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo: ");
		
		int base=scan.nextInt();
		
		System.out.println("Digite a altura do tri�ngulo: ");
		
		int alt=scan.nextInt();
		
		System.out.println("A �rea do tri�ngulo � igual a: "+((base*alt)/2));
		
	}
}
