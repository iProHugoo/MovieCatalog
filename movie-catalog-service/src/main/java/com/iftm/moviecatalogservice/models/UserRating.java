package com.iftm.moviecatalogservice.models;

import java.util.List;

public class UserRating {

	private List<Rating> userRating;

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRating(List<Rating> userRating) {
		super();
		this.userRating = userRating;
	}

}
