import java.util.Scanner;

public class JogoDaVelha {

			
			private boolean jogo= true;
			private char simboAtual = 'X'; 
			private String vitoria;
			private boolean duplicidade = false;
			
			public void desenhaJogo(Campo[][] velha) {
				this.limpar();
			
				System.out.println("   0    1    2");
				System.out.printf("0   %c | %c | %c %n",velha[0][0].getSimbo(), velha[0][1].getSimbo(), velha[0][2].getSimbo());
				System.out.println("  --------------");
				System.out.printf("1   %c | %c | %c %n",velha[1][0].getSimbo(), velha[1][1].getSimbo(), velha[1][2].getSimbo());
				System.out.println("  --------------");
				System.out.printf("2   %c | %c | %c %n",velha[2][0].getSimbo(), velha[2][1].getSimbo(), velha[2][2].getSimbo());
				if(this.duplicidade) {
					System.out.println("Posicao ocupada!\n");	
					this.duplicidade = false;
				}
			}
			
			public void iniciar(Campo velha[][]) {
				for(int i=0;i<3;i++) {
					for(int j=0; j<3; j++) {
						velha[i][j] = new Campo();
					}
					
				}
				
			}
			public int deuVelha(Campo velha[][]) {
				int v = 0;
				for(int i=0;i<3;i++) {
					for(int j=0; j<3; j++) {
						if(velha[i][j].getSimbo() != ' ') {
							v++;
						}
					}
					
				} return v;
			}
			
			public boolean fimJogo(Campo[][] velha){
				  if(velha[0][0].getSimbo() == 'X' && velha[0][0].getSimbo() == velha[1][1].getSimbo() && velha[1][1].getSimbo() == velha[2][2].getSimbo()){ 
				    System.out.println("Venceu o jogador X");
				    return true;
				  }else if(velha[0][0].getSimbo() == 'O' && velha[0][0].getSimbo() == velha[1][1].getSimbo() && velha[1][1].getSimbo() == velha[2][2].getSimbo()){ 
					System.out.println("Venceu o jogador O");
					return true;
				  }
				  if(velha[0][2].getSimbo() == 'X' && velha[0][2].getSimbo() == velha[1][1].getSimbo() && velha[1][1].getSimbo() == velha[2][0].getSimbo()){ 
					    System.out.println("Venceu o jogador X");
					    return true;
					  }else if(velha[0][2].getSimbo() == 'O' && velha[0][2].getSimbo() == velha[1][1].getSimbo() && velha[1][1].getSimbo() == velha[2][0].getSimbo()){ 
						System.out.println("Venceu o jogador O");
						return true;
					  }
				  
				for(int i = 0; i < 3; i++){
				if(velha[i][0].getSimbo() == 'X' && velha[i][0].getSimbo() == velha[i][1].getSimbo() && velha[i][1].getSimbo() == velha[i][2].getSimbo()){
				System.out.println("Venceu o jogador X");
				return true;
				}else if(velha[i][0].getSimbo() == 'O' && velha[i][0].getSimbo() == velha[i][1].getSimbo() && velha[i][1].getSimbo() == velha[i][2].getSimbo()){
					System.out.println("Venceu o jogador O");
					return true;
					}
				
				if(velha[0][i].getSimbo() == 'X' && velha[0][i].getSimbo() == velha[1][i].getSimbo() && velha[1][i].getSimbo() == velha[2][i].getSimbo()){
				System.out.println("Venceu o jogador X");
				return true;
				}else if(velha[0][i].getSimbo() == 'O' && velha[0][i].getSimbo() == velha[1][i].getSimbo() && velha[1][i].getSimbo() == velha[2][i].getSimbo()){
					System.out.println("Venceu o jogador O");
					return true;
					}
				}
				  
				 return false; 
				}
			
			
			public void limpar() {
				for(int i=0;i<100;i++) {
					System.out.println("");
				}
			}
			public boolean verificaRound(Campo[][] velha, int p[], char simboAtual) {
				if(velha[p[0]][p[1]].getSimbo() == ' ') {
					velha[p[0]][p[1]].setSimbo(simboAtual);
					return true;
				}else {
					
					this.duplicidade = true;
					return false;
				}
			}
			public int[] jogar(Scanner scan, char simboAtual) {
				int p[] = new int[2];
				System.out.printf("%s %c%n", "Quem jogar: ", simboAtual);
				System.out.print("Informa a linha: ");
				p[0] = scan.nextInt();
				System.out.print("Informa a coluna: ");
				p[1] = scan.nextInt();
				
				return p;
			}
			
			
			
			public boolean getJogo() {
				return jogo;
			}
			public void setJogo(Boolean jogo) {
				this.jogo = jogo;
			}
			public char getSimboAtual() {
				return simboAtual;
			}
			public void setSimboAtual(char simboAtual) {
				this.simboAtual = simboAtual;
			}
			public String getVitoria() {
				return vitoria;
			}
			public void setVitoria(String vitoria) {
				this.vitoria = vitoria;
			}
			
		
}
