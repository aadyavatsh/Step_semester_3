import java.util.Scanner;
abstract class Room {
    int units;
    Room(int units) { this.units = units; }
    abstract double bill();
}
class SingleRoom extends Room {
    SingleRoom(int u) { super(u); }
    double bill() { return units * 8.0; }
}
class SharedRoom extends Room {
    int occupants;
    SharedRoom(int u, int occupants) { super(u); this.occupants = occupants; }
    double bill() { return units * 6.0 / occupants; }
}
class AcRoom extends Room {
    AcRoom(int u) { super(u); }
    double bill() { return units * 10.0 + 200; }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            int units = Integer.parseInt(p[1]);
            Room room;
            switch (p[0]) {
                case "SINGLE": room = new SingleRoom(units); break;
                case "SHARED": room = new SharedRoom(units, Integer.parseInt(p[2])); break;
                default: room = new AcRoom(units);
            }
            double amount = room.bill();
            System.out.printf("%s: %.2f%n", p[0], amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
