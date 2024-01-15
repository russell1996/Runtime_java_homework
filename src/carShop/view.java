package carShop;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CarRentalService c = new CarRentalService();
        System.out.printf("Введите класс автомобиля для аренды \"Эконом\", \"Бизнес\", \"Премиум\": ");
        String carClass = s.nextLine();
        System.out.printf("Введите количество дней для аренды: ");
        int days = s.nextInt();
        int price = c.calculateRentalPrice(carClass, days);
        System.out.println("Общая стоимость аренды в тенге: " + price);
        System.out.println();
        s.nextLine();
        System.out.print("Введите регион доставки автомобиля \"Город\", \"Ближний регион\", \"Дальний регион\": ");
        String region = s.nextLine();
        double taxRate = c.calculateTax(region, price);
        System.out.println("Стоимость доставки в тенге: " + c.calculateDeliveryCost(region));
        System.out.println();
        System.out.println("Сумма налога в тенге: " + taxRate);
        double totalSum = c.processRentalOrder(carClass, days, region);
        System.out.println();
        System.out.println(c.sale(days));
        System.out.println("Итоговая стоимость аренды в тенге: " + totalSum);

    }
}
