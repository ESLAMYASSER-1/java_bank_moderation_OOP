class seven {
    public static void main(String args[]){
        int a = 2;
        int b =2;
        boolean x = a==b;
        int m =x?1:0;
        switch(m){
            case(1):
                System.out.println(a);
                System.out.println(b);
                System.err.println("a is equal to b");
                break;
            case 0:
                System.out.println(a);
                System.out.println(b);
                System.err.println("a is not equal to b");
        }
    }
}
