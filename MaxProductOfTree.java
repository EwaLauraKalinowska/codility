/**
 * Created by ewcia on 11.04.17.
 */
public class MaxProductOfTree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==3){
            return A[0]*A[1]*A[2];
        }
        int min1=0;
        int min2=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            if(A[i]>max3){
                if (A[i]>=max1){
                    max3=max2;
                    max2=max1;
                    max1=A[i];
                }else{
                    if(A[i]>=max2){
                        max3=max2;
                        max2=A[i];
                    }else{
                        max3=A[i];
                    }
                }
            }
                if(A[i]<min2){
                    if(A[i]<=min1){
                        min2=min1;
                        min1=A[i];
                    }else{
                        max2=A[i];
                    }
                }
            }


        if((max1*max2*max3)>(max1*min1*min2)){
            return max1*max2*max3;
        }else{
            return max1*min1*min2;
        }
    }
}
