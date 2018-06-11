package jogo;

import java.util.Arrays;
import java.util.Scanner;
import java.security.*;


public class Jogo implements Resultados{
		boolean achou = true;
		boolean erro;
		Jogador[] player;
		Roleta row;
		String[] corpo = {"Cabeça", "Tronco", "Braço esquerdo", "Braço direito", "Perna Esquerda", "Perna Direita"};
		int acerto = 0, cont = 0;
		
		public void iniciarJogo(Jogador player) {
			this.player = new Jogador[2];
		}
		
		public void terminarJogo(Jogador player) {
			
		}
	

	@Override
	public void mostrarResultados() {
		
	}
	public void jogar(Jogador player) {
		
	}
	
	public void Jogar(String animais) {
			Scanner teclado = new Scanner(System.in);

			char[] traco = new char[animais.length()];;
			
				for( int i = 0; i < animais.length(); i++) {
					traco[i] = '_';
					System.out.print(traco[i]+" ");		
				}
				while(achou) {
					erro = true;
					System.out.println("\nDigite uma letra: ");
					char palavras = teclado.next().charAt(0);
					
					
					for( int i = 0; i < animais.length(); i++) {
						
						if (palavras == traco[i]) {
							System.out.print(traco[i]+" ");
							continue;
						}
						if( palavras == animais.charAt(i)) {
							traco[i] = palavras;
							acerto++;
							erro = false;
							
						}
						System.out.print(traco[i]+ " ");	
					}
					if (erro == true) {
						System.out.println("\n\n"+corpo[cont]);
						cont++;

					}
					if (cont == 6) {
						System.out.println("\n\nVocê perdeu!");
						achou = false;
					}

					if(acerto == animais.length()) {
						System.out.println("\n\nVocê ganhou!");
						achou = false;
					}
					
				}
				
				
					
				
	}
}
