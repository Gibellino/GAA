import java.util.Scanner;

public class ExercicioBalanco {
	
	Scanner read = new Scanner(System.in);
	
		int agua = 80,
			luz = 60,
			tlm = 70,
			despesas,
			quotas,
			recBaile,
			recBar,
			receitas;
			
	public ExercicioBalanco() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Olá, Turma.");
		
		//Calculo Receitas
		
		calcularReceitas();
		
		//Calculo Despesas
		
		calcularDespesas();
		
		//Calculo Balanco
		
		int balanco = receitas + despesas;
		
		System.out.println("\nReceita : \n\n "
				+ " Quotas: " + quotas 
				+ " €\n  Baile: " + recBaile 
				+ " €\n  Bar: " + recBar 
				+ " €\n\n  Total Receitas: " + receitas
				+ " €;\n\nDespesas : \n\n"
				+ "  agua: " + agua
				+ " €\n  luz: " + luz
				+ " €\n  telemovel: " + tlm
				+ " €\n\n  Total Despesas: " + despesas 
				+ " €\n\nBalanço: " + balanco
				+ " €");
		
		if((receitas-despesas) < 0){
			System.out.println("\nBalanço negativo");
		}
		else{
			System.out.println("\nBalanço positivo");
		}
	}

	public void calcularReceitas(){
		
		System.out.println("Receitas:\n");
		
		System.out.println("Quotas: ");
		quotas = read.nextInt();
		
		System.out.println("\nBaile: ");
		recBaile = read.nextInt();
		
		System.out.println("\nBar: ");
		recBar = read.nextInt();
		
		receitas = quotas + recBaile + recBar;
		
	}
	
	public void calcularDespesas(){
		
		System.out.println("Despesas:\n");
		
		System.out.println("Agua: ");
		agua = read.nextInt();
		
		System.out.println("\nLuz: ");
		luz = read.nextInt();
		
		System.out.println("\nTelemovel: ");
		tlm = read.nextInt();
		
		despesas = agua + luz + tlm;
		
	}
}
