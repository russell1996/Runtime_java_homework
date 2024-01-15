package polymorphism.homework18_12;

public class Series extends Movie {
    private int seriesCount;

    public int getSeriesCount() {
        return seriesCount;
    }

    public void setSeriesCount(int seriesCount) {
        this.seriesCount = seriesCount;
    }

    public Series(String title, int releaseYear, double rating, int duration, int seriesCount) {
        super(title, releaseYear, rating, duration);
        this.seriesCount = seriesCount;
    }
}
