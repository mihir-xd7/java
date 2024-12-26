import java.util.Scanner;
public class lab2_matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3X3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < 3; i++) {
            leftSum += matrix[i][i];
            rightSum += matrix[i][2 - i];
        }
        System.out.println("Left=" + leftSum);
        System.out.println("Right=" + rightSum);
        sc.close();
    }
}
