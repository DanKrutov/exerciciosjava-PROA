package exercicios;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int num=scan.nextInt();
		
		System.out.println("O valor sucessor é o número: "+(num+1));
	}
}
