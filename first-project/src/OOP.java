public class OOP {
    public static void main(String[] args) {
        Car car = new Car("tesla", "something", "black");
        System.out.println(car.getName());
        System.out.println(car.doors);
        System.out.println(car.getModel());
        car.setModel("something 2");
        System.out.println(car.getModel());

        Plane newPlane = new Plane("plane1", "black", "gg");
        System.out.println(newPlane.getName());

        Vehicle.displayData();
    }
}
