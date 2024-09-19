public class first_occurence {
    public static int occur(int arr[], int key, int i) {

        if(i==arr.length){
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return occur(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 4, 5, 1 };
        int key = 55;
        int i = 0;

        System.out.println(occur(arr, key, i));
    }
}
