package Massive;

import java.util.Arrays;

public class MassiveElements {
    public static void main(String[] args) {
        int[] numbersArray = {3, 5, 6, 9, 12, 17};
        int sum = 0;
        for (int j : numbersArray) {
            if (j % 3 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
