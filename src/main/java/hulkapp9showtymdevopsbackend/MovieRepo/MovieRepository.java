package hulkapp9showtymdevopsbackend.MovieRepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import hulkapp9showtymdevopsbackend.entities.Movies;

public interface MovieRepository extends MongoRepository<Movies,Long>{

}
