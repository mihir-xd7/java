import java.util.Scanner;

/** WAP to print the root of a quadratic equation and check whether the root is imaginary or real */
public class Lab3_quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, root1, root2;
        System.out.print("Enter the value of a: "); a = sc.nextInt();
        System.out.print("Enter the value of b: "); b = sc.nextInt();
        System.out.print("Enter the value of c: "); c = sc.nextInt();
        d = b * b - 4 * a * c;
        if (d > 0) {
            root1 = (-b + (int) Math.sqrt(d)) / (2 * a);
            root2 = (-b - (int) Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (d == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1 = Root 2 = " + root1);
        } else {
            root1 = -b / (2 * a);
            root2 = (int) Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are imaginary");
            System.out.println("Root 1: " + root1 + "i");
            System.out.println("Root 2: " + root2 + "i");
        }
        sc.close();
    }    
}
