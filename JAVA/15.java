import java.util.Scanner;

class fiftenn {
    public static void main(String[] args) {
        float fahrenheit, celsius;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Temperatur (in Fahrenheit): ");
        fahrenheit = scan.nextFloat();

        celsius = (float) ((fahrenheit - 32) / 1.8);

        System.out.println("\nEquivalent Temperature (in Celsius) = " + celsius);
    }
}