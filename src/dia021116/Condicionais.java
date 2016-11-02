package dia021116;

import java.util.Scanner;

public class Condicionais {

	Scanner input = new Scanner(System.in);
	
	public Condicionais() {
		// TODO Auto-generated constructor stub
		
		int op;
		
		
		do{
		
			System.out.println("\tMenu:\n "
					+ "1 - Comparador Simples;\n "
					+ "2 - Comparador Multivariável;\n "
					+ "0 - Sair;\n\n"
					+ "Insira a opção que deseja: ");
			
			op = input.nextInt();
			
			switch(op){
			
				case 1: //Comparador Simples
						compSimples(); break;
				
				case 2: // Comparador MultiVariavel
						compMultiVar(); break;
				
				case 0: System.out.println("\nVai Sair!!\n"); break;
				
				default: System.out.println("\nOpção Inválida\n");
			
			}
		
		}
		
		while(op != 0);	
		
	
		
	}
	
	public void compSimples(){
		
		int num1 = 4, num2 = 3;
		
		
		/*
		 *	= -> Atribuição
		 *	Comparação (true/False)
		 *	== -> igual
		 *	< -> menor
		 *	> -> maior
		 *	!= -> diferente
		*/
		
		if (num1 == num2){
			System.out.println("\nOs números são iguais!\n");
		}
		else if (num1 < num2){
			System.out.printf("\nO número 1 (" + num1 + ") é menor que o número 2 (" + num2 + ") !\n");
		}
		else{
			System.out.println("\nO número 1 é maior que o número 2!\n");
		}
		
	}
	
	public void compMultiVar(){
		
		int num1 = 5, num2 = 7, num3 = 3, num4 = 8;
		
		/*
		 *  &	-> Concatenador
		 *  &&	-> Comparador (e)
		 *  ||	-> Comparador (ou)
		 *  !	-> Comutador de sinal/negação (V p/ F ou vice-versa)
		 *  ()	-> Agrupam condições de verdade
		*/
		
		if(num1 > num2 && num1 > num3 && num1 > num4){
			System.out.println("\n O numero 1 (" + num1 + ") é o maior!\n");	
		}
		else if(num2 > num1 && num2 > num3 && num2 > num4){
			System.out.println("\n O numero 2 (" + num2 + ") é o maior!\n");
		}
		else if(num3 > num1 && num3 > num2 && num3 > num4){
			System.out.println("\n O numero 3 (" + num3 + ") é o maior!\n");
		}
		else{
			System.out.println("\n O numero 4 (" + num4 + ") é o maior!\n");
		}
		
	}
}
