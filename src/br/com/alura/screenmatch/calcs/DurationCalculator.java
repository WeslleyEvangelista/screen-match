package br.com.alura.screenmatch.calcs;
import br.com.alura.screenmatch.models.Title;

public class DurationCalculator {
    private int totalDuration;

    public int getTotalDuration() {
        return this.totalDuration;
    }

    public  void includes(Title title) {
        this.totalDuration += title.getDurationInMinutes();
    }
}
