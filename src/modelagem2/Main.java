package modelagem2;

import java.util.Scanner;
/**
 * Classe respons�vel por executar o main do programa.
 * 
 * @author FelipeSarmento
 *
 */
public class Main {
	public static void main (String[] args) {
		/**
		 * Atributo Respons�vel por invocar a classe MainExibic�o
		 * 
		 * @author FelipeSarmento
		 */
		MainExibicao exibicao = new MainExibicao();
		Scanner scanner = new Scanner(System.in);
		BEP bep = new BEP();
		System.out.println(exibicao.mensagemInicial());
		while (true) {
			String acao = exibicao.menu(scanner);
			switch (acao) {
			case "A":
				cadastraBordado(bep, scanner);
				break;
			case "B":
				atualizaBordado(bep, scanner);
				break;
			case "C":
				imprimeBordado(bep);
				break;
			case "D":
				listaBordado(bep);
				break;
			case "E":
				cadastraQuadro(bep, scanner);
				break;
			case "F":
				atualizaQuadro(bep, scanner);
				break;
			case "G":
				imprimeQuadro(bep);
				break;
			default:
				System.out.println("\nERRO!");
			}}
		}
		
		private static void cadastraBordado(BEP bep, Scanner scanner){
			System.out.println("\nNumero do bordado? [0-9] ");
			int id = scanner.nextInt();
			System.out.println("Numero de linhas? [2-100] ");
			int qtdLinhas = scanner.nextInt();
			System.out.println("Numero de colunas [2-100] ");
			int qtdColunas = scanner.nextInt();
			Bordado bordado = new Bordado(id, qtdLinhas, qtdColunas);
			
			if ((id >= 0 && id <= 9) && (qtdLinhas >= 2 && qtdLinhas <= 100) && (qtdColunas >= 2 && qtdColunas <= 100)) {
				bep.cadastraBordado(id, qtdLinhas, qtdColunas);
			}
			return;
					
		}
		
		private static void atualizaBordado(BEP bep, Scanner scanner) {}
		private static void imprimeBordado(BEP bep) {}
		private static void listaBordado(BEP bep) {}
		private static void cadastraQuadro(BEP bep, Scanner scanner) {}
		private static void imprimeQuadro(BEP bep) {}
		private static void atualizaQuadro(BEP bep, Scanner scanner) {}
}
	
