import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                hasUpper = true;
            else if (ch >= 'a' && ch <= 'z')
                hasLower = true;
            else if (ch >= '0' && ch <= '9')
                hasDigit = true;
            else
                hasSpecial = true;
        }

        if (pass.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong");
        } else if (pass.length() >= 8 && ((hasUpper && hasLower) || (hasDigit && hasLower) || (hasUpper && hasDigit))) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
    }
}