package Massive;

public class FindMaxMethod {
    static int findMax(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            max = number;
        } return max;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10};
        int average = findMax(array);
        System.out.println("Максимальное значение: " + average);
    }
}