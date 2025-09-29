import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new SpiralMatrix_54().spiralOrder(matrix));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        if(matrix.length ==0) return list;
        int minr = 0, maxr = matrix.length-1;
        int minc = 0, maxc = matrix[0].length-1;

        while(minr <= maxr && minc <= maxc){
            for(int i = minc; i <= maxc; i++){
                list.add(matrix[minr][i]);
            }minr++;

            if(minr <= maxr){
                for(int i = minr; i<=maxr; i++){
                    list.add(matrix[i][maxc]);
                }maxc--;
            }

            if(minr <= maxr){
                for(int i = maxc; i>=minc; i--){
                    list.add(matrix[maxr][i]);
                }maxr--;
            }

            if(minc <= maxc){
                for(int i =maxr; i>= minr; i--){
                    list.add(matrix[i][minc]);
                }minc++;
            }
        }return list;
    }
}
