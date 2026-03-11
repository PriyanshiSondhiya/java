public class searchInRotatedSortedArray {
  public static void main (String args[]){
    int nums[] = {6, 7, 1, 2, 3, 4, 5};
    int target = 4;

    int low = 0;
    int high = nums.length-1;
   // int mid = low + (high - low) / 2;
    while (low <= high){
     int mid = low + (high - low) / 2;
      if(nums[mid] == target){
        System.out.println(mid);
        return;
      }
      
      //rotated sorted array me ek part always sorted hoga array ka
      if(nums[low] <= nums[mid]){
        if(target >= nums[low] && target <= nums[mid]){
          high = mid - 1;
        }
        else{
          low = mid + 1;
        }
      }

      if(target >= nums[mid] && target <= nums[high]){
        low = mid + 1;
      }
      else{
        high = mid - 1;
      }
      
    }

    System.out.println("not found");
    
  }
}
