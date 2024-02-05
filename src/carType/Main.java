package carType;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Tata Nexon");
        runRace(car);
    }
    public  static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
