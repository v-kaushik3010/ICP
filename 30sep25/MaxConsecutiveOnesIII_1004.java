public class MaxConsecutiveOnesIII_1004 {
    
    public static void main(String[] args) {
        MaxConsecutiveOnesIII_1004 obj = new MaxConsecutiveOnesIII_1004();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = obj.longestOnes(nums, k);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
    
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int ans=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }

            ans = Math.max(ans,right-left+1);
        }

        return ans;
    }
}
