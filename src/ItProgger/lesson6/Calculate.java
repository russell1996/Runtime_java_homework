package ItProgger.lesson6;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = s.nextInt();
        System.out.print("Введите значение (*, /, +, -): ");
        String symbol = s.next();
        System.out.print("Введите второе число: ");
        int num2 = s.nextInt();
        int result;
        switch (symbol) {
            case "+": result = num1+num2;
                System.out.println(result);
                break;
            case "/": result = num1/num2;
                System.out.println(result);
                break;
            case "*": result = num1*num2;
                System.out.println(result);
                break;
            case "-": result = num1-num2;
                System.out.println(result);
                break;
        }

    }
}
