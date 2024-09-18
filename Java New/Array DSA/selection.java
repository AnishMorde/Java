class selection{


    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
           int minPos=i;

           for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }


           }

           int temp = arr[minPos];
           arr[minPos]=arr[i];
           arr[i]= temp;


        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,8,2,7,3};
        selection_sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}