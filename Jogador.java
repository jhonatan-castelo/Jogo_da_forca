package forca;

public class Jogador extends Cadastro{
	private int vitorias, derrotas, pontos;
	private String nome, letra;

	public Jogador() {
		super();
	}

	@Override
	public void cadastroNome() {
		this.nome = nome;	
	}
	
	public String escolherLetra(String letra){
		return letra;
	}
	
	
	
}
