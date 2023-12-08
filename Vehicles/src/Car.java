public class Car extends Vehicle{
    private String fuel;

    public Car( Manufacturer nameManufacturer, String fuel) {
        super("My car", nameManufacturer);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public double getSpeed() {
        return 100;
    }
}
