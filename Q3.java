class EmployeeProfile {
    String empId, empName;
    double salary;
    boolean isIntern;
    public EmployeeProfile(String empId, String empName, double salary) {
        this.empId = empId; this.empName = empName; this.salary = salary; this.isIntern = false;
    }
    public EmployeeProfile(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }
    public void printProfile() {
        System.out.println("ID: " + empId + " | Name: " + empName + " | Salary: " + salary + " | Intern: " + isIntern);
    }
}
public class Q3 {
    public static void main(String[] args) {
        new EmployeeProfile("E101","Asha",45000).printProfile();
        new EmployeeProfile("I201","Ravi").printProfile();
    }
}
