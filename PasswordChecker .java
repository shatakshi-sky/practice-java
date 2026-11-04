import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (password.length() >= 8) {
            System.out.println("Password length is valid!");
        } else {
            System.out.println("Password is too short!");
        }

        sc.close();
    }
}
