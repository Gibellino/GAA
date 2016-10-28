package dia281016;

import java.util.Scanner;

public class CalculadoraBasica {
	
	Scanner input = new Scanner(System.in);
	
	public CalculadoraBasica() {
		// TODO Auto-generated constructor stub
		
		int op;
		
		do{
		
			System.out.println("    Menu:\n "
					+ "1 - Adição;\n "
					+ "2 - Subtração;\n "
					+ "3 - Multiplicação;\n "
					+ "4 - Divisão;\n "
					+ "0 - Sair;\n\n"
					+ "Insira a opção que deseja: ");
			
			op = input.nextInt();
			
			switch(op){
			
				case 1: soma(); break;
				
				case 2: subtracao(); break;
				
				case 3: multi(); break;
				
				case 4: divi(); break;
				
				case 0: System.out.println("\nVai Sair!!\n"); break;
				
				default: System.out.println("\nOpção Inválida\n");
			
			}
		
		}
		
		while(op != 0);	
		
	}
	
	public void soma(){
		
		System.out.println("\nInsira um número para somar: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro número para somar: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA soma de " + n1 + " com " + n2 + " é igual a " + (n1+n2) + "!\n");
	}
	
	public void subtracao(){
		
		System.out.println("\nInsira um número para subtrair: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro número para subtrair: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA subtração de " + n1 + " com " + n2 + " é igual a " + (n1-n2) + "!\n");
	}
	
	public void multi(){
		
		System.out.println("\nInsira um número para multiplicação: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro número para multiplicação: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA multiplicação de " + n1 + " com " + n2 + " é igual a " + (n1*n2) + "!\n");
	}
	
	public void divi(){
		
		System.out.println("\nInsira um número para dividir: ");
		
		int n1 = input.nextInt();
		
		System.out.println("Insira outro número para dividir: ");
		
		int n2 = input.nextInt();
		
		System.out.println("\nA dividir de " + n1 + " com " + n2 + " é igual a " + (n1/n2) + "!\n");
	}
}
