package com.stackroute.domain;

public class Movie {
    Actor actor;
    private String movieName;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void displayMovieinfo(){
        System.out.println("Movie Name is:"+ movieName+ "Actor name is: "+ actor.getName());
    }
}
