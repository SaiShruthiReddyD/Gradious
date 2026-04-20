// Abstract class
abstract class ProductLine {

    // Abstract methods
    public abstract void produce_item();
    public abstract double calculate_production_cost();
}

// ElectronicsLine subclass
class ElectronicsLine extends ProductLine {

    // Property
    private int number_of_units;

    // Getter
    public int getNumber_of_units() {
        return number_of_units;
    }

    // Setter
    public void setNumber_of_units(int number_of_units) {
        this.number_of_units = number_of_units;
    }

    // Implement abstract method
    @Override
    public void produce_item() {
        System.out.println("Producing " + number_of_units + " electronic units.");
    }

    // Implement abstract method
    @Override
    public double calculate_production_cost() {
        double costPerUnit = 500.0;
        return number_of_units * costPerUnit;
    }
}

// FurnitureLine subclass
class FurnitureLine extends ProductLine {

    // Property
    private String wood_type;

    // Getter
    public String getWood_type() {
        return wood_type;
    }

    // Setter
    public void setWood_type(String wood_type) {
        this.wood_type = wood_type;
    }

    // Implement abstract method
    @Override
    public void produce_item() {
        System.out.println("Producing furniture using " + wood_type + " wood.");
    }

    // Implement abstract method
    @Override
    public double calculate_production_cost() {
        double baseCost = 2000.0;

        if (wood_type.equalsIgnoreCase("Teak")) {
            return baseCost + 1500;
        } else if (wood_type.equalsIgnoreCase("Oak")) {
            return baseCost + 1000;
        } else {
            return baseCost + 500;
        }
    }
}

public class ManufacturingManagementSystem {

    public static void main(String[] args) {

        ElectronicsLine electronics = new ElectronicsLine();
        electronics.setNumber_of_units(10);

        electronics.produce_item();
        System.out.println("Electronics Production Cost: " +
                electronics.calculate_production_cost());

        System.out.println("------------------------------");
        FurnitureLine furniture = new FurnitureLine();
        furniture.setWood_type("Teak");

        furniture.produce_item();
        System.out.println("Furniture Production Cost: " +
                furniture.calculate_production_cost());
    }
}
