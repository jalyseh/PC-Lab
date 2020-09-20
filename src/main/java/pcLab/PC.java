package pcLab;

public class PC {

    private Dimensions dimensions = new Dimensions();
    private Case aCase = new Case();

    @Override
    public String toString() {
        return "PC{" +
                "dimensions=" + dimensions +
                ", aCase=" + aCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }

    private Motherboard motherboard = new Motherboard();
    private Monitor monitor = new Monitor();

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


    public PC(Case aCase, Motherboard motherboard, Monitor monitor) {
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public PC() {

    }

    private void drawLogo(){

        this.monitor.drawPixelAt(6,12,"Green");

    }
    public void description(){

        System.out.println("Welcome to Worst Buy, below is the description of the PC on sale today:" + "\n");
        System.out.println(aCase.toString());
        System.out.println(motherboard.toString());
        System.out.println(monitor.toString());


    }
    public void powerUp(){

        this.aCase.pressPowerButton();
        drawLogo();
        this.motherboard.loadProgram("First Program");
    }

}
