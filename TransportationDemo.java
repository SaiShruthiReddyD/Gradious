//base class
class Vehicle{
    public void start_engine(){
        System.out.println("Vehicle engine is starting");
    }
    public void stop_engine(){
        System.out.println("Vehicle engine stopped");
    }
    public void display_info(){
        System.out.println("This is vehicle");
    }
}

//car subclass
class Car extends Vehicle {
    int number_of_doors;
    Car(int number_of_doors) {
        this.number_of_doors = number_of_doors;
    }
    @Override
    public void start_engine() {
        System.out.println("Car engine is starting");
    }
    @Override
    public void stop_engine() {
        System.out.println("Car engine stopped");
    }
    @Override
    public void display_info() {
        System.out.println("This Car has " +number_of_doors+" doors");
    }
}

//bicycle subclass
class Bicycle extends Vehicle {
    String type;
    Bicycle(String type) {
        this.type=type;
    }
    @Override
    public void start_engine() {
        System.out.println("Bicycle engine is starting");
    }
    @Override
    public void stop_engine() {
        System.out.println("Bicycle engine stopped");
    }
    @Override
    public void display_info() {
        System.out.println("This Bicycle is of " +type+" type");
    }
}
//main
public class TransportationDemo {
    public static void main(String[] args) {
        System.out.println("Car object");
        Car c = new Car(4);
        c.start_engine();
        c.display_info();
        c.stop_engine();
        System.out.println("---------------------------------");

        System.out.println("Bicycle object");
        Bicycle b= new Bicycle("Mountain");
        b.start_engine();
        b.display_info();
        b.stop_engine();
        System.out.println("---------------------------------");

        Vehicle v1 = new Car(2);
        Vehicle v2 = new Bicycle("Road"); 
        v1.start_engine();
        v1.display_info();
        v1.stop_engine();

        System.out.println("---------------------------------");

        v2.start_engine();
        v2.display_info();
        v2.stop_engine();
    }
}
