package com.example.Movie.loader;


import com.example.Movie.Model.Movie;
import com.example.Movie.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MovieLoader {

    @Autowired
    MovieRepository movieRepository;

    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("LOADING DATA");
        movieRepository.saveAll(getData());
        System.out.println("LOADING COMPLETE");
    }

    private List<Movie> getData() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add( new Movie( "PATHAN", 200.00, "action", "one", Arrays.asList("SRK", "DEEPIKA", "JOHN")));
        movieList.add( new Movie( "PK", 200.00, "Comedy", "Two", Arrays.asList("AAMIR", "ANUSHKA", "SUSHANT")));
        movieList.add( new Movie( "KICK", 150.00, "action", "Three", Arrays.asList("SALMAAN", "JAKLENE", "NAWAZUDDIN")));
        movieList.add( new Movie( "MUNNA BHAI", 210.00, "Comedy", "Four", Arrays.asList("SANJAY DUTT", "GRACY SINGH", "ARSHAD WARSI")));
        return movieList;
    }
}