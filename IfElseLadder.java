
public class IfElseLadder {
    public static void main(String[] args) {
        int age = 100;

        if (age >= 50) {
            System.out.println("You are aged");
        } else if (age >= 30) {
            System.out.println("You are middle aged");
        } else if (age >= 20) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a kid");
        }
    }
}
