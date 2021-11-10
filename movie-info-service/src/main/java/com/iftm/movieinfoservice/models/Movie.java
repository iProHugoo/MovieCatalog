package com.iftm.movieinfoservice.models;

public class Movie {

	private String movieId;
	private String nome;

	// Aqui Indica Como Esta Classe Poderá Ser Acessada
	public Movie(String movieId, String nome) {
		super();
		this.movieId = movieId;
		this.nome = nome;
	}

	// Indica Como Gerar um Objeto Vazio Dessa Classe Que Depois Será Populado
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Aqui Temos os Métodos Para Pegar (GET) e Setar (SET) as Informações
	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
