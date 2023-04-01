import java.util.Scanner;

public class Main {

		public static void main(String args[]) {
			
			Campo[][] velha = new Campo[3][3];
			Scanner scan = new Scanner(System.in);
			JogoDaVelha jogo = new JogoDaVelha();
			
			
			
			jogo.iniciar(velha);
			
			while(jogo.getJogo() == true) {
				jogo.desenhaJogo(velha);
				
				if(jogo.fimJogo(velha) == true) {
					break;
				}
				if(jogo.deuVelha(velha) == 9) {
					System.out.println("Empate!");
					break;
				}
				
			
				try {
					if(jogo.verificaRound(velha, jogo.jogar(scan, jogo.getSimboAtual()), jogo.getSimboAtual())) {
						if(jogo.getSimboAtual() == 'X') {
							jogo.setSimboAtual('O');
						}else {
							jogo.setSimboAtual('X');
						}
					}
					
					
				}catch(Exception e) {
					System.out.println("erro!");
				}
			}System.out.println("Fim de jogo!");
			
		}
	
}
