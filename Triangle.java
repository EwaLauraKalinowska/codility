import java.util.Arrays;

/**
 * Created by ewcia on 11.04.17.
 */
public class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length<3){
            return 0;
        }else {
         Arrays.sort(A);
         for(int i=1; i<A.length-1; i++){
             if((A[i-1]+A[i])>A[i+1]){
                 return 1;
             }
             if(A[A.length-3]+A[A.length-2]<0){
                 if(A[A.length-3]>0){
                     return 1;
                 }
             }
         }

        }
        return 0;
    }
}
