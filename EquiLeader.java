/**
 * Created by ewcia on 24.04.17.
 */
public class EquiLeader {
    public int solution(int[] A) {
        // write your code in Java SE 8

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
        int howManyLeader=0;
        for(int i=0; i<A.length; i++){
            if(A[i]==leader){
                howManyLeader++;
            }
        }
        int N=A.length;
        if(N%2==1){
            N--;
        }
        if(howManyLeader<=N/2+1) {
            return 0;
        }
        int howManyEquiLeaders=0;
        int leaderYet=0;
        for(int i=0; i<A.length; i++){
            if(A[i]==leader){
                leaderYet++;
            }
            if(leaderYet>(i+1)/2&&howManyLeader-leaderYet>(A.length-i-1)/2){
                howManyEquiLeaders++;
            }

        }
        return howManyEquiLeaders;
    }
}
