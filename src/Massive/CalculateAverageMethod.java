package Massive;

class CalculateAverageMethod {
    static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return  (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10};
        double average = calculateAverage(array);
        System.out.println("Среднее значение: " + average);
    }
}
