
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for find factorial=");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){

            fact*=i;

        }

        System.out.println("The factorial of num ="+ fact);
    }
}
