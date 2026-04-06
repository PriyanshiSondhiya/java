public class firstNLastOcc {
  public static void main (String args[]){
    int nums[] = {2, 7, 7, 8, 8, 10};
    int target = 8;

    int l = 0;
    int h = nums.length-1;
    int fo = -1, lo = -1;

    while(l <= h){
      int m = l + (h - l) / 2;
      if(nums[m] == target){
        fo = m;
        h = m - 1;
      }
      else if(nums[m] < target){
        l = m + 1;
      }
      else{
        h = m - 1;
      }
    }
    System.out.println(fo);

     l = 0;
     h = nums.length-1;

     while(l <= h){
      int m = l + ( h - l )/ 2;
      if(nums[m] == target){
        lo = m;
        l = m + 1;
      }
      else if (nums[m] > target){
        h = m - 1;
      }
      else{
        l = m + 1;
      }
     }
     System.out.println(lo);

     int count = lo - fo + 1;
     System.out.println(count);
  }

  
}
