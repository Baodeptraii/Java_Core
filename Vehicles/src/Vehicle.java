public abstract class Vehicle {
    protected String nameVehicle;
    protected Manufacturer nameManufacturer;

    public Vehicle(String nameVehicle, Manufacturer nameManufacturer) {
        this.nameVehicle = nameVehicle;
        this.nameManufacturer = nameManufacturer;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public Manufacturer getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(Manufacturer nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public String getMan() {
        return nameManufacturer.getName();
    }

    public void Start() {
        System.out.println("Engine started !!!");
    }

    public void Stop() {
        System.out.println("Engine stopped !!!");
    }

    public void Speedup() {
        System.out.println("Speeding up !!!");
    }

    public abstract double getSpeed();


}
