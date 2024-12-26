import java.util.Scanner;

public class Lab3_diag {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3X3 matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j || i==matrix[0].length) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
