import java.util.*;

public class Bubble {
    public int[] bubbleSort(int[] nums){
        int n = nums.length;
     
        for(int i = n-1;i>=1;i--){
               int isSorted =0;
               for(int j =0;j<i;j++){
                 if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSorted =1;
                 }
               }
               if(isSorted ==0){
                break;
               }



        } 
        return nums;
    }

    public static void main(String[] args){
        Bubble bubbleSort = new Bubble();
        int[] nums ={65,25,12,22,15,5,12};
        int [] sortedArray = bubbleSort.bubbleSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
    
}
