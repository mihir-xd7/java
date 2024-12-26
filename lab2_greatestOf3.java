/** Find the largest among 3 user entered nos. at the command prompt using Java
Input: Enter three number .
Output: Display the Largest Number */
public class lab2_greatestOf3 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java greatest3 <num1> <num2> <num3>");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println(num3 + " is the largest number");
        }
    }
}