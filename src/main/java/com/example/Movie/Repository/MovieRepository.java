package com.example.Movie.Repository;

import com.example.Movie.Model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository <Movie, Integer> {
}
