package hour;

public class hourMethod {
    String greeting;
    void hours (int hour){

        if (hour >= 0 && hour < 4) {
            greeting = "Доброй ночи!";
        } else if (hour >= 4 && hour < 12) {
            greeting = "Доброе утро!";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Добрый день!";
        } else if (hour >= 18 && hour < 24) {
            greeting = "Добрый вечер!";
        } else {
            greeting = "Некорректное время!";
        }
    }

}
