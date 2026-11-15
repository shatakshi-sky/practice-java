import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        int fee;

        if (hours <= 2) {
            fee = 20;
        } else if (hours <= 5) {
            fee = 20 + (hours - 2) * 10;
        } else {
            fee = 50 + (hours - 5) * 15;
        }

        System.out.println("Total Parking Fee: Rs. " + fee);

        sc.close();
    }
}
