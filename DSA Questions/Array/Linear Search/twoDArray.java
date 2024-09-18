import java.util.Arrays;

public class twoDArray {
  static int[] search(int [][] arr, int key){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==key){
                return new int []{i,j};
            }
        }
    }

       return new int[]{-1,1};
  }


    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6},
                       {7,8,9},
                       {10,12,13,14}
                    };

          
     System.out.println( Arrays.toString(search(arr,13)) );
     
    }
    
}
