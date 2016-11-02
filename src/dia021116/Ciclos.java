package dia021116;

import java.util.Scanner;

public class Ciclos {

	Scanner input = new Scanner(System.in);
	
	public Ciclos() {
		// TODO Auto-generated constructor stub
		
		int op;
		
		do{
			
			System.out.println("\tMenu:\n "
					+ "1 - While;\n "
					+ "2 - Do while;\n "
					+ "3 - dePara;\n "
					+ "0 - Sair;\n\n"
					+ "Insira a opção que deseja: ");
			
			op = input.nextInt();
			
			System.out.println("\n");
			
			switch(op){
			
				case 1: enquanto(); break;
				
				case 2: fazerEnquanto(); break;
				
				case 3: dePara(); break;
				
				case 0: System.out.println("\nVai Sair!!\n"); break;
				
				default: System.out.println("\nOpção Inválida\n");
			
			}
			
			System.out.println("\n");
		
		}
		
		while(op != 0);	
		
	}
	
	public void enquanto() {
		
		int i = 0;
		String msg = "All you need is love!";
		
		while(i < 3){
			System.out.println(msg);
			i++;
		}
	}

	public void fazerEnquanto() {
		
		int i = 5;
		String msg = "All you need is love!";
		
		do{
			System.out.println(msg);
			i++;
		}
		while(i <= 4);
		
	}
	
	public void dePara(){
		
		String msg = "All you need is love!";
		
		/*
		 * for
		 * int i=0; -> inicializa a variavel de controlo
		 * i < 4; -> testa a variável de controlo
		 * i++; -> executa acção
		*/
		
		for(int i=0; i<4; i++){
			System.out.println(msg);
		}
		
	}
}
