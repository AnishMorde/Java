public class range_prime {
    public static boolean isPrime(int n){
      
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
                
            }

        }

        return true;
    }


     
    public static void main(String[] args) {
        System.err.println(isPrime(23));
    }
}
