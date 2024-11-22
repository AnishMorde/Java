
public class finally_block {

    public static void main(String[] args) {
        int ar[]= new int[5];

        try{
            System.out.println(ar[10]);
        }catch(Exception e){
            System.out.println("Exception handeled");
        }finally{
            System.out.println("I will always run");
        }
    }

}
