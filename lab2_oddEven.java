/** Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
Input: Enter 10 number from keyboard 
Output: Display number of even and odd number */
public class lab2_oddEven {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Usage: java oddEven <num1> <num2> <num3> <num4> <num5> <num6> <num7> <num8> <num9> <num10>");
            return;
        }
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
    }
}
