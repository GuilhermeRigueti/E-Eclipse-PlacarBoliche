package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testes {
	int resultado;
	String vencedor;
	
	/*
	 * Placar de boliche: O software deve receber o nome de 3 jogadores;
	 * 
	 * Após os nomes, o sw deverá iniciar o jogo solicitando o número de pinos
	 * derrubados nas duas jogadas do jogador da vez:Caso tenha strike, o sw não
	 * deve perguntar os pinos derrubados na segunda jogada
	 * 
	 * O sw então inicia a jogada de outro jogador.
	 * 
	 * Ao final de 3 rodadas, o Sw deverá exibir o calculo do placar, exibindo o
	 * total de pontos de cada jogador e indicar o vencedor.
	 */
	
	@BeforeEach
	void jogadores() {
		
		String teste;
		int variavel;
		
		teste = producao.Main.testeParticipantes("Gui");
		assertTrue(teste == "Gui");
		
		teste = producao.Main.testeParticipantes("Mat");
		assertFalse(teste == null);
		
		teste = producao.Main.testeParticipantes("Pelegrin");
		assertFalse(teste == null);
		
		variavel = producao.Main.testeZeraVariavel();
		assertTrue(variavel == 0);
	}
		
	@Test
	void pontuacaoSimples() {
		
		resultado=producao.Main.testePlacar(0,5);
		assertTrue(resultado == 5);
		
		resultado=producao.Main.testePlacar(7,2);
		assertTrue(resultado == 9);
		
		resultado=producao.Main.testePlacar(5,3);
		assertTrue(resultado == 8);
	
		resultado=producao.Main.testePlacar(0,0);
		assertTrue(resultado == 5);
		
		resultado=producao.Main.testePlacar(6,2);
		assertTrue(resultado == 17);
		
		resultado=producao.Main.testePlacar(1,3);
		assertTrue(resultado == 12);

		resultado=producao.Main.testePlacar(0,2);
		assertTrue(resultado == 7);
		
		resultado=producao.Main.testePlacar(0,0);
		assertTrue(resultado == 17);
		
		resultado=producao.Main.testePlacar(1,8);
		assertTrue(resultado == 21);
		
		vencedor = producao.Main.testeResultado();
		assertTrue(vencedor == "Pelegrin");
	}
	
	@Test
	void pontuacaoSpare() {

		resultado=producao.Main.testePlacar(8,2);
		assertTrue(resultado == 10);
			
		resultado=producao.Main.testePlacar(7,3);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(5,3);
		assertTrue(resultado == 8);
		
		resultado=producao.Main.testePlacar(8,1);
		assertTrue(resultado == 27);
		
		resultado=producao.Main.testePlacar(6,2);
		assertTrue(resultado == 24);
		
		resultado=producao.Main.testePlacar(1,9);
		assertTrue(resultado == 18);
		
		resultado=producao.Main.testePlacar(7,2);
		assertTrue(resultado == 36);
		
		resultado=producao.Main.testePlacar(0,0);
		assertTrue(resultado == 24);
		
		resultado=producao.Main.testePlacar(1,0);
		assertTrue(resultado == 20);
			
		vencedor = producao.Main.testeResultado();
		assertTrue(vencedor == "Gui"); 
	}
	
	@Test
	void pontuacaoDepoisDeSpare() {
		
		resultado=producao.Main.testePlacar(2,8);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(7,2);
		assertTrue(resultado == 9);
		
		resultado=producao.Main.testePlacar(5,5);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(5,5);
		assertTrue(resultado == 25);
		
		resultado=producao.Main.testePlacar(6,4);
		assertTrue(resultado == 19);
		
		resultado=producao.Main.testePlacar(6,4);
		assertTrue(resultado == 26);
		
		resultado=producao.Main.testePlacar(4,0);
		assertTrue(resultado == 33);
		
		resultado=producao.Main.testePlacar(8,2);
		assertTrue(resultado == 37);
		
		resultado=producao.Main.testePlacar(1,2);
		assertTrue(resultado == 30);
		
		vencedor = producao.Main.testeResultado();
		assertTrue(vencedor == "Mat"); 	
	}
	
	@Test
	void pontuacaoStrike() {
				
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(7,2);
		assertTrue(resultado == 9);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(5,2);
		assertTrue(resultado == 24);
		
		resultado=producao.Main.testePlacar(6,2);
		assertTrue(resultado == 17);
		
		resultado=producao.Main.testePlacar(6,4);
		assertTrue(resultado == 30);

		resultado=producao.Main.testePlacar(1,0);
		assertTrue(resultado == 25);
		
		resultado=producao.Main.testePlacar(0,0);
		assertTrue(resultado == 17);
		
		resultado=producao.Main.testePlacar(1,8);
		assertTrue(resultado == 40);
		
		vencedor = producao.Main.testeResultado();
		assertTrue(vencedor == "Pelegrin"); 	
	}
	
	@Test
	void pontuacaoDepoisDeStrike() {
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(7,2);
		assertTrue(resultado == 9);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 10);
			
		resultado=producao.Main.testePlacar(5,5);
		assertTrue(resultado == 30);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 19);
		
		resultado=producao.Main.testePlacar(6,4);
		assertTrue(resultado == 30);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 50);
		
		resultado=producao.Main.testePlacar(6,2);
		assertTrue(resultado == 35);
		
		resultado=producao.Main.testePlacar(1,8);
		assertTrue(resultado == 40);
		
		vencedor = producao.Main.testeResultado();
		assertTrue(vencedor == "Gui"); 
	}
	
	@Test
	void pontuacaoStrikeSeguidos() {
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 10);
		
		resultado=producao.Main.testePlacar(7,2);
		assertTrue(resultado == 9);
		
		resultado=producao.Main.testePlacar(1,9);
		assertTrue(resultado == 10);
		
	
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 30);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 19);
		
		resultado=producao.Main.testePlacar(0,10);
		assertTrue(resultado == 20);

		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 60);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 39);
		
		resultado=producao.Main.testePlacar(10,0);
		assertTrue(resultado == 40);
		
		vencedor = producao.Main.testeResultado();
		assertTrue(vencedor == "Gui"); 
	
	}
	
}

		
	
	
	
	




