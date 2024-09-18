public class unary {
    public static void main(String[] args) {
        //pre-increment
        int a=10;
        int b=++a;
        System.out.println("The value of a="+a);
        System.out.println("The value of b after ++a="+b);


        //post-increment
        int x=10;
        int y=x++;
        System.out.println("The value of x="+x);
        System.out.println("The value of y after the x++="+y);

        //pre-decrement
        int z=20;
        int w=--z;
        System.out.println("The value of z="+z);
        System.out.println("The value of w after --z="+w);


        //post-decrement
        int h=20;
        int i=h--;
        System.out.println("The value of h="+h);
        System.out.println("The value of i after h--="+i);


        
    }
    
}
