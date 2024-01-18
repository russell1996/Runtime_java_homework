package hm_1_1;

import java.util.Scanner;

public class task30_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество ступенек: ");
        int step = s.nextInt();
        int counter = 1;
        for (int i = counter; i <= step; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
