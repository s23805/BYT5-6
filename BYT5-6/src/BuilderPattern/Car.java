package BuilderPattern;

public class Car {
    private String model;
    private String color;
    private int year;
    private String engine;

    private Car() {
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    static class CarBuilder {
        private Car car;

        CarBuilder() {
            this.car = new Car();
        }

        CarBuilder setModel(String model) {
            car.model = model;
            return this;
        }

        CarBuilder setColor(String color) {
            car.color = color;
            return this;
        }

        CarBuilder setYear(int year) {
            car.year = year;
            return this;
        }

        CarBuilder setEngine(String engine) {
            car.engine = engine;
            return this;
        }

        Car build() {
            return car;
        }
    }
}
