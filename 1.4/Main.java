
public class Main {

	public static void main(String[] args) {
			
		Complex num1 = new Complex(2,-3);
		Complex num2 = new Complex(1,-4);
		Complex operacoes = new Complex();
		
		operacoes.compara(num1, num2);
		System.out.println(num1.toString());
		System.out.println(num2.toString());
		System.out.println("");
		
		
		System.out.println("Modulo do numero 1: "+num1.modulo());
		System.out.println("Parte real do numero 1: "+num1.devolveReal());
		System.out.println("Parte imaginaria do numero 1: "+num1.devolveImaginario());
		System.out.println("Angulo do numero 1: "+num1.angulo());
		System.out.println("Inverso do numero 1: "+num1.inverso());
		System.out.println("");
		System.out.println("Modulo do numero 2: "+num2.modulo());
		System.out.println("Parte real do numero 2: "+num2.devolveReal());
		System.out.println("Parte imaginaria do numero 2: "+num2.devolveImaginario());
		System.out.println("Angulo do numero 2: "+num2.angulo());
		System.out.println("Inverso do numero 2: "+num2.inverso());
		System.out.println("");
		
		operacoes = operacoes.soma(num1, num2);
		System.out.println("Soma num1 + num2: "+operacoes.toString());
		
		operacoes = operacoes.subtracao(num1, num2);
		System.out.println("Subtracao num1 - num2: "+operacoes.toString());
		
		operacoes = operacoes.multiplica(num1, num2);
		System.out.println("Multiplicacao num1 * num2: "+operacoes.toString());
		
		operacoes = operacoes.divide(num1, num2);
		System.out.print("Divisao num1 / num2: ");
		System.out.print(operacoes.devolveReal());
		System.out.print(operacoes.devolveImaginario());
		System.out.print("/"+operacoes.denominador);
		
		
		
	}

}
