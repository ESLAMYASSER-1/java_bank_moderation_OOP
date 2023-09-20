import java.lang.System;
import java.lang.reflect.Array;
import java.util.Scanner;
class one{
    public static void main (String args[]){
        System.out.println("Enter friend seperated by\",\"");
        Scanner name =new Scanner(System.in);
        String names = name.nextLine();
        String[] arr= null;
        arr=names.split(",");
        int i =0;
        for (String string : arr) {
            String string1 =string.trim();
            if(i==0){
                System.out.println("Your first friend name is: "+string1);
            }
            else if(i==1){
                System.out.println("Your second friend name is: "+string1);
            }
            else if(i==2){
                System.out.println("Your third friend name is: "+string1);
            }
            else{
                int x=i+1;
                System.out.println("Your {"+ x +"}th friend name is: "+ string1);
            }
            i++;
        }
        }
}