package tela;

import core.Jogada;

public class Tela {

	public void exibir(Jogada[] jogadas) {
		System.out.println();
		System.out.println("    1     2     3    ");
		System.out.println("       |     |       ");
		System.out.printf ("1   %s  |  %s  |  %s   \n", jogadas[0].getJogada(), jogadas[1].getJogada(), jogadas[2].getJogada());
		System.out.println("       |     |       ");
		System.out.println("  -----|-----|-----  ");
		System.out.println("       |     |       ");
		System.out.printf ("2   %s  |  %s  |  %s   \n", jogadas[3].getJogada(), jogadas[4].getJogada(), jogadas[5].getJogada());
		System.out.println("       |     |       ");
		System.out.println("  -----|-----|-----  ");
		System.out.println("       |     |       ");
		System.out.printf ("3   %s  |  %s  |  %s   \n", jogadas[6].getJogada(), jogadas[7].getJogada(), jogadas[8].getJogada());
		System.out.println("       |     |       ");
	}

	public void exibirDigiteLinha() {
		System.out.println("Digite a Linha (1, 2 ou 3):");
	}

	public void exibirDigiteColuna() {
		System.out.println("Digite a Coluna (1, 2 ou 3):");
	}

	public void exibirDigiteJogada() {
		System.out.println("Digite a jogada (X ou O):");
	}

	public void exibirLinhaInvalida() {
		System.out.println();
		System.out.println("*** LINHA INVALIDA! ***");
		System.out.println();
	}

	public void exibirColunaInvalida() {
		System.out.println();
		System.out.println("*** COLUNA INVALIDA! ***");
		System.out.println();
	}

	public void exibirJogadaInvalida() {
		System.out.println();
		System.out.println("*** JOGADA INVALIDA! ***");
		System.out.println();
	}

	public void exibirJaFoiJogada() {
		System.out.println();
		System.out.println("*** JOGADA JA REALIZADA! ***");
		System.out.println();
	}

	public void exibirInicioDeJogo() {
		System.out.println();
		System.out.println("*********************");
		System.out.println("*** JOGO DA VELHA ***");
		System.out.println("*********************");
		System.out.println();
	}

	public void exibirFimDeJogo() {
		System.out.println();
		System.out.println("*****************");
		System.out.println("*** GAME OVER ***");
		System.out.println("*****************");
		System.out.println();
	}

}
