import java.util.*;
public class caalculator{
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number=");
    float a=sc.nextInt();
    System.out.println("Enter Second number=");
    float b=sc.nextInt();
    System.out.println("Enter the operator");
    char operator = sc.next().charAt(0);
    switch(operator){
        case '+': System.out.println("Addition is ="+ a+b);
        break;
        case '*': System.out.println("multiplication ="+ a*b);
        break;
        case '/': System.out.println("division ="+ a/b);
        break;
        case '%': System.out.println("modulus="+ a%b);
        break;
        default:
        System.out.println("wrong choice");
        break;





    }



    }
}