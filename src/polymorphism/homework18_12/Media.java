package polymorphism.homework18_12;

public class Media {
    private String title;
    private int releaseYear;

    public Media(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public void add (Media media) {

    }
}


// Media (title, releaseYear)
// Movie extends Media (rating, duration)
// Series extends Movie (seriesCount)

// Streaming(размер)

// Media[] media
// private int amountOfSeries;
// private int amountOfMovies;

// void add(Media media) {
//      при добавлений фильма к счетчику amountOfMovies,
//      прибавляете единицу.
// }


// play(Media media) {
//      Проверка типа media через instanceOf.
//      Если это сериал, выводите с количеством серий
//      и общую продолжительность.
//      Если фильм, выводите рейтинг и год выпуска.

//      Пример с фильмом:
//      Проигрываем фильм с названием ...
//      Рейтинг: ...
//      Год выпуска: ...
//      Продолжительность: ...

//      Пример с сериалом:
//      Проигрываем сериал с названием ...
//      Рейтинг: ...
//      Год выпуска: ...
//      Количество серий: ...
//      Общая продолжительность: ...
//
// }

