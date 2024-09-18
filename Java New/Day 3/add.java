import java.util.*;
public class add {


    public static int addNum (int x,int y){
        int sum =x+y;

        return sum;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();

       System.out.println("sum="+addNum(a,b));

    }
}