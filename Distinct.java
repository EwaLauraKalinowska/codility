import java.util.HashSet;

/**
 * Created by ewcia on 11.04.17.
 */
public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set=new HashSet<>();
        for (int i=0; i<A.length; i++){
            set.add(A[i]);
        }
        int distinctElements=set.size();
        return distinctElements;
    }
}
