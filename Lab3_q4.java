/** Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object.
Input:  Mention various subtract method having different parameters. 
Output: Subtract method will display the result accordingly */
public class Lab3_q4 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        overloadSub obj = new overloadSub();
        System.out.println("Subtraction of two numbers (10-5): " + obj.subtract(10, 5));
        System.out.println("Subtraction of three numbers (10-5-2): " + obj.subtract(10, 5, 2));
        System.out.println("Subtraction of two numbers (10.5-5.5): " + obj.subtract(10.5, 5.5));
        System.out.println("Subtraction of two numbers (10L-5L): " + obj.subtract(10L, 5L));
        System.out.println("Subtraction of two numbers (10S-5S): " + obj.subtract(10, 5));
        System.out.println("Subtraction of two numbers (10.5D-5.5D): " + obj.subtract(10.5, 5.5));
    }
}
