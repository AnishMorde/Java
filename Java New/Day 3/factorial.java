public class factorial {

    public static int fact(int x){
        int ans =1;
        for(int i=1;i<=x;i++){
            
            ans =ans*i;
            
        }
        return ans;    //factorial of n
    }

    public static void binomial(int n,int r){
         int a=fact(n);
         int b=fact(r);
         int c=fact(n-r);
         int coe = a/(b*c);
         System.out.println("Binomial Coeffiecient = "+coe);
    }




    public static void main(String[] args) {
        int x=3;
       System.out.println( fact(x));
       binomial(5, 2); 
    }
    
}
