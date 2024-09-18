import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your num1=");
        float num1 = sc.nextInt();
        System.out.print("Enter your num2=");
          float num2 = sc.nextInt();
        System.out.print("Enter your operartor=");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("Addition ="+(num1+num2));
                       break;
            case '-' : System.out.println("Subtraction ="+(num1-num2));
                       break; 
            case '/' : System.out.println("division ="+(num1/num2));
                       break;
           case '*' : System.out.println("multiplication ="+(num1*num2));
                       break; 
            case '%' : System.out.println("modulo ="+(num1%num2));
                       break; 
            default:  System.out.println("wrong choice");
                                                                
        }



        
    }
    
}
