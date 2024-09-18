public class ceiling {

    static int ceil(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            if(target==arr[end]){
                return arr[0];
            }

            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid +1;
            }

            else if ( target < arr[mid]){
                end = mid-1;
            }


        }

        return arr[start];
    }
    public static void main(String[] args) {
      int [] arr = { 2,3,5,9,14,16,18};

      int target = 18;

      System.out.println(ceil(arr,target));
    }

}