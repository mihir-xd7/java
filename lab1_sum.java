import java.util.Scanner;

public class lab1_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter two numbers:");
        System.out.print("num1: "); 
        n1 = sc.nextInt();
        System.out.print("num2: "); 
        n2 = sc.nextInt();
        System.out.printf("%d + %d = %d%n", n1, n2, n1 + n2);
        sc.close();
    }
}
