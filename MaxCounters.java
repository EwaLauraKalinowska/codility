/**
 * Created by ewcia on 01.04.17.
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {

            // write your code in Java SE 8
            int[] tab=new int[N];
            int max=0;
            int min=0;
            for(int i=0; i<A.length; i++){
                if(A[i]>N){
                    min=max;
                }else{
                    if(tab[A[i]-1] <min){
                        tab[A[i]-1]=min+1;
                    }else{
                        tab[A[i]-1]++;}
                    if(tab[A[i]-1]>max){
                        max=tab[A[i]-1];
                    }
                }
            }

            for(int i=0; i<N; i++){
                if(tab[i]<min){
                    tab[i]=min;
                }
            }
            return tab;
        }
    }



