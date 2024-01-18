package hm_1_1.monthPack;

import java.util.Scanner;

public class monthView {
    public static void main(String[] args) {
        monthMethod m = new monthMethod();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер месяца от 1 до 12: ");
        m.getMonth(s.nextInt());
    }
}
