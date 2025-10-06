import java.util.Arrays;
public class UniquePaths_62 {
    public static void main(String[] args) {
        int m = 3, n = 7;
        UniquePaths_62 obj = new UniquePaths_62();
        System.out.println(obj.uniquePaths(m, n));
    }

    
        public int uniquePaths(int m, int n) {
        int board[][] = new int[m][n];

        int[][] dp = new int[m][n];
        for(int arr[] : dp){
            Arrays.fill(arr, -1);

        }

        return check(board, dp, 0, 0);
    }

    public static int check(int[][] board, int[][] dp, int i, int j){
        if(i<0 || i >= board.length || j < 0 || j >= board[0].length|| board[i][j] == 1){
            return 0;
        }
        if(i == board.length-1|| j == board[0].length-1) return 1;

        if(dp[i][j] != -1) return dp[i][j];

        board[i][j] = 1;
        int ans = 0;
        ans+=check(board, dp, i, j+1);
        ans+= check(board, dp, i+1, j);
        board[i][j] = 0;

        return dp[i][j]  = ans;
    }
}
