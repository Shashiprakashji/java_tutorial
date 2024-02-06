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
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas: usage exceeds the average: %.2f %n",avgKMPerLitre);
    }
}
    class ElectricCar extends Car{
        private double avgKMPerCharge;
        private  int batterySize=6;

        public ElectricCar(String description) {
            super(description);
        }

        public ElectricCar(String description, double avgKMPerCharge, int batterySize) {
            super(description);
            this.avgKMPerCharge = avgKMPerCharge;
            this.batterySize = batterySize;
        }

        @Override
        public void startEngine() {
            System.out.printf("Electric: switch %d is on Ready %n",batterySize);
        }

        @Override
        protected void runEngine() {
            System.out.printf("Electric: usage under avg %.2f %n ",avgKMPerCharge);
        }
    }
    class HybridCar extends Car{
        private double avgKmPerLiter;
        private int cylinders = 6;

        private int batterySize;

        public HybridCar(String description) {
            super(description);
        }

        public HybridCar(String description, double avgKmPerLiter, int cylinders,
                         int batterySize) {
            super(description);
            this.avgKmPerLiter = avgKmPerLiter;
            this.cylinders = cylinders;
            this.batterySize = batterySize;
        }
        @Override
        public void startEngine() {
            System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
            System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
        }

        @Override
        protected void runEngine() {
            System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
        }
    }


