class three {
    public static void main(String args[]){
        int a=1;
        int b=2;
        boolean m=a>b;
        int val = m?1:0;
        switch(val){
            case 1:
                System.out.println("a is greater than b");
            case 0:
                System.out.println("b is greater than a");
            default:
                System.out.println("a is equal to b");
        }
    }
}
