public class singleElementInASortedArray {

    public static int singleNonDuplicate(int[] nums) {

        int st = 0;
        int high = nums.length - 1;

        while (st < high) {

            int mid = st + (high - st) / 2;

            // mid ko even banate hain
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                st = mid + 2;
            } 
            else {
                high = mid;
            }
        }

        return nums[st];
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,3,3,4,4,8,8};

        int ans = singleNonDuplicate(nums);

        System.out.println("Single element is: " + ans);
    }
}

