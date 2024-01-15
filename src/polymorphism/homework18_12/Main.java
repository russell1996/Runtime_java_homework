package polymorphism.homework18_12;

public class Main {
    public static void main(String[] args) {
        Streaming streaming = new Streaming(5);

        Series series = new Series("Во все тяжкие", 2008, 9.5, 50, 5);
        Movie movie = new Movie("Побег из шоушенка", 1994, 9.3, 142);

        streaming.add(series);
        streaming.add(movie);
        //streaming.play(movie);
        Streaming[] streamings = {streaming};
        // Streaming.displayAll(streamings);
        streaming.displayAllMovies(movie);
        streaming.displayAllMovies(series);
    }
}
