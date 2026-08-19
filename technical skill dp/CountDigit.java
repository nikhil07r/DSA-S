import java.util.Scanner;

class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        // Special case: 0 has 1 digit
        if (temp == 0) {
            count = 1;
        } else {
            // Keep dividing by 10 until the number becomes 0
            while (temp != 0) {
                temp = temp / 10; // Removes the last digit
                count++; // Increases digit count
            }
        }

        System.out.println("Number of digits in " + n + " is: " + count);
    }
}