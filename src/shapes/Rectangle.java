package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * this.width) + (2 * this.length);
    }
}
