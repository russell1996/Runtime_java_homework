package polymorphism.homework18_13;


import static polymorphism.homework18_13.Cars.displayAllCars;
import static polymorphism.homework18_13.CarType.displayAllCars;


public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Toyota", "Camry", 2022, "Blue");
        Cars car2 = new Cars("Mitsubishi", "Outlander 3", 2022, "White");
        Cars car3 = new Cars("Chevrolet", "Nexia", 2022, "Black");
        CarType carType = new CarType("Mitsubishi", "Outlander 3", 2022, "White", "Кроссовер");
        Cars[] allCars = {car1, car2, car3};
        CarType[] allCarTypes = {carType};

        Cars.displayAllCars(allCars);
        CarType.displayAllCars(allCarTypes);


    }
}
