import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] intervals = {{1,3},{2,4},{5,7},{6,8}};
        System.out.println(sol.eraseOverlapIntervals(intervals));
    }
      public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));

        int prev= intervals[0][1];
        int out = 0;
        for(int i =1; i< intervals.length; i++){
            if(intervals[i][0] < prev){
                out++;
            }
            else{
                prev= intervals[i][1];
            }
        }return out;
    }
}