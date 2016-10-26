
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá, Turma.");
		
		int quotas = 300,
			recBaile = 200,
			recBar = 250;
						
		int receitas = quotas + recBaile + recBar;
		
		int agua = 80,
			luz = 60,
			tlm = 70;
		
		int despesas = agua + luz + tlm;
		
		System.out.println("\nReceita : \n\n "
				+ " Quotas: " + quotas 
				+ " €\n  Baile: " + recBaile 
				+ " €\n  Bar: " + recBar 
				+ " €\n\n  Total Receitas: " + receitas
				+ " €;\n\nDespesas : \n\n"
				+ "  agua: " + agua
				+ " €\n  luz:" + luz
				+ " €\n  telemovel:" + tlm
				+ " €\n\n  Total Despesas: " + despesas 
				+ " €\n\nBalanço: " + (receitas-despesas)
				+ " €");
		
		if((receitas-despesas) < 0){
			System.out.println("\n\nBalanço negativo");
		}
		else{
			System.out.println("\n\nBalanço positivo");
		}
	}

}
