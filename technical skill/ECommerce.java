// 1. The E-Commerce Discount Hierarchy • Scenario: You are designing a tiered discount system. The base class Customer defines a method calculateBill(double amount). Subclasses RegularCustomer, PrimeCustomer, and CorporateCustomer override this method. • Challenge: Inside CorporateCustomer's overridden method, write a nested if-else logic where if the amount > ₹50,000 and the corporate tier is "Platinum", they get an additional 15% flat discount on top of the baseline calculation fetched via super.calculateBill(). Trace what happens if a Customer reference points to a CorporateCustomer object at runtime. 

public class ECommerce {

    public static void main(String[] args) {

        // Runtime polymorphism
        Customer customer = new CorporateCustomer("Platinum");

        double amount = 60000;

        double finalBill = customer.calculateBill(amount);

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Final Bill: ₹" + finalBill);
    }
}

class Customer {

    double calculateBill(double amount) {
        // Basic 10% discount for all customers
        return amount * 0.90;
    }
}

class RegularCustomer extends Customer {

    @Override
    double calculateBill(double amount) {
        return amount;
    }
}

class PrimeCustomer extends Customer {

    @Override
    double calculateBill(double amount) {
        // 5% discount
        return amount * 0.95;
    }
}

class CorporateCustomer extends Customer {

    String tier;

    CorporateCustomer(String tier) {
        this.tier = tier;
    }

    @Override
    double calculateBill(double amount) {

        // Get baseline bill from Customer class
        double bill = super.calculateBill(amount);

        // Nested if-else
        if (amount > 50000) {

            if ("Platinum".equals(tier)) {
                // Additional 15% discount
                bill = bill * 0.85;
            } else {
                System.out.println("Corporate tier is not Platinum.");
            }

        } else {
            System.out.println("Amount is not greater than ₹50,000.");
        }

        return bill;
    }
}

