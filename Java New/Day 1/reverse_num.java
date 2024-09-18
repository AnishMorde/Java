public class reverse_num {
    public static void main(String[] args) {
        int num=36746362;
        int reverse=0;

        while(num>0){
             reverse = num%10;
             System.out.print(reverse);
            num=num/10;
        }
      
       
    }


}
