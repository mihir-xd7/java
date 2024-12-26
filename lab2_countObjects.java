/** Program to find no. of objects created out of a class using ‘static’ modifier.
Input:  No of objects created 
Output: Display the number of objects created (e.g. no of objects=3) */
import java.util.Scanner;
public class lab2_countObjects {
    static int count = 0;

    public lab2_countObjects() {
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Number of objects to create: ");
        int n = sc.nextInt();
        lab2_countObjects[] obj = new lab2_countObjects[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new lab2_countObjects();
        }
        System.out.println("No of objects created: " + count);
        sc.close();
    }
}
