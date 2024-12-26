import java.util.Scanner;

public class Lab3_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int[] freq = new int[100];
        System.out.println("Enter integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
        }
        for (int j = 0; j < freq.length; j++) {
            if (freq[j] != 0)
                System.out.println("Occurrence of " + j + "=" + freq[j]);
        }
        sc.close();
    }
}
