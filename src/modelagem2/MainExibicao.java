package modelagem2;

/**
 * Classe responsável por controlar as Strings a serem exibidas no menu,
 * assim como suas saídas.
 * 
 * @author FelipeSarmento
 */

import java.util.Scanner;

public class MainExibicao {
	
	
	/**
	 * Método responsável por exibir o menu inicial
	 * @param scanner o scanner que coletará os inputs
	 * @return o input da operação em String (Em letra Maíscula).
	 * 
	 * @author FelipeSarmento
	 */
	public String menu(Scanner scanner) {
		System.out.print(menuExibicao());
		String acao = scanner.next().toUpperCase();
		return acao;
	}
	
	/**
	 * Método que retorna a mensagem inicial do menu, que só exibida uma vez.
	 * @return string referente a mensagem inicial
	 * 
	 * @author FelipeSarmento
	 */
	public String mensagemInicial() {
		return "Bem-vindo ao BEP!";
	}
	
	/**
	 * Método privado que retorna string referente ao menu.
	 * @return string.
	 * 
	 * @author FelipeSarmento
	 * 
	 * Nota: esse método precisa ser modificado para contemplar a mudança da quantidade de bordados disponíveis
	 * (Provavelmente deve ser lido o tamanho do array de BEP diferente de nulo).
	 */
	private String menuExibicao() {
		return "\nVoce pode cadastrar 10 bordados. O que deseja fazer?\n"
				+ "\nA - Cadastrar bordado\r\n"
				+ "\nB - Atualizar bordado\n"
				+ "\nC - Imprimir bordado\n"
				+"\nD - Listar bordados\n"
				+"\nE - Cadastrar Quadro\n"
				+"\nF - Atualizar Quadro\n"
				+"\nG - Exibir Quadro\n"
				+"\nAcao? ";
		
	}
}