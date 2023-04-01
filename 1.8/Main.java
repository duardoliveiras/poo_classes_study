
public class Main {
	
	public static void main(String args[]) {
			
			int[][] grafo = new int[5][5];
			Grafo g = new Grafo();
			
			g.criarGrafo(grafo);
		 	g.desenhar(grafo);
		
		grafo = g.definir(grafo,1,2);
		grafo = g.definir(grafo,1,5);
		grafo = g.definir(grafo,2,1);
		grafo = g.definir(grafo,2,5);
		grafo = g.definir(grafo,2,4);
		grafo = g.definir(grafo,2,3);
		grafo = g.definir(grafo,3,4);
		grafo = g.definir(grafo,3,2);
		grafo = g.definir(grafo,4,2);
		grafo = g.definir(grafo,4,3);
		grafo = g.definir(grafo,4,5);
		grafo = g.definir(grafo,5,1);
		grafo = g.definir(grafo,5,4);
		grafo = g.definir(grafo,5,2);
		
			g.desenhar(grafo);
		g.verificarVizinho(grafo,1,4);
		g.verificarVizinho(grafo,1,5);
		
		g.mostrarVizinho(grafo,1);
		g.mostrarVizinho(grafo,2);
			
		
			
		}
}
