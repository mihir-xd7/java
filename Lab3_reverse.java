import java.util.Scanner;

/** WAP to print the reverse of a 3 digit number without using any loop */
public class Lab3_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " is " + (num % 10) + ((num / 10) % 10) + ((num / 100) % 10));
        sc.close();        
    }
}
