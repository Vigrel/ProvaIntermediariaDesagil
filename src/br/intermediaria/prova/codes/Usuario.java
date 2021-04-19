package br.intermediaria.prova.codes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Video postaVideo(int id, Produto produto) {
		Usuario video_user = new Usuario(this.nome);
		Video video = new Video(id,video_user, produto);
		
		videos.add(video);
		return video; 
	}
	
	public int totalAvaliacoes() {
		int total = 0;
		for(Video video: videos) {
			total += video.mediaAvaliacoes();
		}
		return total;
	}
}
