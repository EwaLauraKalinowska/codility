/**
 * Created by ewcia on 25.04.17.
 */
public class MaxProfit {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0||A.length==1){
            return 0;
        }
        int min=Math.min(A[0], A[1]);
        int maxProfit=A[1]-A[0];
        int difference=A[1]-A[0];
        for(int i=2; i<A.length; i++){
            difference=A[i]-min;
            maxProfit=Math.max(maxProfit, difference);
            if(A[i]<min){
                min=A[i];
            }
        }
        if(maxProfit<0){
            return 0;
        }
        return maxProfit;
    }
}
