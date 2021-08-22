package producao;

public class Participantes {
	
	int y = -1;
	
	public String[] nomes = new String[3];
	
	public String nomeJogadores(String nome) {
		if(y==2)
			y=-1;
		y++;
		System.out.printf("digite o nome do jogador(a) %d: ", y + 1);
		nomes[y] = nome;
		System.out.println(nomes[y]);
		return nomes[y];
	}
	public String passaVencedor(int x) {
		
		System.out.printf("%nO vencedor da partida é %s, PARABENS%n%n", nomes[x]);	
		return nomes[x];
	}
	
}
