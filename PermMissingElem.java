import java.util.HashSet;
//https://codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/

/**
 * Created by ewcia on 30.03.17.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int m=A.length;
        HashSet<Integer> set=new HashSet<>();
        m++;
        int k=0;
        for(int i=0; i<A.length; i++){
            set.add(A[i]);
        }
        for(int i=1; i<=m; i++){
            if(set.contains(i)){

            }else{
                k=i;
                return k;
            }
        }return k;
    }
}
