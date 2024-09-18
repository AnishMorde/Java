class linear {

    public static boolean search(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 18,12,9,14,77,50};

       System.out.println( search(arr,99));
    }
}