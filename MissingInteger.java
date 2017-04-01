import java.util.HashSet;

/**
 * Created by ewcia on 01.04.17.
 */
public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<A.length; i++){
            set.add(A[i]);
        }
        int min=1;
        boolean firstInteger=true;
        while (firstInteger){
            if(set.contains(min)){
                min++;
            }else{
                firstInteger=false;
            }
        }
        return min;
    }
}
