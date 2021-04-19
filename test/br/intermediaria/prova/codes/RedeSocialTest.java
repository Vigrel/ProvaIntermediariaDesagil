package br.intermediaria.prova.codes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedeSocialTest {

	@BeforeEach
	public void SetUp() {
		Usuario usuario = new Usuario("Vinicius");
		Produto produto = new Produto("Dji FPV drone", 150.50);
		Video video = usuario.postaVideo(1, produto);
	}

	@Test
	public void testAvaliacoesInvalidas() {
		Usuario avaliador1 = new Usuario("Vitor");
		Usuario avaliador2 = new Usuario("Pedro");
		
		
		
		int avaliacao1 = 0;
		int avaliacao2 = 6;
		
		video.adicionaAvaliacao(avaliacao1);
		video.adicionaAvaliacao(avaliacao1);
		
		somaMedias = video.mediaAvaliacoes();
		
		assertEquals(0, somaMedias);
	}
	
}
