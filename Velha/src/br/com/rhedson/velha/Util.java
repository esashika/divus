package br.com.rhedson.velha;

/**
 * 
 * @author Rhedson esta classe traz os metodos utilizados no jogo da velha @
 */

public class Util {
	private static int TAMANHO_DA_VELHA = 9;
	private char velha[] = new char[TAMANHO_DA_VELHA];
	private int contador = 0;

	public void inicializaVelha() {
		for (int i = 0; i < velha.length; i++) {
			this.velha[i] = '_';
		}

	}

	public boolean isVelha() {
		int a = 0;
		for (int i = 0; i < velha.length; i++) {
			if ((velha[i] == '_') || (velha[i] != 'X' || velha[i] != '0')) {
				a++;
			}
		}
		if (a == 0)
			return false;
		else
			return true;

	}

	public void imprimeVelha() {
		for (int i = 0; i < velha.length; i++) {
			if (i == 3 || i == 6) {
				System.out.print("\n");
			}
			System.out.print(velha[i]);

		}
		System.out.println(" ");
	}

	public boolean isPreenchido(int posicaoIsPreenchido) {

		if (velha[posicaoIsPreenchido] == '_') {
			// this.mensagemDaJogada("Jogada V‡lida");
			return true;
		} else {
			// this.mensagemDaJogada("Jogada Invalida");
			return false;
		}

	}

	public boolean jogar_X(int posicao) {
		if (isPreenchido(posicao)) {
			velha[posicao] = 'X';

			return true;
		} else {

			return false;

		}

	}

	public boolean jogar_0(int posicao) {
		if (isPreenchido(posicao)) {
			velha[posicao] = '0';
			return true;
		} else {
			return false;

		}

	}

	public void mensagemDaJogada(String mensagem) {
		System.out.println(mensagem);

	}

	public boolean jogar(int posicao) {
		char jogada;
		if (contador % 2 == 0) {
			jogada = 'X';
		} else {
			jogada = '0';
		}

		if (isPreenchido(posicao)) {
			velha[posicao] = jogada;
			contador++;
			return true;
		} else {

			return false;

		}
	}

	public boolean regrasParaVencer() {
		if (velha[0] != '_')
			if ((velha[0] == velha[1]) && (velha[0] == velha[2])) {
				System.out.println("Ganhou o " + velha[0]);
				return true;
			}
		if (velha[3] != '_')
			if ((velha[3] == velha[4]) && (velha[3] == velha[5])) {
				System.out.println("Ganhou o " + velha[3]);
				return true;
			}
		if (velha[6] != '_')
			if ((velha[6] == velha[7]) && (velha[6] == velha[8])) {
				System.out.println("Ganhou o " + velha[6]);
				return true;
			}

		if (velha[0] != '_')
			if ((velha[0] == velha[3]) && (velha[0] == velha[6])) {
				System.out.println("Ganhou o " + velha[0]);
				return true;
			}
		if (velha[1] != '_')
			if ((velha[1] == velha[4]) && (velha[1] == velha[7])) {
				System.out.println("Ganhou o " + velha[1]);
				return true;
			}
		if (velha[2] != '_')
			if ((velha[2] == velha[5]) && (velha[2] == velha[8])) {
				System.out.println("Ganhou o " + velha[2]);
				return true;
			}

		if (velha[0] != '_')
			if ((velha[0] == velha[4]) && (velha[0] == velha[8])) {
				System.out.println("Ganhou o " + velha[6]);
				return true;
			}
		if (velha[2] != '_')
			if ((velha[2] == velha[4]) && (velha[2] == velha[6])) {
				System.out.println("Ganhou o " + velha[2]);
				return true;
			}
		return false;
	}

}
