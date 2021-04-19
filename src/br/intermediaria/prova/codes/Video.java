package br.intermediaria.prova.codes;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario, Integer>avaliacoes; 
	
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void adicionaAvaliacao(Usuario user, int nota) {
		if (user.getNome() != usuario.getNome() ) {
			if (nota >= 1 && nota <= 5) {
				avaliacoes.put(user, nota);
			}
		}
	} 
	
	public int mediaAvaliacoes() {
		int total = 0;
		for(Integer num: avaliacoes.values()) {
			total += num;
		}
		
		if(avaliacoes.size() == 0) {
			return 0;
		}
		
		int somaMedias = (int) Math.round(total/((double) avaliacoes.size()));
		return somaMedias;
	}
	

}

