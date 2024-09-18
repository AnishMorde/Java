public class prinem {
    public static void main(String[] args) {
        int n=33;
        boolean isPrime = true;
         if(n==2){
            System.out.println("Prime");
         }

         else{
            for(int i =2;i<n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
               
            }

            if(isPrime==true){
                System.out.println("prime");
            }
            else{
                System.out.println(" not prime");
            }
         }
        
    }
}
