package dia281016;

import java.util.Scanner;

public class CalculadoraBasica {

	public CalculadoraBasica() {
		// TODO Auto-generated constructor stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um n�mero para somar: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro n�mero para somar: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA soma de " + n1 + " com " + n2 + " � igual a " + (n1+n2) + "!");
	}

}
