import java.util.Scanner;

class MatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid Matrix - Negative or Zero value");
        } else if (rows == cols) {
            System.out.println("Square Matrix");
        } else {
            System.out.println("Rectangular Matrix");
        }
    }
}