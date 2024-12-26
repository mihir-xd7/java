import java.util.Scanner;
public class lab1_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, sec, branch;
        int roll;
        System.out.println("Enter name, roll, section and branch:");
        System.out.printf("name:"); name = sc.nextLine();
        System.out.printf("roll:"); roll = sc.nextInt();
        System.out.printf("section:"); sec = sc.next();
        System.out.printf("branch:"); branch = sc.next();
        System.out.printf("Name: %s\nRoll: %d\nSection: %s\nBranch: %s", name, roll, sec, branch);
        sc.close();
    }
}
