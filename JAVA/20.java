import java.util.Scanner;

class twenty {
    public static void main(String[] args) {
        int num, den = 3;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        if (num % den == 0)
            System.out.println("\nIt is divisible by 3.");
        else
            System.out.println("\nIt is not divisible by 3.");
    }
}