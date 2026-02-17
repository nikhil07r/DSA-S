import java.util.Scanner;

public class PrincipalDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[4][4];
        int sum = 0;
        System.out.println("Enter elements of 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nPrincipal Diagonal Elements:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
        }
        System.out.println("\nSum of Principal Diagonal = " + sum);

        sc.close();
    }
}