import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
abstract class Plan {
    abstract int validityDays();
    LocalDate renewalDate(LocalDate start) { return start.plusDays(validityDays()); }
}
class BasicPlan extends Plan { int validityDays() { return 30; } }
class StandardPlan extends Plan { int validityDays() { return 90; } }
class PremiumPlan extends Plan { int validityDays() { return 365; } }
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            Plan plan;
            switch (p[0]) {
                case "BASIC": plan = new BasicPlan(); break;
                case "STANDARD": plan = new StandardPlan(); break;
                default: plan = new PremiumPlan();
            }
            LocalDate start = LocalDate.parse(p[2], fmt);
            System.out.println(p[1] + ": " + plan.renewalDate(start).format(fmt));
        }
        sc.close();
    }
}
