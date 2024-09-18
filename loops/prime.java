import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if(n==2){
            System.out.println("The n is prime number");
        }
        else{
            Boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                   isPrime= false;
                }
               
          
            }
           if(isPrime==true){
            System.out.println("The n is prime number");
           }
           else{
            System.out.println("The n is not prime number");
           }
       
       
        }

       
        
    }
}
