

public class hello {
    public static void main(String[] args) {
        System.out.println("Anish Morde");

        int arr[] = new int[5];

        try{
            int result  = 5/0;
            System.out.println(arr[9]);
        }catch(ArrayIndexOutOfBoundsException e){
            //catch the error in the catch block 
            System.out.println(" tried to access the the out of the bound elements ");
        }catch(ArithmeticException e){
            System.out.println( e.getStackTrace());
            System.out.println( e );
            System.out.println( e.getMessage());
        }

      

    }
}
