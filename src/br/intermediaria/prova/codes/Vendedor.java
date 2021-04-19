package br.intermediaria.prova.codes;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
	private List<Produto> produtos;
	
	public Vendedor(List<Produto> produtos, String nome) {
		super(nome);
		this.produtos = new ArrayList<>();
	}
	
	public void cadastraProduto(String nome, double preco) {
		Produto produto = new Produto(nome, preco);
		produtos.add(produto);
	}
}
