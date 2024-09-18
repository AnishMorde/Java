import java.util.Arrays;

public class stringSearch {

    public static boolean search(String str,char key){
        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){

            if(key==str.charAt(i)){
                return true;
            }

          

        }

        return false;
    }
    public static void main(String[] args) {
        String str= "anish";
        char key ='v';

        System.out.println(Arrays.toString(str.toCharArray()));

       System.out.println( search(str,key));


    }
}
