public class Car {
    String model;

    int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
        System.out.println("Car model: " + model + " Car price: " + price);
    }
    public static void startCar() {
        System.out.println("The car has been started");
    };
    public static void stopCar() {
        System.out.println("The car has been stopped");
    }
    public static void moveCar() {
        System.out.println("The car has been moved");
    }
}
