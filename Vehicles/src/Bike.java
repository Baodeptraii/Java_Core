public class Bike extends Vehicle{
    public Bike( Manufacturer nameManufacturer) {
        super("My bike", nameManufacturer);
    }


    @Override
    public double getSpeed() {
        return 20;
    }
}
