package com.iftm.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iftm.moviecatalogservice.models.CatalogItem;
import com.iftm.moviecatalogservice.models.Movie;
import com.iftm.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		// 1) Obter todos os Movies IDs;
		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users" + userId,
				UserRating.class);

		return userRating.getRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
					Movie.class);
			return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
		}).collect(Collectors.toList());

	}

}
