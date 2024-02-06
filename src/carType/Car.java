package carType;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("car: start engine");
    }
    public void drive(){
        System.out.println("car: drive type is: "+getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("car: run engine");
    }
}
class GasPoweredCar extends Car{
    private double avgKMPerLitre;
    private int cylinders=7;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKMPerLitre, int cylinders) {
        super(description);
        this.avgKMPerLitre = avgKMPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas: all %d cylinders are fired up, Ready %n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas: usage exceeds the average: %.2f %n",avgKMPerLitre);
    }
}
//    class ElectricCar extends Car{
//        private double avgKMPerCharge;
//        private  int batterySize;
//    }
//    class HybridCar extends Car{
//        private double avgKMPerLitre;
//        private  int batterySize;
//        private int cylinders;
//
//    }


