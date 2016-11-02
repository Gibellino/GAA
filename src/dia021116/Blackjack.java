package dia021116;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	Random r = new Random();
	Scanner input = new Scanner(System.in);
	
	int n1;
	final int MAX = 12;
	
	public Blackjack() {
		// TODO Auto-generated constructor stub
		
		int[] player = new int[10];
		int[] dealer = new int[10];
		int cartap = 0;
		int cartad = 0;
		int op;
		
		//int[] cartas = new int[]{1,2,3,4,5,6,7,8,9,10,10,10,10};
		
		System.out.println("Bem vindo ao Blackjack!\n");
		
		for(int i=0; i<2;i++){
			int c = receber();
			player[i] = c;
			int c2 = receber();
			dealer[i] = c2;
		}
		
		System.out.printf("Suas cartas: ");
		
		for(int i=0;i<2;i++){
			if(i < 1){
				if(player[i] == 1){
					cartap = 1;
					System.out.printf("A,");
				}
				else if(player[i] == 10){
					cartap = 10;
					System.out.printf("J,");
				}
				else if(player[i] == 11){
					cartap = 10;
					System.out.printf("Q,");
				}
				else if(player[i] == 12){
					cartap = 10;
					System.out.printf("K,");
				}
				else{
					cartap = player[i];
					System.out.print(player[i] + ",");
				}
			}else{
				if(player[i] == 1){
					cartap = cartap + 1;
					System.out.printf("A (Total: " + cartap + ")\n");
				}
				else if(player[i] == 10){
					cartap = cartap + 10;
					System.out.printf("J (Total: " + cartap + ")\n");
				}
				else if(player[i] == 11){
					cartap = cartap + 10;
					System.out.printf("Q (Total: " + cartap + ")\n");
				}
				else if(player[i] == 12){
					cartap = cartap + 10;
					System.out.printf("K (Total: " + cartap + ")\n");
				}
				else{
					cartap = cartap + player[i];
					System.out.print(player[i] + " (Total: " + cartap + ")\n");
				}
			}
		}
		
		System.out.printf("\nCartas do dealer: ");
		
		for(int i=0;i<2;i++){
			if(i < 1){
				if(dealer[i] == 1){
					cartad = 1;
					System.out.printf("A,");
				}
				else if(dealer[i] == 10){
					cartad = 10;
					System.out.printf("J,");
				}
				else if(dealer[i] == 11){
					cartad = 10;
					System.out.printf("Q,");
				}
				else if(dealer[i] == 12){
					cartad = 10;
					System.out.printf("K,");
				}
				else{
					cartad = dealer[i];
					System.out.print(dealer[i] + ",");
				}
			}else{
				if(dealer[i] == 1){
					cartad = cartad + 1;
					System.out.printf("A (Total: " + cartad + ")\n");
				}
				else if(dealer[i] == 10){
					cartad = cartad + 10;
					System.out.printf("J (Total: " + cartad + ")\n");
				}
				else if(dealer[i] == 11){
					cartad = cartad + 10;
					System.out.printf("Q (Total: " + cartad + ")\n");;
				}
				else if(dealer[i] == 12){
					cartad = cartad + 10;
					System.out.printf("K (Total: " + cartad + ")\n");
				}
				else{
					cartad = cartad + dealer[i];
					System.out.print(dealer[i] + " (Total: " + cartad + ")\n");
				}
			}
		}
		
		System.out.println("\n Deseja mais uma carta? 1-Sim 0-Não");
		op = input.nextInt();
		
		if(op == 1){
			for(int i=0;i<10;i++){
				int c = receber();
				if(player[i] == 0){
					player[i] = c;
					i=10;
				}
				int c2 = receber();
				if(dealer[i] == 0){
					dealer[i] = c2;
					i=10;
				}
			}
		}
		
		for(int i=0;i<10;i++){
			if(player[i] != 0){
				System.out.print(player[i] + " ");
			}
		}
	}
	
	public int receber(){
		
		return r.nextInt(13-1) + 1;
		
	}

}
