package computerDetails;

public class Main {

    public static void main(String[] args) {
        ComputerCase theCase=new ComputerCase("2208","Dell","240");
        Monitor theMonitor=new Monitor("Beast","Acer",27,"2540x420");
        MotherBoard theMotherBoard=new MotherBoard("BJ-200","Asus",4,6,"v2.404");
        PersonalComputer thePC=new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherBoard);
        thePC.powerUp();

    }
}
