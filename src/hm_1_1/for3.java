package hm_1_1;

public class for3 {
    public static void main(String[] args) {
        int days = 5;
        int moneyPerDay = 200;
        int sum = 0;
        for (int i = 1; i <= days; i++) {
            sum = i * moneyPerDay;
            System.out.println("День " + i + ". " + "Уже " +  sum + " тенге.");
        }
    }
}
