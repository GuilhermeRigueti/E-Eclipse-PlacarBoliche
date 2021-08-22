package producao;

public class Main {

	static Participantes participantes = new Participantes();
	static Placar placar = new Placar();
	
	public static String testeParticipantes(String string) {
		return participantes.nomeJogadores(string);
	}
	public static int testePlacar(int j1, int j2) {
		return placar.pontuacao(j1, j2);
	}
	public static String testeResultado() {
		
		int vencedor;
		vencedor = placar.passaResultado();
	
		return participantes.passaVencedor(vencedor);			
	}
 public static int testeZeraVariavel() {
	 
		int variavel = placar.zeraVariaveis();
		return variavel;		
	}
}
