package hm_1_1;

public class Practice2 {

    public static void main(String[] args) {
        int money = 2500; // Деньги на корм
        int foodPerDay = 500; // Стоимость пачки корма
        int days = 0;
        for (int i = money - foodPerDay; i >= 0; i -= foodPerDay) {
            int period = 3;
            System.out.println("На " + (days += period) + "-й день останется " + i + " тенге.");
        }
        System.out.println("Денег хватит на " + days + " дней.");
    }
}
