package carType;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Tata Nexon");
        runRace(car);

        Car ferrari=new GasPoweredCar("GTA Ferrari",15.4,6 );
        runRace(ferrari);

        Car tesla=new ElectricCar("Tesla 16MX",78.9,300);
        runRace(tesla);
        Car mercedes=new HybridCar("Mercedes Hybrid 12M",34,8,26);
        runRace(mercedes);

    }
    public  static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
