import java.util.Scanner;

class twelve {
    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        ch = s.next().charAt(0);

        if ((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("\nIt is an Alphabet.");
        } else {
            System.out.println("\nIt is not an Alphabet.");
        }
    }
}