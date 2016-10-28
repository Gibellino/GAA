package dia281016;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {

	int n1, n2, op;
    int max = 5;
	
	Random r = new Random();
	Scanner input = new Scanner(System.in);
	
	public Adivinha() {
		// TODO Auto-generated constructor stu
		
	
		do{
			
			numeroR();
			
			System.out.println("\nAdivinha!\n\nEscolha um número de 0 a " + max + " (3 tentativas): ");
			
			tentar();
			
			System.out.println("\nVoltar a jogar? (1-Sim  0-Não)");
			op = input.nextInt();
			
		}
		
		while(op != 0);
		
		System.out.println("\n");
		
	}
	
	public void tentar(){
		
		for(int i=0;i<=2;i++){
			
			n2 = input.nextInt();
			
			if(n2 >= 0 && n2 <= max){
				if(n1 == n2){
					System.out.println("Parabens! Acetaste à " + (i+1) + "º tentativa.");
					i = 2;
				}
				else if(i<2){
					System.out.println("Número errado. Volta a tentar (" + (i+1) + " tentativas):");
				}
				else{
					System.out.println("Não acertas-te em nunhuma tentativa. O número era " + n1);
				}
			}
			else{
				System.out.println("\nO número introduzido não é válido! Por favor, escolhe um número de 0 a " + max + "!\n");
			}
		}
	}
	
	public void numeroR(){
		
		System.out.println("\nEscolhe um número máximo(O número por default é 5):");
		
		max = input.nextInt();
		
		n1 = r.nextInt(max);
		
	}

}
