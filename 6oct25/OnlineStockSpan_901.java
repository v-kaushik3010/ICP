import java.util.Stack;
public class OnlineStockSpan_901 {
    public static void main(String[] args) {
        StockSpanner obj = new StockSpanner();
        System.out.println(obj.next(100)); // return 1
        System.out.println(obj.next(80));  // return 1
        System.out.println(obj.next(60));  // return 1
        System.out.println(obj.next(70));  // return 2
        System.out.println(obj.next(60));  // return 1
        System.out.println(obj.next(75));  // return 4
        System.out.println(obj.next(85));  // return 6
    }
    
    
class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; // Add popped span
        }
        stack.push(new int[]{price, span}); // Store price and span
        return span;
    }
}
}
