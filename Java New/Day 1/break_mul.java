import java.util.*;
public class break_mul {
    
    public static void main(String[] args) {
        Scanner sc 45= new Scanner (System.in);
        do{
             System.out.print("Enter your number");
            int num = sc.nextInt();
            if (num%10==0) {
                break;   
            }

            System.out.println(num);



        }  while(true);
    }
}
