/*Question 2 : Print out the sum of the numbers in the second row of the “nums" array.
Example :
Input - int nums = ( (1,4,9},(11,4,3},{2,2,3} };
Output - 18 */

public class quest_2 {

    public static int add(int matrix[][]){
        int sum=0,i=1;


        for(int j=0;j<matrix[0].length;j++ ){
            sum+=matrix[i][j];
        }

        return sum;
    }
    public static void main(String[] args) {

        int matrix [][]={{1,4,9},
                         { 11,4,3},
                         {2,2,3}
       };
          
      System.out.println( add(matrix));
        
    }
}
