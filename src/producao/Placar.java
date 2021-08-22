package producao;

public class Placar {

	public int[] somaJogadas = new int[3];
	public int[] sequenStreak = new int[3];

	public int rodada = 0;
	public int jogador = 0;
	public int somaRodada = 0;
	public boolean[] spareAnterior = new boolean[3];

	public int zeraVariaveis() {

		for (int x = 0; x < 3; x++) {
			somaJogadas[x] = 0;
			sequenStreak[x] = 0;
			spareAnterior[x] = false;
		}
		rodada = 0;
		jogador = -1;
		somaRodada = 0;
		return 0;
	}

	public int pontuacao(int j1, int j2) {

		if (jogador == 2) {
			rodada++;
			jogador = -1;
		}
		jogador++;
		System.out.printf("%nJogador %d rodada %d%n", (jogador + 1), (rodada + 1));
		System.out.printf("Primeiro lançamento: %d%n", j1);

		if (j1 == 10) {
			somaJogadas[jogador] = somaJogadas[jogador] + 10;
			if (sequenStreak[jogador] == 1) {
				somaJogadas[jogador] = somaJogadas[jogador] + 10;
				sequenStreak[jogador]++;
			} else if (sequenStreak[jogador] == 2)
				somaJogadas[jogador] = somaJogadas[jogador] + 20;
			else if (spareAnterior[jogador] == true)
				somaJogadas[jogador] = somaJogadas[jogador] + 10;
			else
				sequenStreak[jogador]++;
			spareAnterior[jogador] = false;
			return somaJogadas[jogador];
		}
		System.out.printf("Segundo lançamento: %d%n", j2);
		somaRodada = j1 + j2;

		if (somaRodada == 10) {
			somaJogadas[jogador] = somaJogadas[jogador] + 10;
			if (spareAnterior[jogador] == true) {
				somaJogadas[jogador] = somaJogadas[jogador] + j1;
			} else if (sequenStreak[jogador] > 0) {
				somaJogadas[jogador] = somaJogadas[jogador] + 10;
			}
			spareAnterior[jogador] = true;
			sequenStreak[jogador] = 0;
			return somaJogadas[jogador];
		}
		somaJogadas[jogador] = somaJogadas[jogador] + somaRodada;
		if (spareAnterior[jogador] == true) {
			somaJogadas[jogador] = somaJogadas[jogador] + j1;
		} else
			spareAnterior[jogador] = false;
		if (sequenStreak[jogador] > 0)
			somaJogadas[jogador] = somaJogadas[jogador] + somaRodada;
		spareAnterior[jogador] = false;
		sequenStreak[jogador] = 0;
		return somaJogadas[jogador];
	}

	public int passaResultado() {
		int qual = 0;
		int vencedor = 0;
		for (int x1 = 0; x1 < 3; x1++) {
			if (somaJogadas[x1] > vencedor) {
				vencedor = somaJogadas[x1];
				qual = x1;
			}
		}
		return qual;
	}

}
