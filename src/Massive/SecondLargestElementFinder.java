package Massive;

public class SecondLargestElementFinder {
    public static void main(String[] args) {
        int[] data = {3, 7, 4, 8, 5};
        int min = 0;
        int max = 0;
        for (int i : data) {
            if (i > min) {
                max = min;
                min = i;
            } else if (i > max && i < min) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
