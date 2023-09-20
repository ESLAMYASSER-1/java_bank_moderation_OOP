import java.util.Scanner;

class twentyone {
    public static void main(String[] args) {
        float[] marks = new float[8];
        float sum = 0, avg, perc;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks Obtained in 8 Subjects: ");
        for (i = 0; i < 8; i++)
            marks[i] = scan.nextFloat();

        for (i = 0; i < 8; i++)
            sum = sum + marks[i];

        avg = sum / 8;
        perc = avg;
        System.out.println("\nAverage Mark = " + avg);
        System.out.println("Percentage Mark = " + perc + "%");
    }
}