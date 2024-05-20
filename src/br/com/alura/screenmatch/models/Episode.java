package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calcs.ScoreCalculator;

public class Episode implements ScoreCalculator {
    private int number;
    private String name;
    private Series series;
    private int totalReviews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series seriess) {
        this.series = series;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    @Override
    public int getscore() {
        if (totalReviews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
