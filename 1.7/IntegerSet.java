
public class IntegerSet {
	
	private int tam = 101;
	private boolean vetor[];
	
	public IntegerSet() {
		
		this.vetor = new boolean[tam];
	}
	private IntegerSet(boolean valores[]) {
		this.vetor = valores;
	}
	
	public void inserir(int p) {
		this.vetor[p] = true;
	}
	public void retirar(int p) {
		this.vetor[p] = false;
	}
	
	
	
	public IntegerSet interseccao(IntegerSet in) {
		boolean intersect[] = new boolean[tam];
		for(int i = 0; i<tam;i++) {
			intersect[i] = this.vetor[i] && in.vetor[i];
		}
		return new IntegerSet(intersect);
	}
	
	public IntegerSet uniao(IntegerSet in) {
		boolean un[] = new boolean[tam];
		for(int i=0; i<tam;i++) {
			un[i] = this.vetor[i] || in.vetor[i];
		}
		return new IntegerSet(un);
	}
	public IntegerSet sub(IntegerSet in) {
		boolean sub[] = new boolean[tam];
		for(int i=0; i<tam;i++) {
			sub[i] = this.vetor[i] && !in.vetor[i];
		}
		return new IntegerSet(sub);
	}
	
	
	
	public String toSetString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<tam;i++) {
			if(this.vetor[i]) {
				if(sb.length()==0) {
					sb.append(i);
				}else {
					sb.append(" ").append(i);
				}
			}
		}
		return sb.length() == 0 ? "--" : sb.toString();
		
		}
	
	public boolean isEqualsTo(IntegerSet in) {
		for(int i=0; i<tam;i++) {
			if(this.vetor[i] != in.vetor[i]) {
				return false;
			}
			
		}return true;
	}
	
	

	
}
