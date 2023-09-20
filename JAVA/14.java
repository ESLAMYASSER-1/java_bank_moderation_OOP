import java.util.Scanner;

class fourteen {
    public static void main(String[] args) {
        int num, orig, rem, rev = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        num = scan.nextInt();

        orig = num;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        if (orig == rev)
            System.out.println("\nYes, the number is equal to its reverse.");
        else
            System.out.println("\nNo, the number is not equal to its reverse.");
    }
}