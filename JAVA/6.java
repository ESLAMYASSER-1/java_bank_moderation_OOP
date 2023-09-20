import java.util.Scanner;

class six {
    public static void main(String args[]){
        System.out.println("Enter day time: ");
        Scanner x =new Scanner(System.in);
        int x1= Integer.parseInt(x.nextLine());
        daytime(x1);
    }
    public static void daytime(int value){
        switch(value){
            case 1,2,3,4,5,6,7,8,9,10,11:
                System.out.println("it\'s morning");
                break;
            case 12,13,14,15,16,17,18:
                System.out.println("it\'s afternoon");
                break;
            default:
                System.out.println("it\'s evening");
                break;
        }
    }
}
