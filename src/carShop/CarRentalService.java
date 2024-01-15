package carShop;

public class CarRentalService {
    int calculateRentalPrice(String model, int days) {
        int dailyRate = 0;
        switch (model) {
            case "Эконом":
                dailyRate = 10000 * days;
                return dailyRate;
            case "Бизнес":
                dailyRate = 15000 * days;
                return dailyRate;
            case "Премиум":
                dailyRate = 20000 * days;
                return dailyRate;
            default:
                return -1;
        }
    }

    int calculateDeliveryCost(String region) {
        switch (region) {
            case "Город":
                return 0;
            case "Ближний регион":
                return 5000;
            case "Дальний регион":
                return 10000;
            default:
                return -1;
        }
    }

    double calculateTax(String region, double price) {
        double taxRate = 0.0;
        switch (region) {
            case "Город":
                return taxRate = 0.12 * price;
            case "Ближний регион":
                return taxRate = 0.10 * price;
            case "Дальний регион":
                return taxRate = 0.08 * price;
            default:
                return -1;
        }
    }

    double processRentalOrder(String model, int days, String region) {
        int rentalPrice = calculateRentalPrice(model, days);
        int deliveryCost = calculateDeliveryCost(region);
        double tax = calculateTax(region, rentalPrice);
        int totalSum = (int) (rentalPrice + deliveryCost + tax);
        if (days >= 7 && days < 14) {
            totalSum *= 0.95; // 5% скидка
        } else if (days >= 14) {
            totalSum *= 0.90; // 10% скидка
        }

        return totalSum;
    }

    String sale(int days) {
        if (days >= 7 && days < 14) {
            return "5% скидка";
        } else if (days >= 14) {
            return "10% скидка";
        }
        return "";
    }
}


