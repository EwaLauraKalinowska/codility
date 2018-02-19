import java.util.Stack;

/**
 * Created by ewcia on 08.04.17.
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> fishMovingUpstream=new Stack<>();
        int liveFish=0;
        int j=0;
        if(A.length==1){
            return 1;
        }
        if (A.length==2){
            if(B[0]==B[1]||B[0]==0){
                return 2;
            }else {
                return 1;
            }
        }
        while (B[j]==0){
            j++;
            liveFish++;
        }
        for(int i=j; i<B.length; i++){
            if(B[i]==1){
                fishMovingUpstream.push(A[i]);
            }else{
                while (!fishMovingUpstream.isEmpty()&&fishMovingUpstream.peek()<A[i]){
                    fishMovingUpstream.pop();
                }
                if (fishMovingUpstream.isEmpty()){
                    liveFish++;
                }
            }
        }
        while (!fishMovingUpstream.isEmpty()){
            liveFish++;
            fishMovingUpstream.pop();
        }
        return liveFish;
    }
}
