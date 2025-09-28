import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(sol.findMinArrowShots(points));
    }
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));

        int prev = points[0][1];
        int arrow = 1;
        for(int i =1; i<points.length; i++){
            if(points[i][0]<=prev) continue;
            else{
                arrow++;
                prev= points[i][1];
            }
        }return arrow;
    }
}