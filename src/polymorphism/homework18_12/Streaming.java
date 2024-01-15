package polymorphism.homework18_12;


public class Streaming {

    private Media[] media;
    private Movie[] movie;
    private int seriesCount;
    private int moviesCount;


    public Streaming(int size) {
        media = new Media[size];
    }



    ;

    public Media[] getMedia() {
        return media;
    }

    public Movie[] getMovie() {
        return movie;
    }

    void add(Media media) {
        if (media instanceof Series) {
            seriesCount++;
        } else if (media instanceof Movie) {
            moviesCount++;
        }

        for (int i = 0; i < this.media.length; i++) {
            if (this.media[i] == null) {
                this.media[i] = media;
                return;
            }
        }
    }

    public void play(Media media) {
        if (media instanceof Series series) {
            System.out.println("Проигрываем сериал с названием " + series.getTitle());
            System.out.println("Рейтинг: " + series.getRating());
            System.out.println("Год выпуска: " + series.getReleaseYear());
            System.out.println("Количество серий: " + series.getSeriesCount());
            System.out.println("Общая продолжительность: " + series.getDuration());
        } else if (media instanceof Movie movie) {
            System.out.println("Проигрываем фильм с названием " + movie.getTitle());
            System.out.println("Рейтинг: " + movie.getRating());
            System.out.println("Год выпуска: " + movie.getReleaseYear());
            System.out.println("Продолжительность: " + movie.getDuration());
        }
    }
    public void displayAllMovies(Movie movie) {
        System.out.println("Название: " + movie.getTitle());
        System.out.println("Рейтинг: " + movie.getRating());
        System.out.println("Год выпуска: " + movie.getReleaseYear());
        System.out.println("Продолжительность: " + movie.getDuration());
        System.out.println();
    }

    public static void displayAll(Streaming[] streamings) {
        for (Streaming streaming : streamings) {
            for (Media media : streaming.getMedia()) {
                if (media != null) {
                    streaming.play(media);
                    System.out.println();
                }
            }
        }
    }


    }







