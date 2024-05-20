package br.com.alura.screenmatch.main;
import br.com.alura.screenmatch.calcs.DurationCalculator;
import br.com.alura.screenmatch.calcs.RecommendationFilter;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main() {
        var movie1 = new Movie("The Godfather", 1972);
        DurationCalculator durationCalculator = new DurationCalculator();
        movie1.setPlanIncludes(true);
        movie1.setDurationInMinutes(175);
        movie1.review(8);
        movie1.review(5);
        movie1.review(10);
        movie1.displaysTechnicalSheet();
        durationCalculator.includes(movie1);
        System.out.println(durationCalculator.getTotalDuration());
        System.out.println(movie1.getTotalReviews());
        System.out.println(movie1.totalScore());

        var movie2 = new Movie("Avatar", 2009);
        movie2.setPlanIncludes(true);
        movie2.setDurationInMinutes(162);
        movie2.review(10);
        movie2.review(7);
        movie2.review(9);
        movie2.displaysTechnicalSheet();
        durationCalculator.includes(movie2);
        System.out.println(durationCalculator.getTotalDuration());
        System.out.println(movie2.getTotalReviews());
        System.out.println(movie2.totalScore());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(movie1);
        filter.filter(movie2);

        var series1 = new Series("Game Of Thrones", 2011);
        series1.setActive(false);
        series1.setPlanIncludes(true);
        series1.setSeasons(8);
        series1.setEpisodesPerSeason(9);
        series1.setMinutesPerEpisode(55);

        series1.displaysTechnicalSheet();
        System.out.println(STR."Series duration (minutes): \{series1.getDurationInMinutes()}");

        var episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(series1);
        episode.setTotalReviews(300);
        filter.filter(episode);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        System.out.println(STR."Movie list size: \{movieList.size()} movies.");
        System.out.println(STR."""
                Movies at movie list: \{movieList.getFirst().getName()}, \{movieList.get(1).getName()}.
                """);
    }
}
