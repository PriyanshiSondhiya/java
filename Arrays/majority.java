public class majority {
    public static int majorityElement(int[] nums) {
        int count = 0;
         int ans=0;
        for(int i=0; i<nums.length; i++){
           
            if(count == 0){
                count = 1;
                ans = nums[i];
            }
            else if(nums[i] == ans){
                count++;
            }
            else{
                count--;
            }
            // return ans;
        }
        // int cnt1 = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == ans){
        //         cnt1++;
        //     }
        //     if(cnt1 > nums.length/2)return ans;
        // }
        return ans;
    }

    public static void main (String args[]){
      int nums[]={1, 2, 2, 2, 2, 2, 2, 3, 4, 2};
      System.out.println(majorityElement(nums));
    }
}

