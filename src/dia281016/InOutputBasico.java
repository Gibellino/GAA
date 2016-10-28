package dia281016;

import java.util.Scanner;

public class InOutputBasico {

	public InOutputBasico() {
		// TODO Auto-generated constructor stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Como te chamas?");
		
		String name = input.nextLine();
		
		System.out.println("\nComo tens passado " + name + "?");
		
	}

}
