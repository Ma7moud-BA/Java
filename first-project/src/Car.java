public class Car extends Vehicle {

    private String model;
    public int doors;

    public Car(String name, String model, String color, int doors) {
        super(name, color);
        this.model = model;
        this.doors = doors;
    }

    // defaulting the doors to 4
    public Car(String name, String model, String color) {
        super(name, color);
        this.model = model;
        this.doors = 4;
    }

    // this will allow you to make a default car if no parameters where passed
    public Car() {
        this("name", "model", "color", 4);
    }

    // since the model declared as private you cant access them outside
    // this class so we need getters

    //////////
    // getter
    public String getModel() {
        return model;
    }

    // setter
    public void setModel(String model) {
        this.model = model;
    }

    ///

}

class Vehicle {
    private String name;
    private String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void move() {
        System.out.println("The Car" + this.name + "is moving");
    }

    public void stop() {
        System.out.println("The Car" + this.name + "stopped");
    }

    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return name;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }

    // ths static keyword makes this method belongs to the Vehicle class it self not for an instance of it
    public static void displayData() {
        System.out.println("Displaying Data...");
    }
}

class Plane extends Vehicle {
    private String engine;

    public Plane(String name, String color, String engine) {
        super(name, color);
        this.engine = engine;
    }

}