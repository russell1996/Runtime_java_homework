package Massive;

public class MinMaxElements {
    public static void main(String[] args) {
        int[] numbersArray = {2, 9, 4, 5, 7};
        int max = numbersArray[0];
        int min = numbersArray[0];
        for (int i : numbersArray) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(max - min);
    }
}
