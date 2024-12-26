public class Rectangle {
    double length;
    double width;

    // constructors
    public Rectangle() {
        this(0,0);
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** accessor methods */
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
