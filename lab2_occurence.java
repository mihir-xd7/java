/** Find the no. of occurrence of each element in a user entered list of nos.
Input: Enter list of numbers  e.g.( 15 25 15 11 25 32 15 32)  
Output: Occurrence of 15=3
Occurrence of 25=2
Occurrence of 11=1
Occurrence of 32=2 */
import java.util.Scanner;
public class lab2_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int[] count = new int[100];
        System.out.println("Enter integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        for (int j = 0; j < count.length; j++) {
            if (count[j] != 0)
                System.out.println("Occurrence of " + j + "=" + count[j]);
        }
        sc.close();
    }
}