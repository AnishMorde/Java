

public class exception_2 {
    public static void main(String[] args) {
        System.out.println("Anish Morde");

        int arr[] = new int[5];

        try{
            int result  = 5/0;
            System.out.println(arr[9]);
        }catch(Exception e){
            System.out.println(" Error of exception ");
        }
        // }catch(ArrayIndexOutOfBoundsException | ArithmeticException | RuntimeException e){
        //     //catch the error in the catch block 
        //     System.out.println(" Error ");
        // }
      

    }
}
