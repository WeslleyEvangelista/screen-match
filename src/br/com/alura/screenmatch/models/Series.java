package br.com.alura.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;
    private boolean active;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

  @Override
  public int getDurationInMinutes() {
      return seasons * episodesPerSeason * minutesPerEpisode;
  }

    @Override
    public String toString() {
        return STR."Series: \{getName()} (\{getReleaseYear()})";
    }
}
