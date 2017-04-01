/**
 * Created by ewcia on 01.04.17.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int sum=0;
        for(int i=0; i<A.length; i++){
            sum=sum+A[i];
        }
        int sum2=0;
        int min=Integer.MAX_VALUE;
        int difference;
        for(int i=A.length-1; i>0; i--){
            sum=sum-A[i];
            sum2=sum2+A[i];
            difference=Math.abs(sum-sum2);
            if(difference<min){
                min=difference;
            }
        }
        return min;
    }
}
