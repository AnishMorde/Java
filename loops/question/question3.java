

import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int EvenSum=0;
        int OddSum=0;
        int choice;
        do{
            n=sc.nextInt();

            if(n%2==0){
                EvenSum+=n;
            }
            else{
               OddSum+=n;
            }
            System.out.println("Enter choice 1 for continue and 0 for stop");
            choice=sc.nextInt();
        }while(choice==1);

        System.out.println("EVENSUM ="+EvenSum);
        
        System.out.println("ODDSUM ="+OddSum);


    }
}
