class four{
    public static void main(String args[]){
        System.out.println(pwrnum(2, 5));
    }
    static int pwrnum(int x,int y){
        int result=1;
        for(int i = 0;i<y;i++){
            result = result *x;
        }
        return result;
    }
}