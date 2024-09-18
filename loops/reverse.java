public class reverse {
    public static void main(String[] args) {
        int n=123456789;
        while(n>0){
            int LastDigit=n%10;
            System.out.print(LastDigit);
            n=n/10;
        }



    }
}
