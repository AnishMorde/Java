/*Question 3 : Write a program to Find Transpose of Matrix
What is Transpose? Transpose of a matrix is the process of swapping the rows to columns. 
For a 2x3 matrix,
Matrix
a11 a12 a13
a21 a22 a23
Transposed Matrix
a11 a21
a12 a22
a13 a23
 */

public class ques_3 {

    public static void change(int matrix[][]){
        int transpose [][]=new int [3][2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             transpose [j][i] = matrix[i][j];
            }
        }
 
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){

                System.out.print(transpose[i][j]+" ");

            }
            System.out.println( );
    }


}

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},

        };

        change(matrix);
    }


    
}
