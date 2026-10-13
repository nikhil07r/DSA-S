public class StringManuplation {

    public static void main(String[] args) {
        String s = "Nikhil123";

        if (Character.isLetter(s.charAt(0))
                && !s.contains(" ")
                && s.matches("[a-zA-Z][a-zA-Z0-9]*")) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}

