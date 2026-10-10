import java.util.Scanner;
abstract class Worker {
    String name; double salary;
    Worker(String name, double salary) { this.name = name; this.salary = salary; }
    abstract double bonus();
}
class FullTime extends Worker {
    FullTime(String n, double s) { super(n,s); }
    double bonus() { return salary * 0.10; }
}
class PartTime extends Worker {
    PartTime(String n, double s) { super(n,s); }
    double bonus() { return salary * 0.05; }
}
class Intern extends Worker {
    Intern(String n, double s) { super(n,s); }
    double bonus() { return 2000; }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            double salary = Double.parseDouble(p[2]);
            Worker w;
            switch (p[0]) {
                case "FULLTIME": w = new FullTime(p[1], salary); break;
                case "PARTTIME": w = new PartTime(p[1], salary); break;
                default: w = new Intern(p[1], salary);
            }
            double amount = w.bonus();
            System.out.printf("%s: %.2f%n", w.name, amount);
            total += amount;
        }
        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}
