
public class Grafo {
	
	
	public int[][] definir(int[][] grafo,int vertice,int vizinho){
		grafo[vertice-1][vizinho-1] = 1;
		return grafo;
	}
	
	public void desenhar(int[][] grafo) {
		System.out.println("   1 2 3 4 5");
		for(int i=0; i<5;i++) {
		System.out.print(i+1+"- ");
			for(int j=0;j<5;j++) {
				System.out.print(grafo[i][j]+" ");
			}System.out.println("");
		}
		System.out.println("");
	}
	
	public void verificarVizinho(int[][] grafo, int vertice1,int vertice2) {
		if(grafo[vertice1-1][vertice2-1] == 1) {
			System.out.printf("o vertice %d é vizinho do vertice %d",vertice1,vertice2);
		}else {
			System.out.println("nao sao vizinhos");
		}
	}
	
	public void mostrarVizinho(int[][] grafo, int vertice) {
		System.out.print("\nVertices vizinhos: ");
		for(int i=0;i<5;i++) {
			if(grafo[vertice-1][i] == 1) {
				System.out.print(i+1+" ");
			
			}
		}
	}
	public void criarGrafo(int[][] grafo) {
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				grafo[i][j] = 0;
			}
		}
	}


	
	
	
	
}
