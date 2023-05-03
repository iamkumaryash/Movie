package com.example.Movie.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String MovieName;
    private double TicketCost;
    private String MovieGenre;
    private String MovieHall;

    @ElementCollection
    private List<String> starCast;

    public Movie(){
    }

    public Movie(String MovieName, double TicketCost, String MovieGenre, String MovieHall, List<String> starCast){
        this.MovieName= MovieName;
        this.TicketCost= TicketCost;
        this.MovieGenre= MovieGenre;
        this.MovieHall= MovieHall;
        this.starCast = starCast;
    }

    public float getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public double getTicketCost() {
        return TicketCost;
    }

    public void setTicketCost(double ticketCost) {
        TicketCost = ticketCost;
    }

    public String getMovieGenre() {
        return MovieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        MovieGenre = movieGenre;
    }

    public String getMovieHall() {
        return MovieHall;
    }

    public void setMovieHall(String movieHall) {
        MovieHall = movieHall;
    }

    public List<String> getStarCast() {
        return starCast;
    }

    public void setStarCast(List<String> starCast) {
        this.starCast = starCast;
    }
}
