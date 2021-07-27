package modelagem2;

/**
 * Classe respons�vel por controlar as Strings a serem exibidas no menu,
 * assim como suas sa�das.
 * 
 * @author FelipeSarmento
 */

import java.util.Scanner;

public class MainExibicao {
	
	
	/**
	 * M�todo respons�vel por exibir o menu inicial
	 * @param scanner o scanner que coletar� os inputs
	 * @return o input da opera��o em String (Em letra Ma�scula).
	 * 
	 * @author FelipeSarmento
	 */
	public String menu(Scanner scanner) {
		System.out.print(menuExibicao());
		String acao = scanner.next().toUpperCase();
		return acao;
	}
	
	/**
	 * M�todo que retorna a mensagem inicial do menu, que s� exibida uma vez.
	 * @return string referente a mensagem inicial
	 * 
	 * @author FelipeSarmento
	 */
	public String mensagemInicial() {
		return "Bem-vindo ao BEP!";
	}
	
	/**
	 * M�todo privado que retorna string referente ao menu.
	 * @return string.
	 * 
	 * @author FelipeSarmento
	 * 
	 * Nota: esse m�todo precisa ser modificado para contemplar a mudan�a da quantidade de bordados dispon�veis
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