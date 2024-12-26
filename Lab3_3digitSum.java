/** WAP to print the sum of the digits of a 3 digit number without using any loop */
import java.util.*;
public class Lab3_3digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits of " + num + " is " + ((num % 10) + ((num / 10) % 10) + ((num / 100) % 10)));
        sc.close();
    }
}
