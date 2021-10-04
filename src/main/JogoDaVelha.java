package main;

import core.Jogada;
import core.Jogo;

public class JogoDaVelha {

	public void iniciar() {
		
		Jogada jogada = null;
		Jogo jogo = new Jogo();
		
		jogo.exibirInicioDeJogo();
		
		jogo.exibirTela();		
		
		do {
			do {
				do {
					jogada = jogo.obterProximaJogada();
					if (!jogada.ehValida()) {
						jogo.exibirJogadaInvalida();
					}
				} while (!jogada.ehValida());
				if (jogo.jaFoi(jogada)) {
					jogo.exibirJaFoiJogada();
				}
			} while (jogo.jaFoi(jogada));
			jogo.marcaJogada(jogada);
			jogo.exibirTela();
		} while (!jogo.acabou());
		
		jogo.exibirFimDeJogo();

	}
	
}
