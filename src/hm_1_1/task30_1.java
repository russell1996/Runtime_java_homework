package hm_1_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class task30_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите кол-во фильмов: ");
        int quantityFilm = s.nextInt();
        DecimalFormat df = new DecimalFormat("#.##");
        double count = 0;
        for (int i = 1; i <= quantityFilm; i++) {
            System.out.print("Введите продолжительность фильма " + i + " в минутах: ");
            double durationFilm = s.nextInt();
            count += durationFilm;
        }
        System.out.println("Общее продолжительность в часах: " + df.format(count / 60));
    }
}
