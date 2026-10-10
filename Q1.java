import java.util.Scanner;
abstract class Customer {
    double amount;
    Customer(double amount) { this.amount = amount; }
    abstract double finalAmount();
}
class StudentCustomer extends Customer {
    StudentCustomer(double amount) { super(amount); }
    double finalAmount() { return amount * 0.90; }
}
class StaffCustomer extends Customer {
    StaffCustomer(double amount) { super(amount); }
    double finalAmount() { return amount * 0.95; }
}
class GuestCustomer extends Customer {
    GuestCustomer(double amount) { super(amount); }
    double finalAmount() { return amount + 10; }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            double amount = Double.parseDouble(p[1]);
            Customer c;
            switch (p[0]) {
                case "STUDENT": c = new StudentCustomer(amount); break;
                case "STAFF": c = new StaffCustomer(amount); break;
                default: c = new GuestCustomer(amount);
            }
            double result = c.finalAmount();
            System.out.printf("%s: %.2f%n", p[0], result);
            total += result;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
