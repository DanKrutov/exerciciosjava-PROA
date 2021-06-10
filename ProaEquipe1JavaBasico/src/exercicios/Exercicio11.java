package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		
		int num1=scan.nextInt();
		
		System.out.println("Digite a altura: ");
		
		int num2=scan.nextInt();
		
		System.out.println("O valor da área do quadrado é: "+(num1*num2));
		
	}
	
}
