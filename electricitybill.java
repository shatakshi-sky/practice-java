import java.util.Scanner;

class electricitybill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill;

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = units * 3;
        }
        else {
            bill = units * 5;
        }

        System.out.println("Total Bill: Rs. " + bill);

        sc.close();
    }
}
