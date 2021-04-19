package br.intermediaria.prova.codes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedeSocialTest {
	Usuario usuario;
	Produto produto;
	private Video video;
	
	@BeforeEach
	public void SetUp() {
		usuario = new Usuario("Vinicius");
		produto = new Produto("Dji FPV drone", 150.50);
		video = usuario.postaVideo(1, produto);
	}

	@Test
	public void testAvaliacoesInvalidas() {
		Usuario avaliador1 = new Usuario("Vitor");
		Usuario avaliador2 = new Usuario("Pedro");
		
		int avaliacao1 = 0;
		int avaliacao2 = 6;
		
		video.adicionaAvaliacao(avaliador1, avaliacao1);
		video.adicionaAvaliacao(avaliador2, avaliacao2);
		
		int somaMedias = usuario.totalAvaliacoes();
		
		assertEquals(0, somaMedias);
	}
	
	@Test
	public void testAvaliacaoValida() {
		Usuario avaliador1 = new Usuario("Vitor");
		
		int avaliacao1 = 4;
		
		video.adicionaAvaliacao(avaliador1, avaliacao1);
		
		int somaMedias = usuario.totalAvaliacoes();
		
		assertEquals(4, somaMedias);
	}
	
	@Test
	public void testDuasValidasParaCima() {
		Usuario avaliador1 = new Usuario("Vitor");
		Usuario avaliador2 = new Usuario("Pedro");
		
		int avaliacao1 = 3;
		int avaliacao2 = 4;
		
		video.adicionaAvaliacao(avaliador1, avaliacao1);
		video.adicionaAvaliacao(avaliador2, avaliacao2);
		
		int somaMedias = usuario.totalAvaliacoes();
		
		assertEquals(4, somaMedias);
	}
	
	@Test
	public void testTresValidasParaBaixo() {
		Usuario avaliador1 = new Usuario("Vitor");
		Usuario avaliador2 = new Usuario("Pedro");
		Usuario avaliador3 = new Usuario("Hashi");
		
		int avaliacao1 = 3;
		int avaliacao2 = 4;
		int avaliacao3 = 3;
		
		video.adicionaAvaliacao(avaliador1, avaliacao1);
		video.adicionaAvaliacao(avaliador2, avaliacao2);
		video.adicionaAvaliacao(avaliador3, avaliacao3);
		
		int somaMedias = usuario.totalAvaliacoes();
		
		assertEquals(3, somaMedias);
	}
	
	@Test
	public void testDoisVideosTresAvaliacoes() {
		Usuario avaliador1 = new Usuario("Vitor");
		Usuario avaliador2 = new Usuario("Pedro");
		Usuario avaliador3 = new Usuario("Hashi");
		
		int avaliacao1 = 3;
		int avaliacao2 = 4;
		int avaliacao3 = 3;
		
		Produto produto2 = new Produto("Dji phantom 4 drone", 140.90);
		Video video2 = usuario.postaVideo(2, produto2);
		
		video.adicionaAvaliacao(avaliador1, avaliacao1);
		video.adicionaAvaliacao(avaliador2, avaliacao2);
		video2.adicionaAvaliacao(avaliador3, avaliacao3);
		
		int somaMedias = usuario.totalAvaliacoes();
		
		assertEquals(7, somaMedias);
	}
	
}
