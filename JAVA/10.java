import java.util.Scanner;

class ten {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("\nIt is an Even Number.");
        } else {
            System.out.println("\nIt is an Odd Number.");
        }
    }
}