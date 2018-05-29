package test;

import java.util.Scanner;

interface StringTest {
	boolean test(String aStr, String bStr);
}
public class Test {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//System.out.println(palavras);
		
		//StringTest isIn = (animais, palavras) -> animais.indexOf(palavras) != -1;
		/*
		String str = "This is a test";
		
		System.out.println("Testing string: " + str);
		
		if(isIn.test(str, "is a"))
			System.out.println("'is a' found.");
		else
			System.out.println("'is a' not found");
		
		if(isIn.test(str, "xyz"))
			System.out.println("'xyz' Found");
		else
			System.out.println("'xyz' not found");
		*/	
		String animais = "Girafa";
		char[] traco = new char[animais.length()];
		
		String enc = animais.substring(0, 1);
		//System.out.println(enc);
		

		for( int i = 0; i < animais.length(); i++) {
			traco[i] = '_';
			System.out.print(traco[i]+" ");		
		}
		for (int j = 0; j < 10; j++) {
			
			System.out.println("\nDigite uma letra: ");
			char palavras = teclado.next().charAt(0);
			
			for( int i = 0; i < animais.length(); i++) {
				
				if( palavras == animais.charAt(i)) {
					traco[i] = palavras;
					
				}
				//System.out.print(animais.charAt(i));
				/*if (isIn.test(animais, palavras)) {
					traco[i] = palavras;
				}*/
				System.out.print(traco[i] + " ");
				
			}
			
		}
	}

}
