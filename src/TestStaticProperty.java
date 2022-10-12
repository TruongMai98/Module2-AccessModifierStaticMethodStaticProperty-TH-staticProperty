public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "skyactic 3");
        System.out.println(Car.numberOffCars);
        Car car2 = new Car("mazda 1", "skyactic 1");
        System.out.println(Car.numberOffCars);
    }
}
