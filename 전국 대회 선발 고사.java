import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> arrayList= new ArrayList<>();
        int[] pick = new int[3];
        for(int i=0; i<rank.length; i++){
            if (attendance[i] == true){
                arrayList.add(rank[i]);
            }
        }

        Collections.sort(arrayList);

        for(int i=0; i<3; i++){
            for(int j=0; j< rank.length; j++){
                 if (rank[j]==arrayList.get(i)){
                     pick[i] = j;
                 }
            }
        }

        answer = (10000*pick[0]) + (100*pick[1]) + pick[2];

        return answer;
    }
}
