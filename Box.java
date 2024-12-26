public class Box {
    double length;
    double width;
    double height;

    // Constructor to initialize the dimensions of the box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return the volume of the box
    public double getVolume() {
        return length * width * height;
    }
}
