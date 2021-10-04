package core;

public class Jogada {

	public static String VAZIO = " ";
	public static String X = "X";
	public static String O = "O";
	
	private String jogada;
	private int posicaoLinha;
	private int posicaoColuna;
	
	public Jogada(int linha, int coluna) {
		this.posicaoLinha = linha;
		this.posicaoColuna = coluna;
		this.jogada = VAZIO;
	}
	
	public Jogada(int linha, int coluna, String jogada) {
		this.posicaoLinha = linha;
		this.posicaoColuna = coluna;
		this.jogada = jogada;
	}

	public String getJogada() {
		if ("XxOo".contains(jogada)) {
			return jogada.toUpperCase();
		}
		else {
			return VAZIO;
		}
	}
	
	public void setJogada(String jogada) {
		this.jogada = jogada;
	}
	
	public int getPosicaoLinha() {
		return posicaoLinha;
	}
	
	public int getPosicaoColuna() {
		return posicaoColuna;
	}

	public boolean ehValida() {
		if ((this.posicaoLinha >= 1 && this.posicaoLinha <= 3)
				&& (this.posicaoColuna >= 1 && this.posicaoColuna <= 3)
				&& (X.equalsIgnoreCase(jogada) || O.equalsIgnoreCase(jogada))) {
			return true;
		}
		return false;
	}

	public boolean temMesmaPosicao(Jogada jogada) {
		if (this.posicaoLinha == jogada.getPosicaoLinha()
				&& this.posicaoColuna == jogada.getPosicaoColuna()) {
			return true;
		}
		return false;
	}

}
