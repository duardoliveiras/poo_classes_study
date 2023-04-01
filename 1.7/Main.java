
public class Main {

	public static void main(String args[]) {
		IntegerSet in1 = new IntegerSet();
		IntegerSet in2 = new IntegerSet();
		IntegerSet in3 = new IntegerSet();
		
		
		in1.inserir(22);
		in1.inserir(23);
		in1.inserir(24);
		
		in3.inserir(24);
		in3.inserir(22);
		in3.inserir(23);
		
		System.out.println("in1 = ["+in1.toSetString()+"]");
		in2.inserir(35);
		in2.inserir(22);
		in2.inserir(20);
		in2.inserir(24);
		System.out.println("in2 = ["+in2.toSetString()+"]");
		System.out.println("in1 e igual a in2? "+in1.isEqualsTo(in2));
		System.out.println("intersecção entre in1 e in2= [" + in1.interseccao(in2).toSetString()+"]");
		System.out.println("união entre in1 e in2= [" + in1.uniao(in2).toSetString()+"]");
		System.out.println("in3 = ["+in3.toSetString()+"]");
		System.out.println("in1 e igual a in3? "+in1.isEqualsTo(in3));
		in3.retirar(22);
		System.out.println("in3 = ["+in3.toSetString()+"]");
		System.out.println("in1 e igual a in3? "+in1.isEqualsTo(in3));
		
		System.out.println("sub entre in2 e in1 = ["+in2.sub(in1).toSetString()+"]");
		
		
		
	}
	
	
}
