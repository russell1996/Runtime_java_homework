package polymorphism.homework18_13;

public class CarType extends Cars {
    private String carType;

    public CarType(String make, String model, int year, String color, String carType) {
        super(make, model, year, color);
        this.carType = carType;
    }
    public void displayAllCars(){
       super.displayInfo();
        System.out.println("Car Type: " + carType);
    }
}
