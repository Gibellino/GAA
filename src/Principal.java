import java.util.Scanner;

import dia281016.Adivinha;
import dia281016.CalculadoraBasica;
import dia281016.InOutputBasico;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int op, op2=0;
		
		do{
		
		System.out.println("    \nMenu:\n "
				+ "1 - Balanco;\n "
				+ "2 - Input & Output;\n "
				+ "3 - Calculadora;\n "
				+ "4 - Jogo da Adivinha;\n "
				+ "0 - Sair;\n\n"
				+ "Insira a opção que deseja: ");
		
		op = input.nextInt();
		
		switch(op){
		
		case 1: new ExercicioBalanco(); break;
		
		case 2: new InOutputBasico();; break;
		
		case 3: new CalculadoraBasica(); break;
		
		case 4: new Adivinha(); break;
		
		case 0: System.out.println("\nVai Sair!!\n"); break;
		
		default: System.out.println("\nOpção Inválida\n");
		
		}
		
		if(op != 0){
			System.out.println("\nQuer continuar? (0 - Não)\n");
			op2 = input.nextInt();
		}
		
		}
		
		while(op2 != 0);
	}

}
