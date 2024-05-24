package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.exceptions.ConversionErrorException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    private String name;
    private int releaseYear;
    private boolean planIncludes;
    private double scoreSum;
    private int totalReviews;
    private int durationInMinutes;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(OmdbTitle omdbTitle) {
        this.name = omdbTitle.title();

        if(omdbTitle.year().length() > 4){
            throw new ConversionErrorException("Could not convert the release Year: it have more than 4 characters");
        }

        this.releaseYear = Integer.parseInt(omdbTitle.year());
        this.durationInMinutes = Integer.parseInt(omdbTitle.runtime().substring(0,2));
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncludes() {
        return planIncludes;
    }

    public double getScoreSum() {
        return scoreSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPlanIncludes(boolean planIncludes) {
        this.planIncludes = planIncludes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displaysTechnicalSheet(){
        System.out.println(STR."""
                Title: \{name}
                Release Year: \{releaseYear}
                Rating: \{scoreSum} (\{totalReviews} votes)
                Duration: \{durationInMinutes / 60}

                """);
    }

    public void review(double grade){
        scoreSum += grade;
        totalReviews++;
    }

    public double totalScore(){
        return scoreSum / totalReviews;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return STR."""
                Title: \{name}
                Release Year: \{releaseYear}
                Duration: \{durationInMinutes} min
                """;
    }
}
