/**
 * Created by ewcia on 01.04.17.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length==0||A.length==1||K==0){
            return A;
        }else {
            int[] B=new int[A.length];
            K=K%A.length;
            int p=B.length-1-K;
            for(int i =B.length-1; i>=0; i--){
                B[i]=A[p];
                p--;
                if(p==-1){
                    p=B.length-1;
                }
            }
            return B;
        }
    }

}
