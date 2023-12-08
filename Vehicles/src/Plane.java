public class Plane extends  Vehicle{
    private String fuel;

    public Plane( Manufacturer nameManufacturer, String fuel) {
        super("My plane", nameManufacturer);
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
        return 500;
    }

    public void take_off() {
        System.out.println("Taking off ....");
    }
    public void Landing() {
        System.out.println("Landing ....");
    }

}
