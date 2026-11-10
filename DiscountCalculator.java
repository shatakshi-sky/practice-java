import java.util.Scanner;

class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double finalPrice = price - (price * discount / 100);

        System.out.println("Final Price = Rs. " + finalPrice);

        sc.close();
    }
}
