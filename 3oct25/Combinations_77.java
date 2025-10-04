import java.util.ArrayList;
import java.util.List;
public class Combinations_77 {
    public static void main(String[] args) {
        Combinations_77 obj = new Combinations_77();
        List<List<Integer>> result = obj.combine(4, 2);
        System.out.println(result);
    }

     public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        backtrack(1, res, comb, n, k);
        return res;
    }

    public static void backtrack(int start, List<List<Integer>> res, List<Integer> comb, int n, int k){
        if(comb.size() == k){
            res.add(new ArrayList<>(comb));
            return;
        }

        // for(int num = start; num <= n; num++){

        //     //include next elemen from nums
        //     comb.add(num);
        //     backtrack(num+1, res, comb, n, k);
        //     //exclude next element from nums
        //     comb.remove(comb.size()-1);
        //}

          //OR

        if(start > n) return;

        //include 
        comb.add(start);
        backtrack(start+1, res, comb, n, k);

        //exclude
        comb.remove(comb.size()-1);
        backtrack(start+1, res, comb, n, k);
        
    }
}
