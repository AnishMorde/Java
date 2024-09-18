
//sum of the n natural numbers 

public class sum {

    public static int sum_n(int n){
        if(n==1){
            return 1 ;
        }

        return n+sum_n(n-1);
    }

    public static void main(String[] args) {
       System.out.println( sum_n(5));
    }
    
}
