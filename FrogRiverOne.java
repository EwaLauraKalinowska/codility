import java.util.HashSet;

/**
 * Created by ewcia on 01.04.17.
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> frogsDistance=new HashSet<>();
        for(int i=1; i<=X; i++){
            frogsDistance.add(i);
        }
        int i=0;
        while (i<A.length && !frogsDistance.isEmpty()){
            frogsDistance.remove(A[i]);
            i++;
        }
        i--;
        if(frogsDistance.isEmpty()){
            return i;
        }else{
            return -1;
        }
    }
}
