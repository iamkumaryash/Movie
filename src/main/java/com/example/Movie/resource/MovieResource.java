package com.example.Movie.resource;


import com.example.Movie.Model.Movie;
import com.example.Movie.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Movie.service.MovieServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rest/Movie")
public class MovieResource {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieServiceImpl movieService;

    @PostMapping("/addMovie")
    public void addMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        System.out.println("MOVIE ADDED TO THE DATABASE");
    }

    @GetMapping("/MovieName")
    public Optional<Movie> MovieName(){
        Optional<Movie> s = movieService.movieNameById(1);
        return s;
    }

    @GetMapping("/MovieGenre")
    public List<Movie> MovieGenre() {
        List<Movie> g = movieService.movieByGenre("action");
        return g;
    }

    @GetMapping("/MovieHall")
    public List<Movie> MovieHall() {
        List<Movie> h = movieService.movieHallByMovieName("PATHAN");
        return h;
    }

    @RequestMapping(value = "/MovieName/{id}", method = RequestMethod.GET)
    public Optional<Movie> MovieNameById(@PathVariable("id") int id){
        Optional<Movie> s = movieService.movieNameById(id);
        return s;
    }



}
