package xyz.burgersdev.movies.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.burgersdev.movies.Movie;
import xyz.burgersdev.movies.Repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {

        return movieRepository.findAll();

    }

    public Optional<Movie> singleMovie(String imdbId){

        return movieRepository.findMovieByImdbId(imdbId);

    }

}
