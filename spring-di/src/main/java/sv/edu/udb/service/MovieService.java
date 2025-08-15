package sv.edu.udb.service;

import sv.edu.udb.domain.Movie;

public interface MovieService {
    Movie findMovieById(final Long id);
}