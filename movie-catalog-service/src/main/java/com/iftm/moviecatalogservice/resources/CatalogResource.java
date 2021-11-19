package com.iftm.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iftm.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		RestTemplate restTemplate = new RestTemplate();

			// 1) Obter todos os Movies IDs;
		List<Rating> ratings = Arrays.asList(new Rating("12", 5), new Rating("15", 8));

		return ratings.stream().map(rating -> {

			// 2) Para cada Movie ID, chamar Movie Info Service e Get Details;
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Filmão", rating.getRating());

			// 3) Colocar tudo junto.
		}).collect(Collectors.toList());

	}

}
