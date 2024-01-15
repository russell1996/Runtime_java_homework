package homework.task_27_12_1;

public class Practice {
    public static void main(String[] args) {
        Bus bus = new Bus(23765);
        String[] passengersTimestamps = new String[]{
                "08:33",
                "09:42",
                "10:43",
                "17:59",
                "18:01",
                "19:15"
        };

        for (int i = 0; i < passengersTimestamps.length; i++) {
            increaseTicketNumber(bus);
            System.out.println("Оплата поездки в " + passengersTimestamps[i]
                    + ". Номер билета: " + bus.ticketNumber++);
        }
    }

    private static void increaseTicketNumber(Bus bus) {
        increase(bus.ticketNumber, 1);
    }

    private static void increase(int numberToIncrease, int increaser) {
        numberToIncrease = numberToIncrease + increaser;
    }
}

class Bus {
    public Bus(int initialNumber) {
        ticketNumber = initialNumber;
    }

    int ticketNumber;
}