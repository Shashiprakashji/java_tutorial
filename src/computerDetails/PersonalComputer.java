package computerDetails;

public class PersonalComputer {

    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;



    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super();
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 1600, "Red");
    }

    public void powerUp() {
        ComputerCase.pressPowerButton();
        drawLogo();

    }
}
