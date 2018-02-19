/**
 * Created by ewcia on 01.04.17.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length==0||A.length==1||K==0){
            return A;
        }else {
            int[] rotationA=new int[A.length];
            K=K%A.length;
            int indexOfA=rotationA.length-1-K;
            for(int i =rotationA.length-1; i>=0; i--){
                rotationA[i]=A[indexOfA];
                indexOfA--;
                if(indexOfA==-1){
                    indexOfA=rotationA.length-1;
                }
            }
            return rotationA;
        }
    }

}
