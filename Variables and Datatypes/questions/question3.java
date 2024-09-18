/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total= pencil+pen+eraser;
        int  GST=(int)(Total*0.18f);

        
        System.out.println("The total bill is ="+Total+"Rs");
        System.out.println("GST 18% ="+GST+"Rs");
        System.out.println("Bill after GST 18% ="+(Total+GST+"Rs"));



    }
    
}
