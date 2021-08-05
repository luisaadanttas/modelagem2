package modelagem2;

public class BEP {
	private Bordado[] bordados;
	
	public BEP() {
		this.bordados = new Bordado[10];
	}
	
	
	public Bordado[] getBordados() {
		return this.bordados.clone();
	}
	
	public void cadastraBordado(int idBordado, int quantidadeLinhas, int quantidadeColunas) {
		this.bordados[idBordado-1] = new Bordado(idBordado, quantidadeLinhas, quantidadeColunas);
	}
	
	
}
