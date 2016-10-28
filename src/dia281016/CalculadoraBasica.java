package dia281016;

import java.util.Scanner;

public class CalculadoraBasica {
	
	Scanner input = new Scanner(System.in);
	
	public CalculadoraBasica() {
		// TODO Auto-generated constructor stub
		
		int op;
		
		do{
		
			System.out.println("    Menu:\n "
					+ "1 - Adi��o;\n "
					+ "2 - Subtra��o;\n "
					+ "3 - Multiplica��o;\n "
					+ "4 - Divis�o;\n "
					+ "0 - Sair;\n\n"
					+ "Insira a op��o que deseja: ");
			
			op = input.nextInt();
			
			switch(op){
			
				case 1: soma(); break;
				
				case 2: subtracao(); break;
				
				case 3: multi(); break;
				
				case 4: divi(); break;
				
				case 0: System.out.println("\nVai Sair!!\n"); break;
				
				default: System.out.println("\nOp��o Inv�lida\n");
			
			}
		
		}
		
		while(op != 0);	
		
	}
	
	public void soma(){
		
		System.out.println("\nInsira um n�mero para somar: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro n�mero para somar: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA soma de " + n1 + " com " + n2 + " � igual a " + (n1+n2) + "!\n");
	}
	
	public void subtracao(){
		
		System.out.println("\nInsira um n�mero para subtrair: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro n�mero para subtrair: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA subtra��o de " + n1 + " com " + n2 + " � igual a " + (n1-n2) + "!\n");
	}
	
	public void multi(){
		
		System.out.println("\nInsira um n�mero para multiplica��o: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro n�mero para multiplica��o: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA multiplica��o de " + n1 + " com " + n2 + " � igual a " + (n1*n2) + "!\n");
	}
	
	public void divi(){
		
		System.out.println("\nInsira um n�mero para dividir: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro n�mero para dividir: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA dividir de " + n1 + " com " + n2 + " � igual a " + (n1/n2) + "!\n");
	}
}
