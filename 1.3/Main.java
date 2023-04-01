
public class Main {

	public static void main(String[] args) {
		
		Empregado eduardo = new Empregado("eduardo", "oliveira", 1599.00f);
		System.out.println(eduardo.toString());
		
		
		Empregado naiara = new Empregado("naiara", "costa", -1355.00f);
		System.out.println("\n"+naiara.toString());
		
		naiara.setWage(1699.99f);	
		System.out.println("\nCorrecao. Salario mensal da "+naiara.getFirstName()+": "+naiara.getWage());
		
		System.out.println("");
		System.out.println("Salario anual do "+eduardo.getFirstName()+": "+eduardo.annualWage(eduardo.getWage()));
		System.out.println("Salario anual do "+naiara.getFirstName()+": "+naiara.annualWage(naiara.getWage()));
		
		eduardo.increase(eduardo.getWage(), 10f);
		naiara.increase(naiara.getWage(), 10f);
		
		System.out.println("\nAumento de 10%:");
		System.out.println("Salario anual do "+eduardo.getFirstName()+": "+eduardo.annualWage(eduardo.getWage()));
		System.out.println("Salario anual do "+naiara.getFirstName()+": "+naiara.annualWage(naiara.getWage()));
	}

}
