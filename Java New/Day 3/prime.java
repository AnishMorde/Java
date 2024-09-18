public class prime {

    public static boolean isPrime(int n){

        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
            return true;
    }

    public static void Range(int x){
        for(int i=2;i<=x;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }

       
    }



    public static void main(String[] args) {
        
      int n=20;
      Range(n);
        
    }
}
