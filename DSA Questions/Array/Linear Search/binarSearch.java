public class binarSearch {

    public static int search(int arr[],int target){

        int start =0;
        int end = arr.length -1 ;

        if(arr[start]< arr[end]){

            while(start<=end){
                int mid = start + (end-start)/2;
    
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }

        }

        else{
            while(start<=end){
                int mid = start + (end-start)/2;
    
                if(target > arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
        }

       
     
        return -1;

    }
     public static void main(String[] args) {
        int[] arr ={ 10,11,12,13,14,15,16,17};
        int[] arr1 ={ 18,17,16,15,14,13,11,10};

        int target=15;

       System.out.println( search(arr1,target));
     }
}
