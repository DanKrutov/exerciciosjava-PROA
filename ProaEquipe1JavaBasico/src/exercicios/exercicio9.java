package exercicios;
import java.util.Scanner;

public class exercicio9 {

		public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base do paralelogramo: ");
		
		int base=scan.nextInt();
		
		System.out.println("Digite a altura do paralelogramo: ");
		
		int alt=scan.nextInt();
		
		System.out.println("A Área do parelelogramo é igual a: "+(base*alt));
		
		}
}
