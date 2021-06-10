package exercicios;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		
		int raio=scan.nextInt();
		
		System.out.println("A área do círculo é de: " + 3.14*(raio*raio));
	}
}
