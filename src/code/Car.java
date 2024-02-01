public class Car {
    private final int year;
    private final String make;
    private final String model;

    public Car(final int year,
               final String make,
               final String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public void Drive() {
        System.out.println("Vroom");
    }

    public static void main(final String[] args) {
        Car car = new Car(1963, "corvette", "stingray");
        System.out.println(car.year + " " + car.make + " " + car.model);
        car.Drive();
    }
}
