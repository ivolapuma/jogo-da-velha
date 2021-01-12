package core;

import java.util.Scanner;

import tela.Tela;

public class Jogo {

	private final Jogada[] JOGADAS = new Jogada[9];
	private final Tela TELA;
	private final Scanner TECLADO;

	public Jogo() {
		TECLADO = new Scanner(System.in);
		TELA = new Tela();
		JOGADAS[0] = new Jogada(1, 1);
		JOGADAS[1] = new Jogada(1, 2);
		JOGADAS[2] = new Jogada(1, 3);
		JOGADAS[3] = new Jogada(2, 1);
		JOGADAS[4] = new Jogada(2, 2);
		JOGADAS[5] = new Jogada(2, 3);
		JOGADAS[6] = new Jogada(3, 1);
		JOGADAS[7] = new Jogada(3, 2);
		JOGADAS[8] = new Jogada(3, 3);
	}
	
	public void finalize() {
		TECLADO.close();
	}
	
	public void exibirTela() {
		TELA.exibir(JOGADAS);
	}
	
	public void exibirJogadaInvalida() {
		TELA.exibirJogadaInvalida();
	}
	
	public void exibirJaFoiJogada() {
		TELA.exibirJaFoiJogada();
	}

	public Jogada obterProximaJogada() {
		int linha = obterLinha();		
		int coluna = obterColuna();
		String jogada = obterJogada();
		return new Jogada(linha, coluna, jogada);
	}

	private int obterLinha() {
		int linha;
		do {
			TELA.exibirDigiteLinha(); 
			linha = TECLADO.nextInt();
			if (linha < 1 || linha > 3) {
				TELA.exibirLinhaInvalida();
			}
		} while (linha < 1 || linha > 3);
		return linha;
	}

	private int obterColuna() {
		int coluna;
		do {
			TELA.exibirDigiteColuna();
			coluna = TECLADO.nextInt();
			if (coluna < 1 || coluna > 3) {
				TELA.exibirColunaInvalida();
			}
		} while (coluna < 1 || coluna > 3);
		return coluna;
	}
	
	private String obterJogada() {
		String jogada;
		do {
			TELA.exibirDigiteJogada();
			jogada = TECLADO.next();
			if (!"XxOo".contains(jogada)) {
				TELA.exibirJogadaInvalida();
			}
		} while (!"XxOo".contains(jogada));
		return jogada;
	}
	
	public boolean jaFoi(Jogada jogada) {
		for (int i = 0; i < JOGADAS.length; i++) {
			if (jogada.temMesmaPosicao(JOGADAS[i])
					&& !Jogada.VAZIO.equals(JOGADAS[i].getJogada())) {
				return true;
			}
		}
		return false;
	}

	public void marcaJogada(Jogada jogada) {
		for (int i = 0; i < JOGADAS.length; i++) {
			if (jogada.temMesmaPosicao(JOGADAS[i])) {
				JOGADAS[i].setJogada(jogada.getJogada());
				break;
			}
		}
	}

	public boolean acabou() {
		if (JOGADAS[0].getJogada().equals(JOGADAS[1].getJogada()) 
				&& JOGADAS[1].getJogada().equals(JOGADAS[2].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[2].getJogada())) {
			return true;
		} else if (JOGADAS[3].getJogada().equals(JOGADAS[4].getJogada()) 
				&& JOGADAS[4].getJogada().equals(JOGADAS[5].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[5].getJogada())) {
			return true;
		}  else if (JOGADAS[6].getJogada().equals(JOGADAS[7].getJogada()) 
				&& JOGADAS[7].getJogada().equals(JOGADAS[8].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[5].getJogada())) {
			return true;
		} else if (JOGADAS[0].getJogada().equals(JOGADAS[3].getJogada()) 
				&& JOGADAS[3].getJogada().equals(JOGADAS[6].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[6].getJogada())) {
			return true;
		} else if (JOGADAS[1].getJogada().equals(JOGADAS[4].getJogada()) 
				&& JOGADAS[4].getJogada().equals(JOGADAS[7].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[7].getJogada())) {
			return true;
		}  else if (JOGADAS[2].getJogada().equals(JOGADAS[5].getJogada()) 
				&& JOGADAS[5].getJogada().equals(JOGADAS[8].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[8].getJogada())) {
			return true;
		} else if (JOGADAS[0].getJogada().equals(JOGADAS[4].getJogada()) 
				&& JOGADAS[4].getJogada().equals(JOGADAS[8].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[8].getJogada())) {
			return true;
		} else if (JOGADAS[2].getJogada().equals(JOGADAS[4].getJogada()) 
				&& JOGADAS[4].getJogada().equals(JOGADAS[6].getJogada()) 
				&& !Jogada.VAZIO.equals(JOGADAS[6].getJogada())) {
			return true;
		} else if (!Jogada.VAZIO.equals(JOGADAS[0].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[1].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[2].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[3].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[4].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[5].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[6].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[7].getJogada())
				&& !Jogada.VAZIO.equals(JOGADAS[8].getJogada())) {
			return true;
		}
		return false;
	}

	public void exibirInicioDeJogo() {
		TELA.exibirInicioDeJogo();
	}
	
	public void exibirFimDeJogo() {
		TELA.exibirFimDeJogo();
	}
	
}
