package pcLab;

public class Monitor {

    Resolution resolution = new Resolution();
    private String model;
    private String manufacturer;

    public Monitor() {

    }

    public Monitor(Resolution resolution, String model, String manufacturer) {
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);

    }
}
