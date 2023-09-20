import java.util.Scanner;

class twentynine {
    public static void main(String[] args) {
        char chUpper, chLower;
        int ascii;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character in Uppercase: ");
        chUpper = scan.next().charAt(0);

        ascii = chUpper;
        ascii = ascii + 32;
        chLower = (char) ascii;

        System.out.println("\nEquivalent Character in Lowercase = " + chLower);
    }
}