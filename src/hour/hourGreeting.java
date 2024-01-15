package hour;

public class hourGreeting {
    public static void main(String[] args) {
       hourMethod h = new hourMethod();
       h.hours(23);
        System.out.println(h.greeting);
    }
}
