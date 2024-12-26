import java.util.Scanner;
public class Lab3_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter length: "); r.length = sc.nextInt();
        System.out.print("Enter width: "); r.width = sc.nextInt();
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        sc.close();
    }
}
