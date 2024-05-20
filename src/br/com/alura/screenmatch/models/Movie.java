package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.calcs.ScoreCalculator;

public class Movie extends Title implements ScoreCalculator {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getscore() {
        return (int) (totalScore() / 2);
    }

    @Override
    public String toString() {
        return STR."Movie: \{getName()} (\{getReleaseYear()})";
    }
}
