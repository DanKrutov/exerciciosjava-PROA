package exercicios;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int num=scan.nextInt();
		
		System.out.println("O valor sucessor � o n�mero: "+(num+1));
	}
}
