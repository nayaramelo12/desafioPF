package nivelJunior;

import java.util.Scanner;

public class Automato {
	//Criando variáveis globais static para serem compartilhadas entre os métodos static

	//Variavel tipo Scanner para obter resposta do usuário
	private static Scanner teclado = new Scanner(System.in);

	//Variável responsável por guardar resposta atual do usuário
	private static String valoratual;

	//String inicializada para manter o estado da palavra sendo formada
	private static String palavra = new String();

	//Método principal para inicialização do programa
	public static void main(String[] args) {

		perguntarPalavra("p", "d");
		//Opção P
		if (valoratual.equalsIgnoreCase("p")) {
			palavra += valoratual;
			perguntarPalavra("a", "o");

			//LOPP PARA AS OPÇÕES A E P
			while (valoratual.equalsIgnoreCase("a")) {
				palavra += valoratual;
				palavra += "p";
				perguntarPalavra("a", "o");
			} 
			//Opção E
			if(valoratual.equalsIgnoreCase("o") ){
				palavra += valoratual;
				perguntarPalavra("s", "fim");
				//LOPP PARA AS OPÇÃO S
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
			//Opção E
			if(valoratual.equalsIgnoreCase("e")) {
				palavra += valoratual;
				System.out.println(palavra);
			} 
			//Opção O
			if(valoratual.equalsIgnoreCase("o") ){
				palavra += valoratual;
				perguntarPalavra("s", "fim");
				//LOPP PARA AS OPÇÃO S
				while (valoratual.equalsIgnoreCase("s")) {
					palavra += valoratual;
					palavra += "o";
					perguntarPalavra("s", "fim");
				} 
				System.out.println("Palavra formada no Automoto: "+ palavra);	
			}
		}
	}

	//Método utilizado diversas vezes para continuação do fluxo e loop
	private static void perguntarPalavra(String valor1, String valor2) {
		System.out.println("Escreva sua letra:");
		System.out.println(valor1+ " | "+ valor2);
		valoratual = teclado.next();
		System.out.println("Palavra Atual: "+ palavra);
	}
}
