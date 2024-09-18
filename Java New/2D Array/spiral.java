public class spiral {

    public static void printSpiral(int matrix[][]){
        int startCol=0;
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;

        while(startCol<endCol && startRow<endCol){
            //top
            for(int i=0;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
             //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }

            //bottom

            for(int i=endCol-1;i>=startCol;i--){
                System.out.print(matrix[endRow][i]+" ");
                if(startRow==endRow){
                    break;
                }
            }

            for(int j=endRow-1;j>startRow+1;j--){
                System.out.print(matrix[j][startCol]+" ");
                if(startCol==endCol){
                    break;
                }
            }

         startCol++;
         startRow++;
         endCol--;
         endRow--;


        }


    }
    public static void main(String[] args) {
        int matrix [][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}

        };

        printSpiral(matrix);
    }
}
