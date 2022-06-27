import java.util.ArrayList;
import java.util.Arrays;

//645. Set Mismatch

public class SetMatch {
    public static void main(String[] args) {
        int [] arr = {2,3,2};
        int []ans =findErrorNums(arr);      //after sorting [2,2,3]
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
        int index=0 ;
        while(index<nums.length){
            if(nums[index]!=index+1 && nums[index]!=nums[nums[index]-1]){
                swap(nums,index,nums[index]-1);
            }else{
                index++;
            }
        }

        //now search the odd or Duplicate element

        for(int i=0;i< nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
//                ans[0]= i;
//                ans[1] = i+1;
            }
        }
        return new int[]{-1};

    }
    public static void swap(int [] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
