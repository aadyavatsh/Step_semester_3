import java.util.Scanner;
abstract class Vehicle {
    int hours;
    Vehicle(int hours) { this.hours = hours; }
    abstract double charge();
}
class Bike extends Vehicle {
    Bike(int h) { super(h); }
    double charge() { return hours * 10.0; }
}
class Car extends Vehicle {
    Car(int h) { super(h); }
    double charge() { return 30 + (hours - 1) * 20.0; }
}
class Truck extends Vehicle {
    Truck(int h) { super(h); }
    double charge() { return Math.max(100, hours * 50.0); }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            int hours = Integer.parseInt(p[1]);
            Vehicle v;
            switch (p[0]) {
                case "BIKE": v = new Bike(hours); break;
                case "CAR": v = new Car(hours); break;
                default: v = new Truck(hours);
            }
            double amount = v.charge();
            System.out.printf("%s: %.2f%n", p[0], amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
