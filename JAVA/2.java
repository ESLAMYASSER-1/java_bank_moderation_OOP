import java.lang.System;
import java.lang.reflect.Array;
import java.util.Scanner;
class two{
    public static void main (String args[]) {
    System.out.println("Enter X, Y variables");
    Scanner one = new Scanner(System.in);
    int x =Integer.parseInt(one.nextLine());
    Scanner two =new Scanner(System.in);
    int y = Integer.parseInt(two.nextLine());
    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x/y);
}
}

