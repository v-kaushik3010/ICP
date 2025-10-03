import java.util.Arrays;

public class BoatstoSavePeople_881 {

    public static void main(String[] args) {
        BoatstoSavePeople_881 sol = new BoatstoSavePeople_881();
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(sol.numRescueBoats(people, limit));
    public int numRescueBoats(int[] people, int limit) {
    
    Arrays.sort(people);
    int count = 0;
    int i =0;
    int j = people.length -1;
    while(i <=j){
        if(people[i] + people[j] <= limit){
            count++;
            i++;
            j--;
        }else{
            count++; j--;
        }
    }return count;
    
    }
}
