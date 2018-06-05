package forca;

import java.security.SecureRandom;
import java.util.Random;

public class Roleta extends Jogo implements Resultados{
	private int tamanho;
	private String[] animais;
	public void rodarRoleta(){
		String[] animais = {"girafa","cachorro","gato","pato","morcego","lobo"};
		SecureRandom random = new SecureRandom();
		this.animais = animais;
	}
	
	public String[] getAnimais(){
		return animais;
	}
	
	@Override
	public void mostrarResultados(){
		SecureRandom random = new SecureRandom();
		this.tamanho = random.nextInt(animais.length);
		System.out.println(tamanho);
	}
	
	public int tamanho(){
		return tamanho;
	}
}
