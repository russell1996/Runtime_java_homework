package Massive;


import java.util.Arrays;

public class ReverseArrayMethod {
    static int[] reverseArray(int[] numbers) {
        int length = numbers.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = numbers[length - 1 - i];
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10};
        int[] reversedArray = reverseArray(array);
        System.out.println("Обратный порядок: " + Arrays.toString(reversedArray));
    }
}
