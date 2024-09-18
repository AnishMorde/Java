import java.util.*;
class linearSearch{
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5,6};
        ArrayList<Integer> ans = new ArrayList<>();
        findIndex(arr,6,0,ans);
        System.out.println(ans);
    }

    public static ArrayList<Integer> findIndex(int[]arr,int target , int index , ArrayList<Integer> ans){

        if(index==arr.length){
            return ans;
        }

        if(target==arr[index]){

            ans.add(index);

        }

        return findIndex(arr,target,index+1,ans);

    }
}