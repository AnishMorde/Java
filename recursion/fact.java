//factorial  calculate using the recursion 

public class fact {

    public static int fact_n(int n){
        if(n==1){
            return 1;
        }

        return n*fact_n(n-1);
    }

    public static void main(String[] args) {
        

       System.out.println(fact_n(5));

    }

   
    
}
