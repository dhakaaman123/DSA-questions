import java.util.*;

public class Selection {
    public int[] selectioSort(int[] nums){
        for(int i =0;i<nums.length-1;i++){
            int min = i;
            for(int j = i;j<nums.length;j++){
                if(nums[j]<nums[min]){
                min = j;
                }
            }
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] =  temp;
            }

        }
        return nums;
    }

    public static void main(String[] args){
        Selection SelectionSort =  new Selection();
        int[] nums = {64, 25,12,22,15,5,12};
        int [] sortedArray = SelectionSort.selectioSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
    
}
