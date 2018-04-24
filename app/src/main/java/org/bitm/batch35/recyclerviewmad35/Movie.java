package org.bitm.batch35.recyclerviewmad35;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobile App Develop on 4/19/2018.
 */

public class Movie {
    private int movieImage;
    private String movieName;
    private String movieCategory;

    public Movie(int movieImage, String movieName, String movieCategory) {
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.movieCategory = movieCategory;
    }

    public Movie() {
    }

    public int getMovieImage() {
        return movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public List<Movie> generateMovieList(){
        List<Movie>movies = new ArrayList<>();
        movies.add(new Movie(R.drawable.car,"Titanic","Action/History"));
        movies.add(new Movie(R.drawable.car,"Brave Heart","Action"));
        movies.add(new Movie(R.drawable.car,"Iron Man","Action"));
        movies.add(new Movie(R.drawable.car,"Avengers","Action/Sci-fi"));
        movies.add(new Movie(R.drawable.car,"Iron Man 2","Action/Sci-fi"));
        movies.add(new Movie(R.drawable.car,"Conjouring","Horror"));
        return movies;
    }
}
