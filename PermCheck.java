import java.util.HashSet;


/**
 * Created by ewcia on 01.04.17.
 */
public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<A.length; i++){
            set.add(A[i]);
        }
        int isPermutation=1;
        for(int i=1; i<=A.length; i++){
            if(!set.contains(i)){
                isPermutation=0;
            }
        }
        return isPermutation;
    }

}
