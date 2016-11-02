package dia021116;

import java.util.Scanner;

public class CalculadoraInfinita2 {
	
	int num1, num2;
	Scanner input = new Scanner(System.in);
	
	public CalculadoraInfinita2() {
		// TODO Auto-generated constructor stub
		
		int op;
		
		System.out.println("\nIntroduza um número: ");
		num1 = input.nextInt();
		
		do{
		
			System.out.println("\nIntroduza um número (Se for igual a 0, sai): ");
			num2 = input.nextInt();
			
			if(num2 != 0){
				
				System.out.println("\n\tMenu:\n "
						+ "1 - Soma;\n "
						+ "2 - Subtração;\n "
						+ "3 - Multiplicação;\n "
						+ "4 - Divisão;\n "
						+ "5 - Calcular Anterior;\n "
						+ "0 - Sair\n\n");
			
				System.out.println("Introduza a opção que deseja! ");
				op = input.nextInt();
			
				System.out.println("\n");
				
				switch(op){
				
				case 1: 
					num1 = soma(num1,num2);
					System.out.println(num1);
				break;
				
				case 2: 
					num1 = menos(num1,num2);
					System.out.println(num1);
				break;
				
				case 3: 
					num1 = multi(num1,num2);
					System.out.println(num1);
				break;
				
				case 4: 
					num1 = divi(num1,num2);
					System.out.println(num1);
				break;
				
				case 0: System.out.println("\nVai Sair!!\n"); break;
				
				default: System.out.println("\nOpção Inválida!!\n");
			
				}
			}
			else{
				System.out.println("\nVai Sair!!\n");
			}
		}
		while(num2 != 0);
	}
	
	public int soma(int num1, int num2){
		return (num1+num2);
	}
	
	public int menos(int num1, int num2){
		return (num1-num2);
	}
	
	public int multi(int num1, int num2){
		return (num1*num2);
	}
	
	public int divi(int num1, int num2){
		return (num1/num2);
	}
}
