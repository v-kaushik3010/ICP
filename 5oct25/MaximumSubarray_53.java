public class MaximumSubarray_53 {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int  max = nums[0], curr = 0;

        for(int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max = curr > max ? curr : max;
            if(curr < 0) curr = 0;
        }

        return max;
    }
}
