/** WAP to check the number is palindrome or not */
import java.util.Scanner;
public class Lab3_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int rem, rev = 0, temp = num;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (num == rev) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }
        sc.close();
    }    
}
