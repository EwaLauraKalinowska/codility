/**
 * Created by ewcia on 25.04.17.
 */
public class MaxSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
       int maxSum=A[0];
       int maxSumPartial=A[0];
       for(int i=1; i<A.length; i++){
           maxSumPartial=Math.max(maxSumPartial+A[i], A[i]);
           maxSum=Math.max(maxSum, maxSumPartial);
       }

       return maxSum;
    }
}
