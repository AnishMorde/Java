public class minMax {

    static int min(int arr[]){

        int min = arr[0];

        for(int i=0;i<arr.length;i++){

            if(min>arr[i]){
                min=arr[i];
            }

        }

        return min;
    }

    static int max (int arr[]){
        int max = arr[0];

        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr ={ 10,40,45,784,843,8646,8595,222,3,84,2,526,33,84,83,623,7,226};

      System.out.println(  min(arr));
      System.out.println(max(arr));
        
    }
}
