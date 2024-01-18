package Homework.Hw_150124_1;

public class TransactionValidator {
    public static final
    int MIN_AMOUNT = 100;
    public static final
    int MAX_AMOUNT = 100000;
    public static boolean isValidAmount(int amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " тг. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " тг. Попробуйте ещё раз!");
            return false;
        } else {
            return true;
        }
    }
}
