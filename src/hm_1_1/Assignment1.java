package hm_1_1;

import java.text.DecimalFormat; // получается внутри классов можно вызывать встроенное классы, значит по сути за нас все сделали. Логически значит мы создаем классы чтоб потом их переиспользовать.

public class Assignment1 {
    public static void main(String[] args) {
        double tenges = 150002.7;
        double rateUSD = 463.48;
        double dollars = tenges / rateUSD;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("У вас на счету " + tenges + " тенге. В долларах это " + dollars + " долларов. Так держать!."); // тут по ДЗ
        System.out.println("У вас на счету " + tenges + " тенге. В долларах это " + df.format(dollars) + " долларов. Так держать!."); // тут судя по гуглу я вызвал готовый класс DecimalFormat который реально округляет
        System.out.printf("У вас на счету " + tenges + " тенге. В долларах это " + "%.2f" + " долларов. Так держать!.", dollars); // тут судя по гуглу он просто срезает после точки до 2 строчек
        System.out.println();
    }
}