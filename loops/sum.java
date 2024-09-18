import java.util.*;
public class sum {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range=");
        int n = sc.nextInt();
        while(i<=n){
            sum += i;
            i++;


        }

       System.out.println("Sum is = "+sum);
        
    }
}

