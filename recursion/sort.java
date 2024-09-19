//check is array is sort or not using the recursion 
public class sort {

    public static boolean isSorted(int num[], int  i){
        if(i+1==num.length){
            return true;
        }

       return  num[i]<=num[i+1] && isSorted(num, i+1);


    }
    public static void main(String[] args) {
        int num[] ={1,2,3,1,5,1};
        int i=0;
       System.out.println( isSorted(num , i));
    }
}
