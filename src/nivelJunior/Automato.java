package nivelJunior;

import java.util.Scanner;

public class Automato {
	static Scanner teclado = new Scanner(System.in);
	static String valoratual;
	static String palavra = "";
	
	public static void main(String[] args) {

		perguntarPalavra("p", "d");
		if (valoratual.equalsIgnoreCase("p")) {
			palavra += valoratual;
			
			perguntarPalavra("a", "o");
			
			while (valoratual.equalsIgnoreCase("a")) {
				palavra += valoratual;
				palavra += "p";
				perguntarPalavra("a", "o");
			} 
			if(valoratual.equalsIgnoreCase("o") ){
				palavra += valoratual;
				perguntarPalavra("s", "fim");
				while (valoratual.equalsIgnoreCase("s")) {
					palavra += valoratual;
					palavra += "o";
					perguntarPalavra("s", "fim");
				} 
				System.out.println("Palavra formada no Automoto: "+ palavra);
					
			}
		} else	if (valoratual.equalsIgnoreCase("d")) {
				palavra += valoratual;
				
				perguntarPalavra("o", "e");
				
				if(valoratual.equalsIgnoreCase("e")) {
					palavra += valoratual;
					System.out.println(palavra);
				} 
				if(valoratual.equalsIgnoreCase("o") ){
					palavra += valoratual;
					perguntarPalavra("s", "fim");
					while (valoratual.equalsIgnoreCase("s")) {
						palavra += valoratual;
						palavra += "o";
						perguntarPalavra("s", "fim");
					} 
					System.out.println("Palavra formada no Automoto: "+ palavra);	
				}
			}
			
		}
	
	public static void perguntarPalavra(String valor1, String valor2) {
		
		System.out.println("Escreva sua letra:");
		System.out.println(valor1+ " | "+ valor2);
		valoratual = teclado.next();
		System.out.println("Palavra Atual: "+ palavra);
	}

}
