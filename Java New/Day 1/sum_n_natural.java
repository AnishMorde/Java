//sum of n natural numbers 
import java.util.*;
public class sum_n_natural {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
           
        }
        System.out.println("Sum="+ sum);
    }
    
}
