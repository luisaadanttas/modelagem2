package modelagem2;

import java.util.Scanner;
/**
 * Classe responsável por executar o main do programa.
 * 
 * @author FelipeSarmento
 *
 */
public class Main {
	public static void main (String[] args) {
		/**
		 * Atributo Responsável por invocar a classe MainExibicão
		 * 
		 * @author FelipeSarmento
		 */
		MainExibicao exibicao = new MainExibicao();
		Scanner scanner = new Scanner(System.in);
		System.out.println(exibicao.mensagemInicial());
		while (true) {
			String acao = exibicao.menu(scanner);
			switch (acao) {
			case "A":
				break;
			case "B":
				break;
			case "C":
				break;
			case "D":
				break;
			case "E":
				break;
			case "F":
				break;
			case "G":
				break;
			default:
				System.out.println("\nERRO!");
			}
		}
	}

}
