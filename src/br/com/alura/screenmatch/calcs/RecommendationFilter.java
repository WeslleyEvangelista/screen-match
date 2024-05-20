package br.com.alura.screenmatch.calcs;

public class RecommendationFilter {
    public void filter(ScoreCalculator scoreCalculator){
        if (scoreCalculator.getscore() >= 4){
            System.out.println("It's one of the favorites at the moment.");
        } else if (scoreCalculator.getscore() >= 2){
            System.out.println("Very well rated.");
        } else {
            System.out.println("Put it on your list to watch later.");
        }
    }
}
