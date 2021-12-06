package com.iftm.movieinfoservice.models;

public class Movie {

	private String movieId;
	private String name;
	private String description;

	// Aqui Indica Como Esta Classe Poderá Ser Acessada
	public Movie(String movieId, String name, String description) {
		this.movieId = movieId;
		this.name = name;
		this.description = description;
	}

	// Indica Como Gerar um Objeto Vazio Dessa Classe Que Depois Será Populado
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	// Aqui Temos os Métodos Para Pegar (GET) e Setar (SET) as Informações
	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
