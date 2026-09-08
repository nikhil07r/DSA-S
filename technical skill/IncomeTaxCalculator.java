import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income < 250000) {
            tax = 0;
            System.out.println("No Tax");
        } else {
            if (income <= 500000) {
                tax = (income - 250000) * 0.05;
                System.out.println("Tax Slab: 5%");
            } else {
                if (income <= 100000) {
                    tax = (250000 * 0.05) + (income - 500000) * 0.20;
                    System.out.println("Tax Slab: 20%");
                } else {
                    tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
                    System.out.println("Tax Slab: 30%");
                }
            }
        }

        System.out.println("Income = " + income);
        System.out.println("Tax to pay = " + tax);
    }
}
