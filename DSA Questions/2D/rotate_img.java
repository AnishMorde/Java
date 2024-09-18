public class rotate_img {

    public static void rotate(int matrix[][]){

        int n = matrix[0].length;
        for(int col=0;col<n;col++){
            int i=0;
            int j=n-1;

            while(i<=j){
                int temp = matrix [i][col];
                matrix[i][col]=matrix[j][col];
                matrix[j][col]=temp;

                i++;
                j--;
            }

        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }

    public static void display(int matrix [][]){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix  [][]={{1,2,3,4},
                          {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}


};

  rotate(matrix);
  display(matrix);  

}
    
}
