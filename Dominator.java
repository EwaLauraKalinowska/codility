/**
 * Created by ewcia on 21.04.17.
 */
public class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0){
            return -1;
        }
        if(A.length==1){
            return 0;
        }
        int leader=A[0];
        int itIsLeader=1;
        for(int i=1; i<A.length; i++){
            if(leader==A[i]){
                itIsLeader++;
            }else{
                    itIsLeader--;
                if(itIsLeader==-1){
                    leader=A[i];
                    itIsLeader=1;
                }
            }
        }
        int leaderPosition=-1;
        int howManyLeader=0;
        for(int i=0; i<A.length; i++){
            if(A[i]==leader){
                howManyLeader++;
                leaderPosition=i;
            }
        }

        if(howManyLeader>A.length/2) {
            return leaderPosition;
        }else {
            return -1;
        }
    }
}