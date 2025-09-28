public class ValidPerfectSquare_347 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));

    } 

    public static boolean isPerfectSquare(int num) {
     
      int low=1, high= num;
      while(low<= high){
         int mid= (low + high)/2;
        if((long)mid* mid== num) return true;
        else if((long)mid* mid > num) high= mid-1;
        else  low= mid +1;
      }
      return false;
    }
}
