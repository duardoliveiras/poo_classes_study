
public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Data:");
		Data calendario = new Data(5,2,2008);
		System.out.println(calendario.toString());
		calendario.nextDay();
		System.out.println("Proximo dia:");
		System.out.println(calendario.toString());
		System.out.println("");
		
		System.out.println("Data atual do sistema:");
		Data calendario2 = new Data();
		System.out.println(calendario2.toString());
		calendario2.nextDay();
		System.out.println("Proximo dia:");
		System.out.println(calendario2.toString());
		System.out.println("");
		
		System.out.println("Data:");
		Data calendario3 = new Data(28,2,2004);
		System.out.println(calendario3.toString());
		calendario3.nextDay();
		System.out.println("Proximo dia:");
		System.out.println(calendario3.toString());
		System.out.println("");
		
		System.out.println("Data:");
		Data calendario4 = new Data(29,2,2010);
		System.out.println(calendario4.toString());
		calendario4.nextDay();
		System.out.println("Proximo dia:");
		System.out.println(calendario4.toString());
		System.out.println("");
		
		System.out.println("Data:");
		Data calendario5 = new Data(31,06,2021);
		System.out.println(calendario5.toString());
		calendario5.nextDay();
		System.out.println("Proximo dia:");
		System.out.println(calendario5.toString());
		System.out.println("");
		
		System.out.println("Data:");
		Data calendario6 = new Data(31,12,2010);
		System.out.println(calendario6.toString());
		calendario6.nextDay();
		System.out.println("Proximo dia:");
		System.out.println(calendario6.toString());
		
		
		
	}
	
}
