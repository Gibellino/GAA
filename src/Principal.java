import java.util.Scanner;

import dia021116.Ciclos;
import dia021116.Condicionais;
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
		
		System.out.println("    \n\tMenu:\n "
				+ "1 - Balanco;\n "
				+ "2 - Input & Output;\n "
				+ "3 - Calculadora;\n "
				+ "4 - Jogo da Adivinha;\n "
				+ "5 - Condicionais;\n "
				+ "6 - Ciclos;\n "
				+ "0 - Sair;\n\n"
				+ "Insira a opção que deseja: ");
		
		op = input.nextInt();
		
		switch(op){
		
		case 1: System.out.println("\n"); new ExercicioBalanco(); break;
		
		case 2: System.out.println("\n"); new InOutputBasico();; break;
		
		case 3: System.out.println("\n"); new CalculadoraBasica(); break;
		
		case 4: System.out.println("\n"); new Adivinha(); break;
		
		case 5: System.out.println("\n"); new Condicionais(); break;
		
		case 6: System.out.println("\n"); new Ciclos(); break;
		
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
