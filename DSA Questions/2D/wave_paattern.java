 //print pattern in the wave fashion 


 
 class wave_paattern{

    public static void wave (int matrix [][]){

        //for column 

        for(int i =0;i<matrix[0].length;i++){

             //for the row elements 
            for(int j=0;j<matrix.length;j++){
                //print the pattern
                System.out.print(matrix[j][i]+" ");
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

        wave(matrix);
    }
 }