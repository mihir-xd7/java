import java.util.Scanner;

public class lab1_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.printf("%d is Palindrome%n", num);
        } else {
            System.out.printf("%d is not Palindrome%n", num);
        }
        sc.close();
    }

    public static boolean isPalindrome(int n) {
        int p = n, temp = 0;
        while (p > 0) {
            temp = temp * 10 + p % 10;
            p = p / 10;
        }
        return temp == n;
    }
}
