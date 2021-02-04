package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    abstract void setLength(double length);
    abstract void setWidth(double width);

//    @Override
//    public double getPerimeter() {
//        return 2 * (length+width);
//    }
}
