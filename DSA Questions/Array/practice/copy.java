public class copy {

     public static void copyFrom(int arr1[]){
        int arr2 [] = new int [arr1.length];
        for(int i=0 ; i<arr1.length;i++){

            arr2[i]=arr1[i];

        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println( );

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }


     }

     
    public static void main(String[] args) {
        int arr1[]={12,3,4,5,5,6,6,6};

        copyFrom(arr1);
    }


    }
     
   