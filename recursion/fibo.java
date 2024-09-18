public class fibo {

    public static int fibo_n(int n) {
        if (n == 0 || n==1) {
            return n;
        }
        return fibo_n(n - 1) + fibo_n(n - 2 );
    }

    public static void main(String[] args) {
       System.out.println(fibo_n(5));
    }
}
