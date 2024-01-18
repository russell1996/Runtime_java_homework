package Homework.Hw_150124_1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        int amount = scanner.nextInt();
        boolean isValid = TransactionValidator.isValidAmount(amount);
        if (isValid == true) {
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " тг. успешно выполнен.");
        }
    }
}