import java.util.Scanner;

class CodesCracker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Rows (Line): ");
        int row = s.nextInt();
        System.out.print("Enter the Character to Form Pyramid: ");
        char ch = s.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int space = i; space < row; space++)
                System.out.print(" ");
            for (int j = 0; j < (i + 1); j++)
                System.out.print(ch + " ");
            System.out.print("\n");
        }
    }
}