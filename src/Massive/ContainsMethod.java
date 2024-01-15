package Massive;

public class ContainsMethod {
    static boolean contains(int[] numbers, int element) {
        for (int i : numbers) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10};
        int element = 45;
        boolean s = contains(array, element);
        System.out.println(s);

    }

}