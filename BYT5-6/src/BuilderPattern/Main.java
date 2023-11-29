package BuilderPattern;

public class Main {

    private static void displayCarDetails(Car car) {
        System.out.println("Car Details:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year: " + car.getYear());
        System.out.println("Engine: " + car.getEngine());
        System.out.println();
    }

    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setModel("Sedan")
                .setColor("Blue")
                .setYear(2022)
                .setEngine("V6")
                .build();

        Car car2 = new Car.CarBuilder()
                .setModel("SUV")
                .setColor("Red")
                .setYear(2023)
                .setEngine("Hybrid")
                .build();

        displayCarDetails(car1);
        displayCarDetails(car2);
    }
}

