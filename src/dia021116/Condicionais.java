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
					+ "2 - Comparador Multivari�vel;\n "
					+ "0 - Sair;\n\n"
					+ "Insira a op��o que deseja: ");
			
			op = input.nextInt();
			
			switch(op){
			
				case 1: //Comparador Simples
						compSimples(); break;
				
				case 2: // Comparador MultiVariavel
						compMultiVar(); break;
				
				case 0: System.out.println("\nVai Sair!!\n"); break;
				
				default: System.out.println("\nOp��o Inv�lida\n");
			
			}
		
		}
		
		while(op != 0);	
		
	
		
	}
	
	public void compSimples(){
		
		int num1 = 4, num2 = 3;
		
		
		/*
		 *	= -> Atribui��o
		 *	Compara��o (true/False)
		 *	== -> igual
		 *	< -> menor
		 *	> -> maior
		 *	!= -> diferente
		*/
		
		if (num1 == num2){
			System.out.println("\nOs n�meros s�o iguais!\n");
		}
		else if (num1 < num2){
			System.out.printf("\nO n�mero 1 (" + num1 + ") � menor que o n�mero 2 (" + num2 + ") !\n");
		}
		else{
			System.out.println("\nO n�mero 1 � maior que o n�mero 2!\n");
		}
		
	}
	
	public void compMultiVar(){
		
		int num1 = 5, num2 = 7, num3 = 3, num4 = 8;
		
		/*
		 *  &	-> Concatenador
		 *  &&	-> Comparador (e)
		 *  ||	-> Comparador (ou)
		 *  !	-> Comutador de sinal/nega��o (V p/ F ou vice-versa)
		 *  ()	-> Agrupam condi��es de verdade
		*/
		
		if(num1 > num2 && num1 > num3 && num1 > num4){
			System.out.println("\n O numero 1 (" + num1 + ") � o maior!\n");	
		}
		else if(num2 > num1 && num2 > num3 && num2 > num4){
			System.out.println("\n O numero 2 (" + num2 + ") � o maior!\n");
		}
		else if(num3 > num1 && num3 > num2 && num3 > num4){
			System.out.println("\n O numero 3 (" + num3 + ") � o maior!\n");
		}
		else{
			System.out.println("\n O numero 4 (" + num4 + ") � o maior!\n");
		}
		
	}
}
