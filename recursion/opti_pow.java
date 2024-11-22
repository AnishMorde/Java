public class opti_pow {

    public static int pow(int x , int n){
        if(n==0){
            return 1;
        }

        if(n%2==0){
            return pow(x*x,n/2);
        }

        return x*pow(x,n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
       System.out.println( pow(x,n));
       
    }
}
