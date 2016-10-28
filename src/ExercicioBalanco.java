import java.util.Scanner;

public class ExercicioBalanco {
	
	Scanner read = new Scanner(System.in);
	
	int agua, luz, tlm, despesas, quotas, recBaile, recBar, receitas, balanco;
			
	public ExercicioBalanco() {
		// TODO Auto-generated constructor stub
		
		//Calculo Receitas
		receitas();
		
		//Calculo Despesas
		despesas();
		
		//Calculo Balanco
		balanco();
		
		System.out.println("\nReceita :\n\n "
				+ " Quotas: " + quotas 
				+ " €\n  Baile: " + recBaile 
				+ " €\n  Bar: " + recBar 
				+ " €\n\n  Total Receitas: " + receitas
				+ " €\n\nDespesas : \n\n"
				+ "  agua: " + agua
				+ " €\n  luz: " + luz
				+ " €\n  telemovel: " + tlm
				+ " €\n\n  Total Despesas: " + despesas 
				+ " €\n\nBalanço: " + balanco
				+ " €");
		
		//Verificar se balanço é positivo ou não
		cbalanco();
			
	}

	public void receitas(){
		
		System.out.println("\nReceitas:\n");
		
		System.out.println("Quanto obteve de quotas: ");
		quotas = read.nextInt();
		
		System.out.println("\nQuanto obteve no baile: ");
		recBaile = read.nextInt();
		
		System.out.println("\nQuanto obteve no bar: ");
		recBar = read.nextInt();
		
		receitas = quotas + recBaile + recBar;
		
	}
	
	public void despesas(){
		
		System.out.println("\n\nDespesas:\n");
		
		System.out.println("Quanto gastou em agua: ");
		agua = read.nextInt();
		
		System.out.println("\nQuanto gastou em luz: ");
		luz = read.nextInt();
		
		System.out.println("\nQuanto gastou em telemovel: ");
		tlm = read.nextInt();
		
		despesas = agua + luz + tlm;
		
	}
	
	public void balanco(){
		
		balanco = receitas - despesas;
		
	}
	
	public void cbalanco(){
		
		if(balanco < 0){
			System.out.println("\nBalanço negativo");
		}
		else if(balanco > 0){
			System.out.println("\nBalanço positivo");
		}
		else{
			System.out.println("\nBalanço neutro");
		}		
		
	}
}