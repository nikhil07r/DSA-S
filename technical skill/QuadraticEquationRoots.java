import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;
        System.out.println("Discriminant = " + D);

        if (D > 0) {
            System.out.println("Roots are Real and Distinct");
        } else if (D == 0) {
            System.out.println("Roots are Real and Equal");
        } else {
            System.out.println("Roots are Imaginary");
        }
    }
}
