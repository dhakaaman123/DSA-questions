import java.util.*;
public class merge {
public void merge(int[] nums,int left,int mid,int high){
     List<Integer> arr = new ArrayList<>();
     int i = left;
     int j = mid+1;
     while(i<=mid && j<=high){
        if(nums[i]<=nums[j]){
           arr.add(nums[i]);
           i++;
        }
        else{
            arr.add(nums[j]);
            j++;
        }
     }
     while(i<=mid){
        arr.add(nums[i]);
        i++;
     }
     while(j<=high){
        arr.add(nums[j]);
        j++;
     }
      for(int k =left;k<=high;k++){
        nums[k] = arr.get(k-left);


      }
}

    public void mergeSortHelper(int[] nums,int left,int high){
        if(left>=high){
            return;
        }
        int mid =(left+high)/2;
        mergeSortHelper(nums,left,mid);
        mergeSortHelper(nums,mid+1,high);
        merge(nums,left,mid,high);
    }

    public int[] mergeSort(int[] nums){
        int n = nums.length;
        mergeSortHelper(nums,0,n-1);
        return nums;


    }
    public static void main(String[] args){
        int [] arr = {8,2,9,2,35,1,5,13,5,3,5,1};
        merge sol = new merge();
       sol.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
