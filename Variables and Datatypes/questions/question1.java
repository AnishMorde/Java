
/*In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.*/
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int total=(a+b+c);
        System.out.println("Average of 3 numbers="+total/3);



        
    }
}
