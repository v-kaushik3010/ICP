public class Search2DMatrix_74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(new Search2DMatrix_74().searchMatrix(matrix,target));
    }    


    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int row =0; row<matrix.length;row++){
            if(matrix[row][matrix[row].length -1] < target) continue;

            else{
                int start = 0;
                int end = matrix[row].length -1;
                int  mid = (start+end)/2;

                while(start <= end){
                mid = (start+end)/2;
                if(matrix[row][mid]==target) return true;
                else if(target > matrix[row][mid]) start= mid+1;
                else end = mid -1;
                }
            }
        }return false;
    }
}
