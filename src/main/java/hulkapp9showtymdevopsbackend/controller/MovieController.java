package hulkapp9showtymdevopsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hulkapp9showtymdevopsbackend.MovieRepo.MovieRepository;
import hulkapp9showtymdevopsbackend.entities.Movies;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	
	@GetMapping("/")
	public ResponseEntity getMovie()
	{
		return ResponseEntity.ok(this.movieRepository.findAll());
	}
	
	//create movie rest api

		@PostMapping("/")
		public Movies createMovies(@RequestBody Movies movie)
		{
			return movieRepository.save(movie);
			
		}

}
