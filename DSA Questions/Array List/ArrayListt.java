import java.util.*;

class ArrayListt{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <> ();

        Scanner sc =new Scanner (System.in);

       
        list.add(10);
        list.add(103);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(120);
        list.add(156550);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(150);
        list.add(10);

        list.add(10);

        list.set(0,99);

        list.remove(6);

        for(int i=0;i<5;i++){

            list.add(sc.nextInt());

        }

        System.out.print(list);
    }
}