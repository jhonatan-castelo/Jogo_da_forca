package forca;

public class Jogador extends Cadastro{
	private int vitorias, derrotas, pontos;
	private String nome, letra;
	private Roleta row;
	public Jogador() {
		super();
	}

	@Override
	public void cadastroNome(String nome) {
		this.nome = nome;
	}
	
	public String escolherLetra(String letra){
		return letra;
	}
	
	
	
	
	
}

	
}
