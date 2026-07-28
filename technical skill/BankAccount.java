public class BankAccount {
    double balance = 1000.0;

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

   
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.showBalance();
    }

}
