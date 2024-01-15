package Massive;

public class EvenOddCounter {
    public static void main(String[] args) {
        int[] data = {4, 7, 9, 12, 15, 16};
        int even = 0;
        int odd = 0;
        for (int i : data) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
