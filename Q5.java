class CompanyEmployee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;
    CompanyEmployee(String empName, double salary) {
        this.empName = empName; this.salary = salary; employeeCount++;
    }
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}
public class Q5 {
    public static void main(String[] args) {
        new CompanyEmployee("Asha", 45000);
        new CompanyEmployee("Ravi", 50000);
        new CompanyEmployee("Neha", 42000);
        CompanyEmployee.printCompanyInfo();
    }
}
