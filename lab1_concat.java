/** Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name
Input: Enter first name: KIIT
       Enter Second Name: UNIVERSITY
Output: UNIVERSITY KIIT */
public class lab1_concat {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first name:");
        String fname = sc.nextLine();
        System.out.print("Enter second name:");
        String lname = sc.nextLine();
        System.out.println(lname + " " + fname);
        sc.close();
    }
}
