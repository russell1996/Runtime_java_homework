package hm_1_1;

public class for1 {
    public static void main(String[] args) {
        int secondsBeforeStart = 70;

        for (int i = secondsBeforeStart; i >= 0; i -= 7) {
            System.out.println("До старта SpaceY осталось " + i);
        }

        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");
    }
}
