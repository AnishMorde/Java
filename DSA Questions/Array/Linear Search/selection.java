import java.util.Arrays;

public class selection {

    public static void select(int [] arr){
        for(int i=0;i< arr.length;i++){
            int last = arr.length-i-1;
            int MaxIndex = getMaxIndex(arr,0,last);
             swap(arr,MaxIndex,last);
        }
    }
      public static void swap(int [] arr,int maxIndex,int last){

        int temp= arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;

 }
    public static int getMaxIndex(int arr[],int start,int last){
        int max = start;
        for(int i=0;i<=last;i++){

            if(arr[max] < arr[i]){
                max=i;
            }

        }
        return max;
    }



    
    public static void main(String[] args) {
        int [] arr ={ 3,6,3,2,6,7,78,1,0};

        select(arr);
        System.out.println(Arrays.toString(arr));

    }
}
