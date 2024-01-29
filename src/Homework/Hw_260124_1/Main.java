package Homework.Hw_260124_1;

import java.io.PrintStream;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        String pizza = "Пицца, 1шт., 310.50";
        String tea = "Чай, 1шт., 60.00";
        String cookies = "Печенье, 1шт., 120.25";

        String[] orders = {pizza, tea, cookies};

        int maxNameLength = 0;
        int maxNameAndQuantityLength = 0;
        for (String order : orders) {
            String[] parts = order.split(", ");
            maxNameLength = parts[0].length();
            maxNameAndQuantityLength = parts[0].length() + parts[2].length();
        }
        double total  = 0.0;
        for (String order : orders) {
            String[] parts = order.split(", ");
            String productName = parts[0];
            String quantity = parts[1];
            double price = Double.parseDouble(parts[2]);
            total +=price;
            System.out.printf("%-" + maxNameLength + "s %s %s\n", productName, quantity, price);

        }
        System.out.printf("%s %" + maxNameAndQuantityLength + "s", "Итог:", total);
    }
}
