import java.util.HashSet;

/**
 * Created by ewcia on 01.04.17.
 */
public class OddOccurrenceslnArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<A.length;i++){
            if(set.contains(A[i])){
                set.remove(A[i]);
            }else{
                set.add(A[i]);
            }
        }
        int n=0;
        for (int i: set){
            n=i;
        }
        return n;
    }
}
