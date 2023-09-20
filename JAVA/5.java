import java.util.Scanner;

class five {
    public static void main(String args[]){
        System.out.println("Enter pridge length in meter");
        Scanner one = new Scanner(System.in);
        double L = Double.parseDouble(one.nextLine());
        System.out.println("Enter velosity in metter per second");
        Scanner two = new Scanner(System.in);
        double a = Double.parseDouble(two.nextLine());
        System.out.println("Enter time in minutes");
        Scanner three = new Scanner(System.in);
        double t = Double.parseDouble(three.nextLine());
        double totaldistance = a*t*60;
        System.out.println("Total distance is: "+totaldistance+" metter");
        double rounds = (totaldistance/L)/2;
        System.out.println("Number of rounds equal= "+rounds +" rounds");
    }
}
