package carType;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Tata Nexon");
        runRace(car);

        Car ferrari=new GasPoweredCar("GTA Ferrari",15.4,6 );
        runRace(ferrari);

    }
    public  static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
