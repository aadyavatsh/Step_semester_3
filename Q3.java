class PasswordChecker {
    private final String password;
    public PasswordChecker(String password) { this.password = password; }
    public String getStrength() {
        if (password.length() < 6) return "Weak";
        if (password.length() <= 9) return "Medium";
        return "Strong";
    }
}
public class Q3 {
    public static void main(String[] args) {
        System.out.println(new PasswordChecker("abcd").getStrength());
        System.out.println(new PasswordChecker("abcdefgh").getStrength());
        System.out.println(new PasswordChecker("abcdefghijkl").getStrength());
    }
}
