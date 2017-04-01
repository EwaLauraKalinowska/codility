import java.util.HashSet;

/**
 * Created by ewcia on 01.04.17.
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set=new HashSet<>();
        for(int i=1; i<=X; i++){
            set.add(i);
        }
        int i=0;
        while (i<A.length&&!set.isEmpty()){
            set.remove(A[i]);
            i++;
        }
        i--;
        if(set.isEmpty()){
            return i;
        }else{
            return -1;
        }
    }
}
