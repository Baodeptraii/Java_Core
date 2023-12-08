public class Main {
    public static void main(String[] args) {
        Manufacturer h1 = new Manufacturer("Toyota", "Korea");
        Manufacturer h2 = new Manufacturer("Honda", "Japan");
        Manufacturer h3 = new Manufacturer("Vinfast", "Viet Nam");

        Vehicle bike = new Bike(h1);
        Vehicle car = new Car(h2,"gas");
        Plane plane = new Plane(h3,"oil");

        System.out.println(bike.nameVehicle);
        System.out.println(bike.getSpeed());
        System.out.println(car.getSpeed());
        System.out.println(plane.getSpeed());
        plane.Landing();
        bike.Start();
        car.Stop();


    }
}
