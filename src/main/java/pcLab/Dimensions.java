package pcLab;

public class Dimensions {

    private int height;
    private int depth;
    private int width;



    public Dimensions(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }


    public Dimensions() {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    @Override
    public String toString() {
        return "Dimensions{" +
                "height=" + height +
                ", depth=" + depth +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getDepth() {
        return depth;
    }

}



