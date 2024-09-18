import java.util.*;

public class num_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        int originalNum = num1;
        int reversedNum = 0;

        while (num1 > 0) {
            int digit = num1 % 10;
            reversedNum = reversedNum * 10 + digit;
            num1 = num1 / 10;
        }

        if (originalNum == reversedNum) {
            System.out.println("The given number is a palindrome.");
        } else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
