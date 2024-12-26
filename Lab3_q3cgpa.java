/** Write a program in java to input and display the details of n number of	students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.
Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students. Also display the name of student with lowest cgpa */
import java.util.Scanner;
public class Lab3_q3cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CGPA: ");
            float cgpa = sc.nextFloat();
            students[i] = new Student(roll, name, cgpa);
        }
        float minCgpa = students[0].cgpa;
        String minName = students[0].name;
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minName = students[i].name;
            }
        }
        System.out.println("Details of students:");
        System.out.println("Roll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].roll + "\t" + students[i].name + "\t" + students[i].cgpa);
        }
        System.out.println("Minimum CGPA: " + minCgpa);
        System.out.println("Name of student with lowest CGPA: " + minName);
        sc.close();
    }
}
