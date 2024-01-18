package hm_1_1;

import java.util.Scanner;

public class lesson3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = s.nextInt();
        int factorial = 1;
        for (int f = 1; f <= number; f++) {
            factorial *= f;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (i * number));
        }
        if (number <= 1) {
            System.out.println("Введенное число " + number + " не является простым числом");
        } else if (number <= 3) {
            System.out.println("Введенное число " + number + " является простым числом");
        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("Введенное число " + number + " не является простым числом");
        } else {
            System.out.println("Введенное число " + number + " является простым числом");
        }
        System.out.println("Факториал числа " + number + " = " + factorial);
    }
}