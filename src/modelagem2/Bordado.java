package modelagem2;


/**
 * Classe Responsável pelo Bordado.
 * 
 * @author FelipeSarmento
 */
public class Bordado {
	
	
	/**
	 * Atributo referente ao ID, em int;
	 * Deve ser entre 0 e 9, fechado em ambos.
	 * 
	 * @author FelipeSarmento
	 */
	private int id;
	
	
	/**
	 *Atributo referente a linha, int;
	 *Deve ser entre 2 e 100, fechado em ambos.
	 * 
	 *@author FelipeSarmento
	 */
	private int linha;
	
	
	/**
	 * Atributo referente a coluna, em int;
	 * Deve ser entre 2 e 100, fechado em ambos.
	 * 
	 * @author FelipeSarmento
	 */
	private int coluna;
	
	
	/**
	 * Construtor que utiliza Setters para validar os inputs
	 * @param id o identificador, em int.
	 * @param linha a linha, em int.
	 * @param coluna a coluna, em int.
	 * 
	 * @author FelipeSarmento
	 */
	public Bordado(int id, int linha, int coluna) {
		setId(id);
		setLinha(linha);
		setColuna(coluna);
	}
	
	
	/**
	 * Setter do atributo ID com a validação (entre 0 e 9, fechado em ambos)
	 * @param id a ser testado.
	 * 
	 * @author FelipeSarmento
	 */
	public void setId(int id) {
		if (id >= 0 && id <= 9) {this.id = id;}
		else {System.out.println("ERRO!");}
	}
	
	
	/**
	 * Setter do atributo linha, com a validação (entre 2 e 100, fechado em ambos).
	 * @param linha a ser testada.
	 * 
	 * @author FelipeSarmento
	 */
	public void setLinha(int linha) {
		if (linha >= 2 && linha <= 100) {this.linha = linha;}
		else {System.out.println("ERRO!");}
	}
	
	
	/**
	 * Setter do atributo coluna, com validação (entre 2 e 100, fechado em ambos).
	 * @param coluna a ser testada.
	 * 
	 * @author FelipeSarmento
	 */
	public void setColuna(int coluna) {
		if (coluna >= 2 && coluna <= 100) {this.coluna = coluna;}
		else {System.out.println("ERRO!");}
	}
}
