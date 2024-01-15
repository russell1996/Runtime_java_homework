import java.util.Random;
import java.util.Scanner;

public class task30_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите начальный диапазон: ");
        int start = s.nextInt();
        System.out.print("Введите конечный диапазон: ");
        int stop = s.nextInt();
        int generatedNumber = random.nextInt(start, stop);
        System.out.print("Сколько попыток хотите дать? ");
        int attempts = s.nextInt();
        int attempt = 0;
        System.out.print("Угадайте число от " + start + " до " + stop + ": ");
        while (attempt < attempts) {
            attempt++;
            int input = s.nextInt();
            if (input == generatedNumber) {
                System.out.println("Вы угадали число");
                break;
            } else if (attempt < attempts) {
                System.out.print("Заданное число " + (generatedNumber > input ? "БОЛЬШЕ" : "МЕНЬШЕ") + " (осталось попыток " + (attempts - attempt) + "): ");
            } else {
                System.out.println("Вы не смогли угадать число!");
                System.out.println("Заданное число: " + generatedNumber);
            }
        }
    }
}