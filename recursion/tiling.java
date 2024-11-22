public class tiling {

    public static int noWays(int n){
        if(n==1 || n==0){
            return 1;
        }

        return  noWays(n-1)+ noWays(n-2);
    }
    public static void main(String[] args) {
       System.out.println( noWays(4));
    }
}
