package forca;

import java.util.Scanner;

//pq um jogador é um cadastro???
public class Jogador extends Cadastro {
	private int vitorias, derrotas, pontos;
	private String nome, letra;
	private Roleta row;
	public Jogador() {
		super();
	}

	@Override
	public void cadastroNome() {
		System.out.println("digite o nome do jogador");
		
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		
		if(nome.length() > 10)
			throw new IllegalArgumentException("Nome maior que o permitido para o rank");
		
		this.nome = nome;
	}
	
	public String escolherLetra(String letra){
		return letra;
	}
	
	public void Acertar() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void Errar() {
		
	}
	
}
	
