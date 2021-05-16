package day6Exercise;

public class Main {

	public static void main(String[] args) {
		
		Account hagosGebru = new Account("Hagos,", "Gebru", 5000.00);
		Account jamesBond = new Account("James,", "Bond", 3000.00);
		
		
	
		
		System.out.println(hagosGebru);
		hagosGebru.debit(3000);
		hagosGebru.credit(1000);
		System.out.println();
		
		
		System.out.println(jamesBond);
		jamesBond.debit(4000);
		
		


	}

}
