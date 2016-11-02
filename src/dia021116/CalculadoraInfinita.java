package dia021116;

import java.util.Scanner;

public class CalculadoraInfinita {
	
	int num1, num2;
	Scanner input = new Scanner(System.in);
	
	public CalculadoraInfinita() {
		// TODO Auto-generated constructor stub
		
		int op = 0;
		
		System.out.println("\nIntroduza um número: ");
		num1 = input.nextInt();
		
		System.out.println("\nIntroduza outro número (Se for igual a 0, sai): ");
		num2 = input.nextInt();
		
		System.out.println("\n\tMenu:\n "
				+ "1 - Soma;\n "
				+ "2 - Subtração;\n "
				+ "3 - Multiplicação;\n "
				+ "4 - Divisão;\n "
				+ "0 - Sair\n\n");
		
		if(num2 != 0){
			System.out.println("Introduza a opção que deseja! ");
			op = input.nextInt();
		
			switch(op){
				
			case 1: soma(num1,num2); break;
			
			case 2: menos(num1,num2); break;
			
			case 3: multi(num1,num2); break;
			
			case 4: divi(num1,num2); break;
			
			case 0: System.out.println("\nVai Sair!!\n"); break;
			
			default: System.out.println("\nOpção Inválida!!\n");
		
			}
		}else{
			System.out.println("\nVai Sair!!\n");
		}
	
	}

	public void soma(int num1, int num2){
		for(int i = 0; i<3; System.out.println((num1+num2)));
	}
	
	public void menos(int num1, int num2){
		for(int i = 0; i<3; System.out.println((num1-num2)));
	}
	
	public void multi(int num1, int num2){
		for(int i = 0; i<3; System.out.println((num1*num2)));
	}
	
	public void divi(int num1, int num2){
		for(int i = 0; i<3; System.out.println((num1/num2)));
	}
}
