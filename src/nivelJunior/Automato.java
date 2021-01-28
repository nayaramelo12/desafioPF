package nivelJunior;

import java.util.Scanner;

public class Automato {
	//Criando vari�veis globais static para serem compartilhadas entre os m�todos static

	//Variavel tipo Scanner para obter resposta do usu�rio
	private static Scanner teclado = new Scanner(System.in);

	//Vari�vel respons�vel por guardar resposta atual do usu�rio
	private static String valoratual;

	//String inicializada para manter o estado da palavra sendo formada
	private static String palavra = new String();

	//M�todo principal para inicializa��o do programa
	public static void main(String[] args) {

		perguntarPalavra("p", "d");
		//Op��o P
		if (valoratual.equalsIgnoreCase("p")) {
			palavra += valoratual;
			perguntarPalavra("a", "o");

			//LOPP PARA AS OP��ES A E P
			while (valoratual.equalsIgnoreCase("a")) {
				palavra += valoratual;
				palavra += "p";
				perguntarPalavra("a", "o");
			} 
			//Op��o E
			if(valoratual.equalsIgnoreCase("o") ){
				palavra += valoratual;
				perguntarPalavra("s", "fim");
				//LOPP PARA AS OP��O S
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
			//Op��o E
			if(valoratual.equalsIgnoreCase("e")) {
				palavra += valoratual;
				System.out.println(palavra);
			} 
			//Op��o O
			if(valoratual.equalsIgnoreCase("o") ){
				palavra += valoratual;
				perguntarPalavra("s", "fim");
				//LOPP PARA AS OP��O S
				while (valoratual.equalsIgnoreCase("s")) {
					palavra += valoratual;
					palavra += "o";
					perguntarPalavra("s", "fim");
				} 
				System.out.println("Palavra formada no Automoto: "+ palavra);	
			}
		}
	}

	//M�todo utilizado diversas vezes para continua��o do fluxo e loop
	private static void perguntarPalavra(String valor1, String valor2) {
		System.out.println("Escreva sua letra:");
		System.out.println(valor1+ " | "+ valor2);
		valoratual = teclado.next();
		System.out.println("Palavra Atual: "+ palavra);
	}
}
