public class sum{
    public static void main(String[] args) {
        
        System.out.println(sum1(10,55));
        System.out.println(sum1(20,25,30));
    }

    static int sum1(int a, int b, int c){
        int sum=a+b+c;
        return sum;

    }

    static int  sum1(int a,int b){
        int sum =a+b;

        return sum;
       


    }
}