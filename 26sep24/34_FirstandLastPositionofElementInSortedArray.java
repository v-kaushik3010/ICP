import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(sol.searchRange(nums, target)));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] =start;
        ans[1] =end;
        return ans;
    }

    int search (int[] nums, int target, boolean findStartindex){
        int ans = -1;
        int start = 0; 
        int end = nums.length-1;

        while(start <= end){
            int mid =start +(end-start)/2;
            if(target< nums[mid]){
                end =mid-1;
            }
            else if(target > nums[mid]){
                start =mid+1; 
            }
            else{
                ans = mid; 
                if(findStartindex){
                    end= mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
            return ans;
        
    }
}
