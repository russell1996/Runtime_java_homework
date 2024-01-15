package polymorphism.homework18_13;

public class Cars {
    // Поля класса
    private String make; // Марка автомобиля
    private String model; // Модель автомобиля
    private int year; // Год выпуска
    private String color; // Цвет автомобиля

    // Конструктор класса
    public Cars(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Геттеры и сеттеры для доступа к полям
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод для отображения информации об автомобиле
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void displayAllCars(Cars[] cars){
        for (Cars car : cars) {
            car.displayInfo();
            System.out.println();
        }
    }

    // Пример использования

}

