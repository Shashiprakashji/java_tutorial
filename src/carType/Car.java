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


